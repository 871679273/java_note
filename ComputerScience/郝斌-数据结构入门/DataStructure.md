## 数据结构概述

### 定义

- 我们如何把现实中大量而复杂的问题以特定的数据类型和特定的存储结构保存到主存储器（内存）中，以及在此基础上为实现某个功能（比如查找某个元素，删除某个元素，对所有元素进行排序）而执行的相应操作，这个相应操作也叫算法。
- 数据结构 = 个体的存储 + 个体的关系的存储
- 从某个角度而言，数据的存储最核心的就是个体关系的存储，个体的存储可以忽略不计
- 算法 = 对存储数据的操作

### 算法

- 解题的方法和步骤
- 衡量算法的标准
  - 时间复杂度：大概程序要执行的次数，而非执行的时间
  - 空间复杂度：算法执行过程中大概所占用的最大内存
  - 难易程度
  - 健壮性

### 数据结构的地位

- 数据结构是软件中最核心的课程

- 程序 = 数据的存储 + 数据的操作 + 可以被计算机执行的语言

### 预备知识

- 指针

  - 指针的重要性
    - 指针是C语言的灵魂

   - 定义
      - 地址：
        	- 内存单元的编号
        	- 从0开始的非负整数
        	- 范围：0——FFFFFFFF【0~4G-1】
      - 指针：
        	- 指针就是地址，地址就是指针
        	- 指针变量是存放内存单元地址的变量
        	- 指针的本质是一个操作受限的非负整数
   - 分类
     1. 基本类型的指针
     2. 指针和数组的关系

- 结构体

  - 为什么会出现结构体

    - 为了表示一些复杂的数据，而普通的基本类型变量无法满足要求

  - 什么叫结构体

    - 结构体是用户根据实际需要自己定义的复合数据类型

  - 如何使用结构体

    - 两种方式

      struct Student st = {1000,"zhangsan",20};

      struct Studdent * pst = &st;

      1.  st.sid

      2. pst->sid

         pst所指向的结构体变量中的sid这个成员

  - 注意事项

    - 结构体变量不能加减乘除，但可以相互赋值
    - 普通结构体变量和结构体指针变量作为函数传参的问题

- 动态内存的分配和释放

## 模块一：线性结构

线性结构：把所有的结点用一根直线穿起来

### 连续存储[数组]

1. 什么叫数组

   - 元素类型相同，大小相等
   - 首地址+长度+有效个数

2. 数组的优缺点：

   - 优点：存取速度很快
   - 缺点：
     - 事先必须知道数组的长度
     - 需要大块连续的内存块
     - 插入删除元素的效率低
     - 空间通常是有限制的

### 离散存储[链表]

- 优缺点

  - 优点：
    - 空间没有限制
    - 插入删除元素很快
  - 缺点：
    - 存取速度很慢
  
- 定义：

  - n个节点离散分配
  - 彼此通过指针相连
  - 每个节点只有一个前驱节点，每个节点只有一个后续节点
  - 首节点没有前驱几点 尾节点没有后续节点
  - 专业术语：
    - 首节点：第一个有效节点
    - 尾节点：最后一个有效节点
    - 头结点：第一个有效节点之前的那个节点、头结点并不存放有效数据、加头结点的目的主要是为了方便对链表的操作、头结点的数据类型和首节点类型一样
    - 头指针：指向头结点的指针变量
    - 尾指针：指向尾节点的指针变量
  - 如果希望通过一个函数来对链表进行处理，我们至少需要接受链表的那些参数：
    - 只需要一个头指针：因为我们通过头指针可以推算出链表的其他所有信息

- 分类：

  - 单链表
  - 双链表
    - 每一个节点有两个指针域
  - 循环链表
    - 能通过任何一个节点找到其他所有的结点
  - 非循环链表

- 算法：

  狭义的算法是与数据的存储方式密切相关的<br>

  广义的算法是与数据的存储方式无关的<br>

  泛型：<br>

  ​		利用某种技术达到的效果就是：不同的存储方式，执行的操作时一样的<br>

  ​		同一种逻辑结构，无论该逻辑结构的物理存储是什么样子的，我们都可以对它执行相同的操作
  
  - 遍历
  - 查找
  - 清空
  - 销毁
  - 求长度
  - 排序
  - 删除节点
  - 插入节点

### 线性结构的两种常见应用之一 栈

#### 定义

- 一种可以实现“先进后出”的存储结构
- 栈类似于箱子

#### 分类

- 静态栈
- 动态栈

#### 算法

- 出栈
- 压栈

#### 应用

- 函数调用
- 中断
- 表达式求值
- 内存分配
- 缓冲处理
- 迷宫

### 线性结构的两种常见应用之二 队列

#### 定义

- 一种可以实现“先进先出”的存储结构

#### 分类

- 链式队列 —— 用链表实现
- 静态队列 —— 用数组实现
  - 静态队列通常都必须是循环队列
  - 循环队列：
    - 1.静态队列为什么必须是循环队列

    - 2.循环队列需要几个参数来确定

      - 两个：front、rear

    - 3.循环队列各个参数的含义

      1. 队列初始化：

         front和rear的值都是零

      2. 队列非空

         front代表的是队列的第一个元素，rear代表的是最后一个有效元素的下一个

      3. 队列空

         front和rear的值相等，但不一定是零

    - 4.循环队列入队伪算法

      - 两步完成：

        1. 将值存入r所代表的位置

        2. 错误的写法r=r+1

           正确的写法是：r=(r+1)%数组的长度

    - 5.循环队列出队伪算法 

      - f=(f+1)%数组的长度

    - 6.如何判断循环队列是否为空

      - 如果front与rear的值相等，则该队列就一定为空 

    - 7.如何判断循环队列是否已满

      - 预备知识：

        - front的值可能比rear大，front的值也可能比rear小，也可能相等

      - 两种方式：

        1. 多增加一个标识参数（不用这种方法）

        2. 少用一个元素（通常使用此方法）：

           (r+1)%数组长度==f，则已满

#### 算法

- 入队
- 出队

#### 队列的具体应用

- 所有和时间有关的操作都与队列有关

### 专题：递归

#### 定义：

一个函数自己直接或间接调用自己 <br>

递归要满足的三个条件

1. 递归必须得有一个明确的终止条件
2. 该函数所处理的数据规模必须在递减
3. 这个转化必须是可解的

#### 循环和递归

- 递归：
  - 易于理解
  - 速度慢
  - 存储空间大
- 循环
  - 不易理解
  - 速度快
  - 存储空间小

#### 举例

##### 1.求阶乘

##### 2.1+2+3+4+...+100的和

##### 3.汉诺塔

##### 4.走迷宫

#### 递归的应用：

- 树和森林就是以递归的方式定义的，
- 树和图的很多算法都是以递归来实现的
- 很多数学公式就是以递归的方式定义的 

## 模块二：非线性结构

### 树

#### 树定义

- 专业定义：
  1. 有且只有一个成为根的节点
  2. 有若干个互不相交的子树，这些子树本身也是一棵树
- 通俗定义：
  1. 树是由节点和指针组成
  2. 每个节点只有一个父节点但可以有多个子节点
  3. 但有一个节点例外，该节点没有父节点，此节点称为根节点
- 专业术语：
  - 节点、父节点、子节点、子孙、堂兄弟
  - 深度：从根节点到最底层节点的层数（根节点是第一层）
  - 叶子节点：没有子节点的节点
  - 非终端节点：实际就是非叶子节点
  - 度：子节点的个数成为度

#### 树分类

- 一般树
  - 任意一个节点的子节点的个数都不受限制
- 二叉树
  - 任意一个节点的子节点个数最多两个，且子节点的位置不可更改
  - 分类：
    - 一般二叉树
    - 满二叉树：在不增加树的层数的前提下，无法再多添加一个节点的二叉树就是满二叉树
    - 完全二叉树：如果只是删除了满二叉树最底层最右边的连续若干个节点，这样形成的二叉树就是完全二叉树
- 森林
  - n个互不相交的树的集合

#### 树的存储

##### 二叉树的存储

- 连续存储[完全二叉树]
  - 优点：查找某个节点的父节点和子节点（也包括判断有没有子节点）速度很快
  - 缺点：耗用内存空间过大
- 链式存储
  - 

##### 一般树的存储

- 双亲表示法
  - 求父节点方便
- 孩子表示法
  - 求求父节点方便方便
- 双亲孩子表示法
  - 求父节点子节点都方便
- 二叉树表示法
  - 把一个普通树转化成二叉树来存储
  - 具体转换方法：
    - 设法保证任意一个节点的：左指针域指向它的第一个孩子，右指针域指向他的下一个兄弟。
    - 只要能满足此条件，就额可以吧一个普通树转化为二叉树
    - 一个普通树转化成的二叉树一定没有右子树

##### 森林的存储

- 先把森林转化为二叉树，再存储二叉树。（多棵大树当做兄弟）

#### 树操作

- 遍历
  - 先序遍历
    - 先访问根节点
    - 再先序访问左子树
    - 再先序访问右子树
  - 中序遍历
    - 中序遍历左子树
    - 再访问根节点
    - 再中序遍历右子树
  - 后序遍历
    - 中序遍历左子树
    - 中序遍历右子树
    - 再访问根节点
- 已知两种遍历序列，求原始二叉树
  - 通过先序和中序 或者 中序和后序 我们可以还原出原始的二叉树
  - 但是通过先序和后序是无法还原出原始的二叉树的
  - 或者说，通过先序和中序或者通过中序和后序可以唯一的确定一个二叉树

#### 树的应用

- 树是数据库中数据组织一种重要形式
- 操作系统子父进程的关系本身就是一棵树
- 面向对象语言中类的继承关系
- 赫夫曼树

### 图

## 模块三：查找和排序

#### 折半查找

#### 排序：

- 冒泡
- 插入
- 选择
- 快速排序
- 归并排序

#### 排序和查找的关系

- 排序是查找的前提
- 排序时重点

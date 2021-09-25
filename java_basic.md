#### 简单的DOS命令

1.调出命令行：win+R,输入cmd<br>

2.cd .. （上一目录）<br>

3.cd [目录名] （change directory进入目录）<br>

4.d: （进入d盘）<br>

5.dir （directory展示当前目录里的内容）<br>

6.md （make directory创建）<br>

7.rd （remove directory删除）<br>

8.cls (clear screen清除屏幕)<br>

9.Tab键 帮助自动完成文件名或文件夹<br>

10.上下箭头键 展示之前或之后的命令<br>

<br>

#### HelloWorld

##### 1.写java文件

public class HelloWorld{<br>

&nbsp;&nbsp;&nbsp;&nbsp;public static void main(String [] args){<br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("hello菜鸟");<br>

&nbsp;&nbsp;&nbsp;&nbsp;}<br>

}

##### 2.编译

命令行中，进入所在目录：javac HelloWorld.java<br>

##### 3.执行（解释）

java HelloWorld.java<br>

<br>

#### 注释

1.单行注释：//<br>

2.多行注释：/* */<br>

3.文档注释：<br>

/**<br>

*第一行内容<br>

*第二行内容<br>

*/<br>

<br>

#### 反编译工具

class to java<br>

1.ide插件<br>

2.jd-gui.exe<br>

<br>

#### 标识符（命名规则）

##### 1.硬性规定：

1.开头必须是字母，或下划线，或$（不能是数字）<br>

2.其他部分必须是字母，数字，下划线，美元符号，不能有其他符号<br>

3.大小写敏感，长度无限制<br>

4.不能是java关键字<br>

##### 2.规范建议：

1.驼峰标识<br>

- 类名、接口：首字符大写
- 方法、变量：首字符小写

2.见名知意<br>

<br>

#### 字符集

<br>

#### JAVA基本数据类型

java是一种强类型语言：变量在定义时必须声明其类型

- 基本数据类型：

  四类八种

  1.数据型：整数类型（byte,short,int,long）、浮点类型（float,double）【范围不同】<br>

  2.字符型（char）<br>

  3.布尔型（boolean）：true,false <br>

- 引用数据类型：类（class）、接口（interface）、数组

- 详细：

  1.默认是int，使用long时要在数字后面加L：long a = 1111111111111111111L;<br>

  2.浮点类型会损失一定精度，float是七位，double是两倍精度<br>

  3.默认是double,一般都用double.要变为float的话数字后要加f<br>

  4.char用单引号，表示一个字符，String用双引号，表示一个字符序列<br>

  5.char可以用转义符号：如：\n换行，\t制表符（tab）<br>

<br>

#### 变量和常量

##### 1.变量

1. java是一种强类型语言，每个变量都必须声明其类型<br>
2. 变量是最基本的储存单元（另如对象），变量要素包括变量名，变量类型，作用域<br>
3. 先声明后赋值：int a; a= 10; 声明+赋值(常用): int a = 10;<br>
4. 类内，方法外定义的变量叫成员变量，存在默认值；类内，方法内定义的变量，不存在默认值，需要进行初始化操作（手动赋值）。<br>
5. int x=10, y=20;<br>

##### 2.常量

1. final修饰的变量为最终变量（常量），不能二次赋值；final double PI =3.14;<br>

<br>

#### 运算符

- 算数运算符：+、 -、 *、 取整除：/、 取余数（模）：%；<br>

- 单目运算符：a++ ：先输出，再加1； ++a：先加1，再输出<br>

- 赋值运算符：=赋值，==相等；<br>

- 扩展赋值运算符：a += 2 等于 a =a+2;(建议只用扩展运算符，否则会有问题，面试题)<br>

  详细解释：https://www.cnblogs.com/Jordandan/p/11044964.html<br>

- 关系运算符：>,<,>=,<=,==,!=<br>

- 逻辑运算符：&&（短路与）, ||（短路或）,！取反；与和或的符号两边不用带括号，空格隔开即可；取反要带括号。&（普通与）|（普通或）。<br>

- 位运算符：&，|，^(异或), ~（取反）。只能操作数值，操作时会转成二进制进行运算。移码：<<左移，等于乘以2；>>右移，等于除以2；<br>

- 条件运算符（三目运算符）：( 3 > 2 ? 3 : 2  )。如果表达式true则返回？后的结果，如果表达式false则返回：后的结果。经常用来代替简单的if else判断<br>

- 优先级：单目>算数>关系>逻辑>三目>赋值; 例：int b=2;System.out.println(++b+b++)得到6；System.out.println(b)得到4<br>

<br>

#### 移码，补码，原码，反码

- 进制数运算规则
- 机器数与真值
- 原码：将最高位作为符号位，其他数字位代表数值本身的绝对值。
- 反码：正数和原码相同；负数则保留符号位，后将原码每位取反。
- 补码：正数和原码相同；负数=反码+1

<br>

#### 数据类型的转换

- 赋值运算或算术运算时，要求数据类型相同，否则要进行类型转换
- 自动转换、强制转换
- 除布尔型外，所有基本数据类型因为各自精度不同，赋值时都要考虑这个问题
- 自动转换会自动将小的类型转换为大的类型
- 强制转换：前面加上(datatype)

<br>

#### java流程控制语句

##### 1.分支结构：

1. 单分支结构：if (判断) {执行}、

2. 双分支结构：if (判断)｛｝else｛｝

3. 多分支结构：if (判断) {} else if (){} else if (){} else (){}

4. 嵌套分支结构：｛if｝

5. switch和多分支if的选择：

   switch：只能处理等值条件判断；且条件有数字类型限制；<br>

   多重if：特别适合某个变量处于某个连续区间的情况。<br>

   https://www.pianshen.com/article/6493549521/<br>

   https://blog.csdn.net/qq_29933359/article/details/80777092<br>

6. switch多分支选择结构：

   ![image-20210921232144858](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210921232144858.png)

   -只能处理等值条件判断<br>

   -表达式必须为byte,short,int或char，不能是flaot,double,java1.7后支持string<br>

   -简写方式：<br>

   ![image-20210921232500484](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210921232500484.png)

查看图片：https://blog.csdn.net/Hank0321/article/details/120407499<br>

<br>

#### 循环结构

循环条件+循环操作：1.初始化 2.条件判断 3.循环体 4.迭代变量

1. while *

   ```java
   int i = 1;
   while(i<=100){
       System.out.println("第"+i+"遍输出");
       i++;
   }
   ```

   

2. do while

   ```java
   int i = 1;
   do{
       System.out.println("第"+i+"遍输出");
       i++;
   }while(i<=100);
   ```

   

3. for *

   - for (1初始化; 2条件表达式; 4步进器) {3代码逻辑}
   - 先执行程序部分，在执行步进
   - 初始化和循环条件表达式可以使用逗号来执行多个操作
   - 如果三个部分都为空（分号不能省），则等于一个无限循环

   ```java
   for(int i=1;i<=100;i++){
   	System.out.println("第"+i+"遍输出");
   }
   ```

<br>

#### Class Scanner

- 创建文件扫描器对象，System.in表示的是标准输入，可以从控制台读取数据[装饰者模式]<br>


先import java.util.Scanner;<br>

Scanner sc = new Scanner(System.in);<br>

System.out.println("请输入数据");<br>

String str = sc.nextLine();<br>

System.out.println(str);<br>

- .nextInt() 接收整数
- .nextFloat() .nextDouble() 接收小数

<br>

#### 设计模式

马士兵：抽丝剥茧设计模式+坦克大战项目<br>

<br>

#### 字符串比较

String str = "1234";<br>

if (**str.equals("4321")**){}<br>


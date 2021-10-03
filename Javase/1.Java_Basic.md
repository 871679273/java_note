# Java基础

<br>

<br>

## 简单的DOS命令

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

<br>

## HelloWorld

#### 1.写java文件

public class HelloWorld{<br>

&nbsp;&nbsp;&nbsp;&nbsp;public static void main(String [] args){<br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("hello菜鸟");<br>

&nbsp;&nbsp;&nbsp;&nbsp;}<br>

}

#### 2.编译

命令行中，进入所在目录：javac HelloWorld.java<br>

#### 3.执行（解释）

java HelloWorld.java<br>

<br>

<br>

## 注释

1.单行注释：//<br>

2.多行注释：/* */<br>

3.文档注释：<br>

/**<br>

*第一行内容<br>

*第二行内容<br>

*/<br>

<br>

<br>

## 反编译工具

class to java<br>

1.ide插件<br>

2.jd-gui.exe<br>

<br>

<br>

## 标识符（命名规则）

#### 1.硬性规定：

1.开头必须是字母，或下划线，或$（不能是数字）<br>

2.其他部分必须是字母，数字，下划线，美元符号，不能有其他符号<br>

3.大小写敏感，长度无限制<br>

4.不能是java关键字<br>

#### 2.规范建议：

1.驼峰标识<br>

- 类名、接口：首字符大写
- 方法、变量：首字符小写

2.见名知意<br>

<br>

<br>

## 字符集

<br>

<br>

## JAVA基本数据类型

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

<br>

## 数据类型的转换

- 赋值运算或算术运算时，要求数据类型相同，否则要进行类型转换
- 自动转换、强制转换
- 除布尔型外，所有基本数据类型因为各自精度不同，赋值时都要考虑这个问题
- 自动转换会自动将小的类型转换为大的类型
- 强制转换：前面加上(datatype)
- String to int:   int number = Integer.parseInt(str);

<br>

<br>

## 变量和常量

#### 1.变量

1. java是一种强类型语言，每个变量都必须声明其类型<br>
2. 变量是最基本的储存单元（另如对象），变量要素包括变量名，变量类型，作用域<br>
3. 先声明后赋值：int a; a= 10; 声明+赋值(常用): int a = 10;<br>
4. 类内，方法外定义的变量叫成员变量，存在默认值；类内，方法内定义的变量，不存在默认值，需要进行初始化操作（手动赋值）。<br>
5. int x=10, y=20;<br>

#### 2.常量

1. final修饰的变量为最终变量（常量），不能二次赋值；final double PI =3.14;<br>

<br>

<br>

## 运算符

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

<br>

## 移码，补码，原码，反码

- 进制数运算规则
- 机器数与真值
- 原码：将最高位作为符号位，其他数字位代表数值本身的绝对值。
- 反码：正数和原码相同；负数则保留符号位，后将原码每位取反。
- 补码：正数和原码相同；负数=反码+1

<br>

<br>

## java流程控制语句

#### 1.分支结构：

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

#### 2.循环结构

循环条件+循环操作：1.初始化 2.条件判断 3.循环体 4.迭代变量 （*表示常用）

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

   

3. for *（推荐使用）

   - for (1初始化; 2条件表达式; 4步进器) {3代码逻辑}
   - 先执行程序部分，在执行步进
   - i变量的作用域仅存在当前for循环中，而while循环则没有这个特性。
   - 初始化和循环条件表达式可以使用逗号来执行多个操作
   - 如果三个部分都为空（分号不能省），则等于一个无限循环（死循环）

   ```
   for(int i=1;i<=100;i++){
   	System.out.println("第"+i+"遍输出");
   }
   ```
   
4. 循环嵌套

   - 任何两种循环都可以互相嵌套
   - 可以任意层次循环，但是一般不超过3层

   <br>

#### 3.跳转语句  

1. 任何循环语句中（和switch），break可强行退出当前循环。（只能跳出内层循环，不能跳出外层循环，跳出外层可用return）

2. continue：跳出本次循环。

3. return:

   - 两个基本用途：
   
     一，return expression 返回一个值给调用该方法的语句。返回值的数据类型必须和方法声明中的返回值类型一致或是精度低于声明的数据类型。<br>
   
     二，return 终止当前方法，当方法声明中用void声明返回类型为空时，应使用这种返回类型，它不返回任何值（和System.exit(-1)相似的功能[终止程序]）。<br>
   
   - return语句从当前方法退出，返回到调用该方法的语句处，并从该语句的下条语句处继续执行程序。

<br>

#### 4.递归（recursion）

- 程序调用自身的编程技巧：一个过程或函数在其定义或说明中有直接或间接调用自身的一种方法。
- 注意：能不用就不用，递归会加大资源的消耗，如果递归层次比较深，会造成栈溢出。
- 必须使用的场景：输出某个磁盘目录下的所有文件

```java
//Fibonacci
public class Fibonacci{
	public static void main(String[] args){
		for(int i = 1;i<=10;i++){
			System.out.print(getNumber(i)+"\t");
		}
	}
	public static int getNumber(int number){
		if(number==1||number==2){
			return 1;
		}else{
			return getNumber(number-1)+getNumber(number-2);
		}
	}
}

//阶乘
public static int factorial(int n){
    if(n==1){
        return 1;
    }else{
        return n*factorial(n-1);
    }
}
```

<br>

<br>

## 数组

#### 数组

- 数组是相同类型数据的有序集合
  - 按一定先后次序排列组合而成
  - 其中的每一个数据称作一个数组元素，每个数组元素可以通过一个下标来访问他们。

- 数组特点
  - 长度是确定的，数组一旦被创建，其大小是不可以改变的
  - 其元素必须是相同类型，不允许出现混合类型
  - 数组中的元素可以是任何数据类型，包括基本类型和引用类型。

- 数组属引用类型
  - length, elemenets of the array

- 注意
  - 声明一个变量是在内存空间划出一块合适的空间；声明一个数组是在内存空间划出一串连续的空间。
  - 数组只有一个名称，即标识符。元素下标从0开始。数组长度固定不变，避免数组越界。

- 使用数组

  - 1.声明数组： int[] a;
  - 2.分配空间： a = new int[5];
  - 3.赋值： a[0] = 8;
  - 4.处理数据： a[0] = a[0] * 10;
  - 引用：arrayName[index]
  - 长度：.length

  ```java
  public class ArrayDemo{
  	public static void main(String[] args){	
  		//声明数组
  		int[] array;
  		//创建内存空间
  		array = new int[5];
  		//数组赋值
  		array[0] = 0;
  		array[1] = 1;
  		array[2] = 2;
  		array[3] = 3;
  		array[4] = 4;
  		//数组操作
  		System.out.println(array[0]);
  		
  		//数组的几种创建方式
  		//1、声明并申请空间
  		int[] arr1 = new int[5];
  		int [] arr2 = new int[5];
  		int  arr3[] = new int[5];
  		//2、声明数组并赋值
  		int[] arr4 = new int[]{1,2,3,4,5};
  		//3、直接初始化操作
  		int[] arr5 = {1,2,3};
  		
  		//获取数组的长度
  		System.out.println(arr1.length);
  		
  		//输入5个数值，求平均值
  		int[] arr6 = new int[]{56,98,34,89,100};
  		int sum = 0;
  		for(int i = 0;i<arr6.length;i++){
  			sum+=arr6[i];
  		}
  		System.out.println("平均值是："+sum/arr6.length);
  		*/
  		
  		/*
  		数组是引用类型，当创建完成数组之后相当于是在方法外定义了一个变量，此时数组中的值是有默认值的（数组是引用类型，它的元素相当于类的实例变量，因此数组一经分配空间，其中的每个元素也被按照实例变量同样的方式被隐式初始化。）
  			默认是什么，取决于你定义的数组的类型：
  			int:0
  			String null
  			boolean false
  		数组可以根据下标获取值，但是获取的时候下标的范围是[0,length-1]
  		*/
  		int[] array = new int[5];
  		System.out.println(array[0]);
  	}
  }
  ```

- 数组与数据结构

  数组相当于数据结构的一种实现，很多数据在进行存储的时候需要使用数组<br>

  数据结构：

  - 线性表
  - 非线性表
  - 树
  - 图
  - 队列
  - 栈

- 数组与排序算法

  数组经常会用来考排序算法：<br>
  面试需求：

  - 1、写出某种排序算法

    - 冒泡排序
    - 选择排序
    - 插入排序
    - 快速排序
    - 其他排序算法请看：Sorting_Algorithm.md 或 visualgo.net/zh (数据结构和算法动态可视化)

  - 2、排序算法的时间复杂度（空间复杂度）

    ​      衡量一个数据结构是否合适的衡量标准

  - 3、排序算法的稳定性
    	  排序之后的值跟排序之前的值位置是否发生变化

#### 二维数组

- java中多维数组可以是不规则的(数组的数组)

```java
/*
二维数组可以称作数组的数组
	定义二维数组的时候一定需要注意，必须要给定数组的长度
*/

public class TwoArray{	
	public static void main(String[] args){
        
        int arr0[][] = {{1,2,3,4,5},{6,7,8},{9,10,11,12}};//直接创建
		int arr1[][] = new int[3][5];//规则的数组arr1
		int arr2[][] = new int[3][];//不规则的数组arr2
		//创建二维数组的对象
		arr2[0] = new int[5];
		arr2[1] = new int[3];
		arr2[2] = new int[4];
		//赋值
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[0][3] = 4;
		arr2[0][4] = 5;
		
		arr2[1][0] = 6;
		arr2[1][1] = 7;
		arr2[1][2] = 8;
		
		arr2[2][0] = 9;
		arr2[2][1] = 10;
		arr2[2][2] = 11;
		arr2[2][3] = 12;
		//打印数组
		for(int i = 0;i<arr2.length;i++){
			for(int j = 0;j<arr2[i].length;j++){
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}		
	}
}
```

#### 数组的拷贝

```java
// 使用java.lang.System类的静态方法 
public static void arraycopy (Object src,int srcPos,Object dest, int destPos,int length) 
    
// 可以用于数组src从第srcPos项元素开始的length个元素拷贝到目标数组从destPos项开始的length个位置。
    
// 如果源数据数目超过目标数组边界会抛出 
//  IndexOutOfBoundsException 异常
    
public class ArrayTest7 { 
    public static void main(String args[]) { 
        //一维数组的拷贝
        String[] s = {"Mircosoft","IBM","Sun","Oracle","Apple"};
        String[] sBak = new String[6]; 
        System.arraycopy(s,0,sBak,0,s.length); 
        for(int i=0;i<sBak.length;i++){ 
            System.out.print(sBak[i]+" "); 
        }
        System.out.println(); 
        //二维数组的拷贝
        int[][] intArray = {{1,2},{1,2,3},{3,4}}; 
        int[][] intArrayBak = new int[3][]; 
        System.arraycopy(intArray,0,intArrayBak,0,intArray.length); 
        intArrayBak[2][1] = 100; 
        for(int i = 0;i<intArray.length;i++){ 
            for(int j =0;j<intArray[i].length;j++){ 
                System.out.print(intArray[i][j]+" "); 
            }
            System.out.println(); 
        } 
    } 
}
```

#### 命令行参数

- 在启动Java应用程序时可以一次性地向应用程序中传递0~多个参数

  - 命令行参数使用格式： 

    java ClassName lisa "bily" "Mr Brown“    （由参数args接收 ）

  - 空格将参数分开 

  - 若参数包含空格，用双引号引起来

  ```java
  public class Test { 
  	public static void main(String[] args) { 
          for ( int i = 0; i < args.length; i++ ) { 
              System.out.println("args[" + i + "] = " + args[i]); 
          } 
      } 
  } 
  //运行程序  java Test lisa "bily" "Mr Brown" 
  //输出结果： args[0] = lisa; args[1] = bily; args[2] = Mr Brown;
  ```

<br>

<br>

## Class

#### Class Scanner

- 创建文件扫描器对象，System.in表示的是标准输入，可以从控制台读取数据[装饰者模式]<br>


先import java.util.Scanner;<br>

Scanner sc = new Scanner(System.in);<br>

System.out.println("请输入数据");<br>

String str = sc.nextLine();<br>

System.out.println(str);<br>

- .nextInt() ;接收整数
- .nextFloat() .nextDouble() 接收小数

#### Class Arrays

```java
import java.util.Arrays;
//排序.sort
Arrays.sort(array);
```

<br>

<br>

## 设计模式

马士兵：抽丝剥茧设计模式+坦克大战项目<br>

https://www.bilibili.com/video/BV1tK411W7xx?from=search&seid=10175580626331288405&spm_id_from=333.337.0.0<br>

https://www.bilibili.com/video/BV16a411F7QF?from=search&seid=10175580626331288405&spm_id_from=333.337.0.0<br>

<br>

<br>

## 字符串比较

String str = "1234";<br>

if (**str.equals("4321")**){}<br>

<br>

<br>

<br>


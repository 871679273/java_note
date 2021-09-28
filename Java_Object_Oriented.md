# java面向对象

<br>

<br>

## 面向过程编程/面向对象编程

- 第一代：机器语言。第二代：汇编语言。第三代：高级语言：1.面向过程（C,Fortran,COBOL,PASCAL,ADA）2.面向对象（java,C#,C++）。
- 区别：
  - 面向过程：事物比较简单，可以用线性的思维去解决
  - 面向对象：事物比较复杂，使用简单的线性思维无法解决

- 共同点：

  - 面向过程和面向对象都是解决实际问题的一种思维方式

  - 二者相辅相成，并不是对立的。<br>

    解决复杂问题，通过面向对象方式便于我们从宏观上把握事物之间复杂的关系、方便我们分析整个系统；<br>具体到微观操作，仍然使用面向过程方式来处理。

- 所有java程序都是以类class为组织单元，关键字class定义自定义的数据类型。

<br>

<br>

## 类和对象

#### 1. 基本概念

- 对象Object：
  - 是具体的事物
  - 又称实例 instance
- 类 Class：
  - 是对对象的抽象。具有相同属性和方法的一组对象的集合 。
  - 类是对象的类型。
  - 类定义了这一类对象所应具有的静态和动态属性。
- 属性：对象具有的特征。
- 方法：对象执行的操作。

<br>

#### 2. 类

- 属性 field。或称成员变量。

  - 用于：定义该类或该类对象包含的数据或者说静态属性。

  - 作用范围：整个类体。

  - 变量初始化：在定义成员变量时可以对其初始化。如果不对其初始化，Java使用默认的值对其初始化。

- 定义格式：

  - 类：1.定义类名。2.编写类的属性。3.编写类的方法。

  - 属性： [修饰符]  属性类型  属性名  =  [默认值]

  - 方法： [访问修饰符]  返回值类型  方法名称(形参列表)｛  逻辑代码  ｝  

    - 方法可以有返回值，也可以没有，void表示没有返回值的意思
    - 方法的访问修饰符可以不写
    - JAVA中方法的参数传递都是值传递。

    ```java
    public class Student {
        //属性定义
        int stuNumber;
        String name;
        int age = 20;
        //方法定义
        void study(){
            System.out.println("我正在学习");
        }
        void eat(String food){
            System.out.println("我在吃"+food);
        }
    }
    class Teacher{
        //...
    }
    ```

<br>

#### 3.对象

- 对象的创建和使用

  - new关键字来创建对象

    ClassName  objectName  =  new ClassName();

  - 使用：objectName.属性 、objectName.方法()
  - 修改属性值: objectName.属性 = ;

  ```java
  public class Student {
  	/*在此处已定义好了属性name,age,stuNumber和方法study,eat*/
      public static void main(String[] args) {
          //创建对象
          Student student1 = new Student();
          //修改属性值
          student.name = "张三";
          student.age = "21";
          student.stuNamber = "20210927";
          //使用属性
          System.out.println(student1.name);
          System.out.println(student1.age);
          System.out.println(student1.stuNumber);
          //调用方法
          student1.study();
          student1.eat("apple");
      }
  }
  ```

<br>

#### 4.注意

- 类可以不添加属性和方法
- 一个java文件中可以定义N个class，但只能有一个public class且其类名跟文件名保持一致

<br>

<br>

## 局部变量和成员变量

- 局部变量：
  - 定义在方法中的变量
  - 作用域：从定义的位置开始到整个方法结束。只能在当前方法中使用，其他地方无法使用。
  - 内存存放空间：栈 stack
  - 无默认值。不使用时可以不赋值，使用时没有赋值的话会报错。
  - 不同方法中即使有同名的局部变量，没有关系，互不影响，建议相同
- 成员变量：
  - 定义在方法外，类内的变量叫做成员变量（全局变量） 
  - 作用域：整个类体内
  - 内存存放空间：堆 heap
  - 有默认值。int 0, String null, boolean false.

<br>

<br>

## 引用类型

- 数据类型：1.基本数据类型 2.引用数据类型

- 引用类型：1.类 Class 2.接口 interface 3.数组

  ![2021-09-27_163940](/image/2021-09-27_163940.jpg)

- Java中的对象和数组是通过引用对其操作的
  - 引用可以理解为一种受限的指针
  - 指针是可以进行与整数做加减运算的，两个指针之间也可以迚行大小比较运算和相减运算。引用不行，只能进行赋值运算。
  - 引用就是一个变量或对象的别名（引用的本质是一个对象）；指针是一个段内存空间的地址(指向存储一个变量值的空间或一个对象的空间)

<br>

<br>

## 内存分析

#### 栈 stack

- 存放：局部变量

- 先进后出，自下而上存储，上不封口
- 方法执行完毕，自动释放空间

#### 堆 heap

- 存放new出来的对象
- 需要垃圾回收器来回收：System.gc();

#### 方法区 method area

- 存放：类的信息（代码）、static变量、字符串常量等

![2021-09-27_171538](/image/2021-09-27_171538.jpg)

<br>

<br>

## 构造方法

创建对象的时候默认会调用构造方法来创建对象，（在堆中开辟空间），可以完成成员变量的某些初始化操作

#### 构造方法的语法：

- 方法名称：构造方法的方法名称必须跟类的名称保持一致
- 访问修饰符：
- 形参：可以用户自定义添加，跟方法的普通参数一样
- 方法体：完成对象的初始化功能
- 返回值：没有返回值(不能写void)

#### 注意：

1. 创建完类之后，如果没有手动调用构造方法，会有一个默认的无参的构造方法供调用
2. 当用户自定义了构造方法之后，默认的无参构造方法就不能够使用了，必须要手动定义无参构造方法
3. 同一个类中可以包含多个同名的构造方法

#### 重载:

在一个类中可以包含多个重名的方法，但是注意方法的参数列表不能相同<br>

三个方面的不同：<br>

- 参数的个数不同
- 参数的类型不同
- 参数的顺序不同

注意：一般构造方法都会进行重载（一个类中可能包含多个属性值，当只需要给部分属性初始化的时候需要调用不同的构造方法）<br>

```java
public class Teacher {

    String name;
    int age;
	
    //构造方法1
    public Teacher(){
        
    }
	
    //构造方法2
    public Teacher(String xname){
        System.out.println("one argument");
        name = xname;
    }
    
    //构造方法3
    public Teacher(String xname,int xage){
        System.out.println("two argument");
        System.out.println("new......");
        name = xname;
        age =xage;
    }
    
	//teach 构造方法1
    public void teach(String a,int b){

    }
    
	//teach 构造方法2
    public void teach(int b,String a ){
        System.out.println("上课");
    }

    public static void main(String[] args) {
        Teacher teach = new Teacher();
        teach.name="连";
        teach.age=18;
        System.out.println(teach.name);
        System.out.println(teach.age);
        Teacher teacher2 = new Teacher("lisi",29);
        System.out.println(teacher2.name);
        System.out.println(teacher2.age);
        Teacher t3 = new Teacher("wangwu");
        System.out.println(t3.name);
    }
}
```

#### 总结

构造器：

- 构造器定义： constructor 构造方法
  - 一个在创建对象时被自动调用的特殊方法。
- 构造器作用：
  - 为对象进行初始化（成员变量）工作。

- 构造器是一种特殊的方法：
  - 构造器的方法名必须和类名一致！
  - 构造器虽然有返回值，但是不能定义返回类型(返回值的类型肯定是本类)，不能在构造器里调用return。 
  - 通过new关键字调用！！
  - 如果我们没有定义构造器，则系统会自动定义一个无参的构造方法。如果已定义则编译器不会添加无参数构造方法！
  - 与普通方法一样，构造方法也可以重载。

<br>

<br>

```java
//此处代码示例
//exercise/Practice3_6/Point.java
```

<br>

<br>

## 方法调用中的参数

#### 形参和实参

- 定义方法的参数是形式参数
- 调用方法的参数是实在参数
- 调用方法时要求参数个数相同，类型兼容

#### 参数传递

- 基本数据类型的参数传递
  - 无法通过方法调用改变变量的值
- 引用数据类型的参数传递
  - 可以通过方法调用改变变量的值

<br>

<br>

## this 关键字

- this的作用: 
  - this表示的是当前对象本身
  - 更准确地说，this代表当前对象的一个引用。
- 普通方法中使用this。 
  - 区分类成员属性和方法的形参. 
  - 调用当前对象的其他方法（可以省略）
  - 位置：任意

- 构造方法中使用this。 

  - 使用this来调用其它构造方法

  - 位置：必须是第一条语句

- this不能用于static方法。（学完static，就知道为什么了）

```java
/*
* this:表示当前对象的指针
*   指向当前对象，表示当前对象的引用
* 用处：
*       1、构造方法，当构造方法中的参数名称跟类的成员变量名称一样的时候，可以使用this代表当前对象
*               注意：有了this之后，可以将构造方法的参数跟成员变量保持一致
*               当构造方法中需要调用其他的构造方法时，可以使用this(name)调用其他构造方法，但是必须位于方法体的第一行
*       2、普通方法中：
*           当多个普通方法之间需要调用的时候，可以使用this来进行调用，指的是当前对象的其他方法
*       3、成员变量的使用：
*           当方法中的参数名称跟成员变量保持一致的时候，使用 this.变量名称 表示的是对象的值，而使用变量名称表示形参列表中的值
* */
public class ThisDemo {

    String name;
    int age;

    public ThisDemo(){

    }

    public ThisDemo(String name){
        System.out.println("one");
        this.name = name;
    }

    public ThisDemo(String name,int age){
        this(name);
        System.out.println("two");
        this.age = age;

    }

    public void test1(){
        System.out.println("test1");
    }
    public void test2(String name){
        System.out.println("test2");
        test1();
        System.out.println(name);
        System.out.println(this.name);
    }


    public static void main(String[] args) {
        ThisDemo td = new ThisDemo("zhangsan",12);
        System.out.println(td.name);
        System.out.println(td.age);
        td.test2("lisi");
    }

}
/*
输出
one
two
zhangsan
12
test2
test1
lisi
zhangsan
*/
```

<br>

<br>

## static 关键字

#### static 修饰成员变量

- 在类中，用static声明的**成员变量**为**静态成员变量** ,又称为 **类属性**，**类变量**。
  - 它为该类的公用变量，归属于类，被该类的所有实例（对象）共享，在类被载入时被显式初始化，
  - 对于该类的所有对象来说，static成员变量只有一份。被该类的所有对象共享！！
  - 可以使用**”对象.类属性”**来调用。不过，一般都是用**“类名.类属性”** 来调用
  - static变量置于方法区中！

#### static 修饰方法

- 在类中，用static声明的**方法**为**静态方法**，又称为**类方法**
  - 不需要对象，就可以调用(类名.方法名)
  - 在调用该方法时，不会将对象的引用传递给它，所以在static方法中不可访问非static的成员。
  - 静态方法不能以任何方式引用this和super关键字

#### 静态属性的访问方式

- **类名.属性**
- 对象名.属性

#### 静态方法的访问方式

- 创建：访问修饰符 static 返回值类型 方法名 () {}
- 访问方式：**类名.方法名();**  or  对象名.方法名(); 、

#### 注意

1. 静态变量，在创建对象之前被初始化，或者说在类被载入之前进行初始化
2. 静态变量被所有的对象共享，属于公共变量，对象和类都可以直接调用，但是推荐使用类来调用
3. 成员变量放在堆中，而静态变量放在方法去中静态区
4. 静态变量不能定义在静态方法中
5. 静态方法可以在非静态方法中进行调用
6. 静态方法中不能直接调用非静态方法
7. 静态方法中不允许出现this调用
8. 一般工具类中的方法定义为static

```java
/*
* static:
*       修饰成员变量的时候，表示静态成员变量或者叫类变量
*           普通变量在使用的时候，必须要通过对象名进行调用
*           类变量或者静态变量可以使用对象名调用也可以使用类名进行调用
*       修饰方法的时候，表示静态方法或者叫类方法
*           普通方法在使用的时候，必须要通过对象名进行调用
*           类方法或者静态方法可以使用类名，也可以使用对象名
* */
public class StaticDemo {

    String name = "zhangsan";
    static int age = 10; //修饰成员变量

    public static void test(){ //修饰方法
        System.out.println("static"); 
    }

    public void test2(){
        test(); //普通方法中调用静态方法
    }
    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        
        //修饰成员变量
        //使用对象进行调用或使用类名调用
        System.out.println(staticDemo.name);
        System.out.println(staticDemo.age);//10

        staticDemo.age = 20;
        System.out.println(staticDemo.age);//20
        System.out.println(StaticDemo.age);//20
        StaticDemo.age = 30;
        System.out.println(staticDemo.age);//30
        System.out.println(StaticDemo.age);//30

        StaticDemo staticDemo1= new StaticDemo();
        System.out.println(staticDemo1.age);//30
		
        //修饰方法
        StaticDemo sd = new StaticDemo();
        sd.test(); //通过对象名进行调用
        StaticDemo.test(); //通过类名进行调用
        sd.test2(); //普通方法中调用静态方法
    }
}
```

#### 区别

|          | static、非private修饰                                  | 非static、private修饰     |
| -------- | ------------------------------------------------------ | ------------------------- |
| 属性     | 类属性、类变量                                         | 实例属性、实例变量        |
| 方法     | 类方法                                                 | 实例方法                  |
| 调用方式 | 类名.属性<br>类名.方法()<br/>对象.属性<br/>对象.方法() | 对象.属性<br/>对象.方法() |
| 归属     | 类                                                     | 单个对象                  |

<br>

<br>

## 代码块

#### 概念

使用”{}”括起来的一段代码

#### 分类

根据位置可分类

- 普通代码块：直接在方法或语句中定义的代码块
- 构造代码块：直接写在类中的代码块
- 静态代码块：使用static声明的代码块
- 同步代码块：多线程的时候会学到

#### 静态代码块初始化

- 如果希望加载后，对整个类进行某些初始化操作，可以使用static初始化块。
- 类第一次被载入时先执行static代码块；类多次载入时，static代码块只执行一次；Static经常用来进行static变量的初始化。
- 是在类初始化时执行，不是在创建对象时执行。
- 静态初始化块中不能访问非static成员

```java
/*
* 代码块：  使用{}括起来的一段代码叫做代码块
* 分类：
*   普通代码块:定义在方法中，使用{}括起来的代码叫做普通代码块
*   构造代码块：定义在类中的使用{}括起来的代码叫做构造代码块
*           注意：每次代码运行的时候会将构造代码块中的代码添加到构造方法的前面
*                   构造代码块中的代码会添加到每一个构造方法中，当使用this(参数)的时候不会添加
*   静态代码块：使用static{}括起来的代码叫做静态代码块，在程序载入的时候优先执行
*           数据库连接等其他提前需要准备好的代码会放在static代码块
*   同步代码块：
*           在多线程的时候回使用，用来给共享空间进行加锁操作（后面讲）
*   执行顺序：静态代码块--》构造代码块（创建对象的时候才会用到）--》普通代码块
* */
public class CodeBlockDemo {
    int a ;
    int b;
    
	{
        System.out.println("构造代码块");
    }
    
    static{
        System.out.println("静态代码块");
    }
	
    public void test(){
        System.out.println("test");
        {
            System.out.println("普通代码块");
        }
    }
    
    public CodeBlockDemo(){
        System.out.println("无参");
        System.out.println("构造方法");
    }

    public CodeBlockDemo(int a){
        this.a = a;
    }

    public CodeBlockDemo(int a,int b){
        this(a);
        this.b = b;
    }

    public static void main(String[] args) {
        CodeBlockDemo codeBlockDemo = new CodeBlockDemo(1,2);
        codeBlockDemo.test();
        {
            System.out.println("main");
        }
    }
}
/*输出
静态代码块
构造代码块
test
普通代码块
main
*/
```

<br>

<br>

## package

#### package

- 为什么需要package? 
  - 为了解决类之间的重名问题。 (文件同名问题)
  - 为了便于管理类：合适的类位于合适的包！(将具体处理功能的代码放到同一个目录下)
- package怎么用? 
  - 通常是类的第一句非注释性语句。( 一般定义package会放置在java文件的第一行)
  - 包名：域名倒着写即可，再加上模块名，并与内部管理类。
    - package 域名的倒写
    - package com.mashibing;
- 注意事项：
  - 写项目时都要加包，不要使用默认包。
  - com.gao和com.gao.car，这两个包没有包含关系，是两个完全独立的包。只是逻辑上看起来后者是前者的一部分。

#### JDK中常用的包：

- java.lang：不需要手动导入，自动加载。包含一些Java语言的核心类，如String、Math、Integer、System和Thread，提供常用功能。
- java.util：工具包。包含一些实用工具类，如定义系统特性、使用不日期日历相关的函数。
- java.net：网络包。包含执行不网络相关的操作的类。
- java.io：输入输出流包。包含能提供多种输入/输出功能的类。
- java.awt：包含了构成抽象窗口工具集（abstract window toolkits）的多个类，这些类被用来构建和管理应用程序的图形用户界面(GUI)。

<br>

<br>

## import

当需要引入非lang包的其他java类的时候，需要使用import工具<br>

如果不使用import，每次在使用某个类的时候必须要将类的完全限定名都加上才可以使用，太过于繁琐

#### 用法

- import java.包名.类名；导入具体的类  推荐使用
- import 包名.*;    将当前包下的所有类文件都进行导入
- 写在package行下面

#### 注意

- 当一个java文件中需要使用多个同名的类的时候，只能选择导入一个，另一个使用完全限定名的方式进行导入

#### 静态导包

- 当需要使用某个类的多个方法的时候，同时又不想频繁写该类的名称，此时可以使用静态导包
- import static java.lang.Math.*; //导入Math类的所有静态属性
- import static java.lang.Math.PI; //导入Math类的PI属性
- 然后，我们可以在程序中直接使用：System.*out*.println(*PI*);

```java
package com.mashibing;

import java.util.Date;
import static java.lang.Math.*;

public class ImportDemo {

    public static void main(String[] args) {      
        System.out.println(Math.sqrt(2));
        System.out.println(sqrt(2));//静态导包后
    }
}
```

<br>

<br>

## 封装

面向对象三大特征之一 ：封装

#### 封装

- 概念：将类的某些信息隐藏在类内部，不允许外部程序直接访问，而是通过该类提供的方法来实现对隐藏信息的操作和访问
- 好处：
  1. 隐藏类的细节
  2. 只能通过规定方法访问数据
  3. 方便修改实现
  4. 方便加入控制语句

#### 封装的意义

- 隐藏对象内部的复杂性，只对外公开简单的接口。便于外界调用，从而提高系统的可扩展性、可维护性。

- 我们程序设计要追求“**高内聚，低耦合**”。

  - 高内聚就是类的内部数据操作细节自己完成，不允许外部干涉；

  - 低耦合 ：仅暴露少量的方法给外部使用。

#### 如何使用封装

封装的步骤

1. 修改属性的可见性 （设为private）
2. 创建公有的getter/setter方法 （用于属性的读写）
3. 在getter/setter方法中加入属性控制语句 （对属性值的合法性进行判断）

![2021-09-28_180459](/image/2021-09-28_180459.jpg)

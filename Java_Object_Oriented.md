# java面向对象

<br>

<br>

## 面向过程编程/面向对象编程

- 第一代：机器语言。第二代：汇编语言。第三代：高级语言：1.面向过程（C,Fortran,COBOL,PASCAL,ADA）2.面向对象（java,C#,C++）。
- ##### 区别：
  
  - 面向过程：事物比较简单，可以用线性的思维去解决
  - 面向对象：事物比较复杂，使用简单的线性思维无法解决
  
- ##### 共同点：

  - 面向过程和面向对象都是解决实际问题的一种思维方式

  - 二者相辅相成，并不是对立的。<br>

    解决复杂问题，通过面向对象方式便于我们从宏观上把握事物之间复杂的关系、方便我们分析整个系统；<br>具体到微观操作，仍然使用面向过程方式来处理。

- 所有java程序都是以类class为组织单元，关键字class定义自定义的数据类型。

<br>

<br>

## 类和对象

### 1. 基本概念

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

### 2. 类

- ##### 属性 field。

  或称成员变量。

  - 用于：定义该类或该类对象包含的数据或者说静态属性。

  - 作用范围：整个类体。

  - 变量初始化：在定义成员变量时可以对其初始化。如果不对其初始化，Java使用默认的值对其初始化。

- ##### 定义格式：

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

- ##### 类的所有组件

  定义类的时候需要包含以下组件：

  1. 私有属性
  2. 构造方法（无参构造方法和自定义构造方法）
  3. set/get方法
  4. 普通方法

<br>

### 3.对象

- ##### 对象的创建和使用

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

### 4.注意

- 类可以不添加属性和方法
- 一个java文件中可以定义N个class，但只能有一个public class且其类名跟文件名保持一致

<br>

<br>

## 局部变量和成员变量

- ##### 局部变量：
  
  - 定义在方法中的变量
  - 作用域：从定义的位置开始到整个方法结束。只能在当前方法中使用，其他地方无法使用。
  - 内存存放空间：栈 stack
  - 无默认值。不使用时可以不赋值，使用时没有赋值的话会报错。
  - 不同方法中即使有同名的局部变量，没有关系，互不影响，建议相同
- ##### 成员变量：
  
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

### 栈 stack

- 存放：局部变量

- 先进后出，自下而上存储，上不封口
- 方法执行完毕，自动释放空间

### 堆 heap

- 存放new出来的对象
- 需要垃圾回收器来回收：System.gc();

### 方法区 method area

- 存放：类的信息（代码）、static变量、字符串常量等

![2021-09-27_171538](/image/2021-09-27_171538.jpg)

<br>

<br>

## 构造方法 *constructor*

构造方法或构造器

创建对象的时候默认会调用构造方法来创建对象，（在堆中开辟空间），可以完成成员变量的某些初始化操作

### 构造方法的语法：

- 方法名称：构造方法的方法名称必须跟类的名称保持一致
- 访问修饰符：
- 形参：可以用户自定义添加，跟方法的普通参数一样
- 方法体：完成对象的初始化功能
- 返回值：没有返回值(不能写void)

### 注意：

1. 创建完类之后，如果没有手动调用构造方法，会有一个默认的无参的构造方法供调用
2. 当用户自定义了构造方法之后，默认的无参构造方法就不能够使用了，必须要手动定义无参构造方法
3. 同一个类中可以包含多个同名的构造方法

### 重载:

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

### 总结

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

### 形参和实参

- 定义方法的参数是形式参数
  - 方法中的参数列表叫做形式参数，没有具体的值，只是为了方便在方法体中使用
- 调用方法的参数是实在参数
  - 调用方法的时候实际传入的值叫实际参数，代表具体的数值，用来替换在方法体中代码逻辑的值进行运算
- 调用方法时要求参数个数相同，类型兼容
- 注意：
  - 形式参数的变量名称也是局部变量

### 参数传递

- java中的参数传递是值传递

- 基本数据类型的参数传递
  - 不能改变参数的值
  - 当方法的参数值是基本数据类型的时候，不会改变原来的值
  - 无法通过方法调用改变变量的值
- 引用数据类型的参数传递
  - 不能改变参数的值（地址没变，地址指向的对象里的值可以变）
  - 当方法的参数值是引用类型的时候，如果改变了该引用类型的值，会改变原来对象的值
  - 可以通过方法调用改变变量的值

```java
public class ArgumentDemo {

    public static void test(int a,int b){
        int tmp = a;
        a = b;
        b = tmp;
    }
	
    public static void test2(Point point){ //提前定义了一个Point类
        int x = point.getX();
        int y = point.getY();
        int tmp = x;
        x = y;
        y = tmp;
        point.setX(x);
        point.setY(y);
    }

    public static void main(String[] args) {
        //test1
        int a = 10;
        int b = 20;
        test(a,b);
        System.out.println(a);// 10
        System.out.println(b);// 20
       
        //test2
        Point point = new Point(2,3);
        test2(point);
        System.out.println(point.getX());
        System.out.println(point.getY());
    }
}
```

test1

![2021-09-28_205314](/image/2021-09-28_205314.jpg)

test2

![2021-09-28_205114](/image/2021-09-28_205114.jpg)

<br>

<br>

## this 关键字

### this的作用

- this表示的是当前对象本身
- 更准确地说，this代表当前对象的一个引用。

### this修饰属性

- 当方法中的参数名称跟成员变量保持一致的时候，使用 this.变量名称 表示的是对象的值，而使用变量名称表示形参列表中的值

### this修饰方法

- 普通方法中使用this。 
  - 区分类成员属性和方法的形参. 
  - 调用当前对象的其他方法（可以省略）
  - 位置：任意
- 构造方法中使用this。 
  - 使用this来调用其它构造方法

  - 位置：必须是第一条语句

**this不能用于static方法。**（学完static，就知道为什么了）

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

### static 修饰成员变量

- 在类中，用static声明的**成员变量**为**静态成员变量** ,又称为 **类属性**，**类变量**。
  - 它为该类的公用变量，归属于类，被该类的所有实例（对象）共享，在类被载入时被显式初始化，
  - 对于该类的所有对象来说，static成员变量只有一份。被该类的所有对象共享！！
  - 可以使用**”对象.类属性”**来调用。不过，一般都是用**“类名.类属性”** 来调用
  - static变量置于方法区中！

### static 修饰方法

- 在类中，用static声明的**方法**为**静态方法**，又称为**类方法**
  - 不需要对象，就可以调用(类名.方法名)
  - 在调用该方法时，不会将对象的引用传递给它，所以在static方法中不可访问非static的成员。
  - 静态方法不能以任何方式引用this和super关键字

### 静态属性的访问方式

- **类名.属性**
- 对象名.属性

### 静态方法的访问方式

- 创建：访问修饰符 static 返回值类型 方法名 () {}
- 访问方式：**类名.方法名();**  or  对象名.方法名(); 

### 注意

1. 静态变量，在创建对象之前被初始化，或者说在类被载入之前进行初始化

2. 静态变量被所有的对象共享，属于公共变量，对象和类都可以直接调用，但是推荐使用类来调用

3. 成员变量放在堆中，而静态变量放在方法去中静态区

4. 静态变量不能定义在静态方法中

5. 静态方法可以在非静态方法中进行调用

6. 静态方法中不能直接调用非静态方法

7. 静态方法中不允许出现this调用

8. 一般工具类中的方法定义为static

9. 在java中，无论在何处调用，使用静态属性必须以类名做前缀。**是错的** 

   - 1如果是本类使用，可以直接就用静态变量名。

   - 2如果是其他类使用，可以使用类名来调用，也可以创建一个实例对象来调用。

   - 3如果静态变量所在的类是静态类，那么不管在本类里或者在其他外部类，都可以直接使用静态变量名。

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
        System.out.println(age);//10

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

### 区别

|          | static、非private修饰                                  | 非static、private修饰     |
| -------- | ------------------------------------------------------ | ------------------------- |
| 属性     | 类属性、类变量                                         | 实例属性、实例变量        |
| 方法     | 类方法                                                 | 实例方法                  |
| 调用方式 | 类名.属性<br>类名.方法()<br/>对象.属性<br/>对象.方法() | 对象.属性<br/>对象.方法() |
| 归属     | 类                                                     | 单个对象                  |

<br>

<br>

## 代码块

### 概念

使用”{}”括起来的一段代码

### 分类

根据位置可分类

- 普通代码块：直接在方法或语句中定义的代码块
- 构造代码块：直接写在类中的代码块
- 静态代码块：使用static声明的代码块
- 同步代码块：多线程的时候会学到

### 静态代码块初始化

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

### package

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

### JDK中常用的包

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

### 用法

- import java.包名.类名；导入具体的类  推荐使用
- import 包名.*;    将当前包下的所有类文件都进行导入
- 写在package行下面

### 注意

- 当一个java文件中需要使用多个同名的类的时候，只能选择导入一个，另一个使用完全限定名的方式进行导入

### 静态导包

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

## 面向对象的三大特征

### 继承 inheritance

- 子类 父类
- 子类可以从父类继承属性和方法
- 子类可以提供自己单独的属性和方法

### 封装/隐藏encapsulation

- 对外隐藏某些属性和方法
- 对外公开某些属性和方法

### 多态 polymorphism

- 为了适应需求的多种变化，使代码变得更加通用！

面向过程只有封装性（功能的封装，而没有数据的封装），没有继承和多态

<br>

<br>

## 封装 encapsulation

面向对象三大特征之一 ：封装 encapsulation

### 封装

- 概念：

  将类的某些信息隐藏在类内部，不允许外部程序直接访问，而是通过该类提供的方法来实现对隐藏信息的操作和访问

- 解决的问题：

  如果任何一个处理类都可以直接对Dog进行赋值操作，那么当值不准确的时候，可以回产生额外的结果，如何在赋值的同时添加一些逻辑判断呢？封装可以解决此问题

- 作用：

  使用封装可以保证数据的规范，不符合规范的数据将无法进行操作

- 好处：
  1. 隐藏类的内部实现细节
  2. 只能通过规定方法访问数据
  3. 方便修改实现
  4. 方便加入控制语句（可以根据需求添加复杂的逻辑判断语句）

- 面向对象的封装（狭义）可以用一句话概述： 为了保证数据安全和规范

  - 将类中的属性设置为私有属性，提供共有的外部方法供程序进行调用，可以实现丰富的细节操作

  广义的封装：

  - 可以将完成特定功能的代码块封装成一个方法，供不同的程序进行调用

### 封装的意义

- 隐藏对象内部的复杂性，只对外公开简单的接口。便于外界调用，从而提高系统的可扩展性、可维护性。

- 我们程序设计要追求“**高内聚，低耦合**”。

  - 高内聚就是类的内部数据操作细节自己完成，不允许外部干涉；

  - 低耦合 ：仅暴露少量的方法给外部使用。

### 如何使用封装

- ##### 封装的步骤

1. 修改属性的可见性 （设为private）
2. 创建公有的getter/setter方法 （用于属性的读写）
3. 在getter/setter方法中加入属性控制语句 （对属性值的合法性进行判断）

- ##### idea 快捷键：

  Alt+Insert

  https://blog.csdn.net/sinat_41226396/article/details/80770520

![2021-09-28_180459](/image/2021-09-28_180459.jpg)

Dog.java：

```java
package com.mashibing;

/*
*   定义类的时候需要包含以下组件：
*       私有属性
*       构造方法（无参构造方法和自定义构造方法）
*       set/get方法
*       普通方法
* */

public class Dog {
    //私有属性
    private String name;
    private int age;
    private String color;
    
    //构造方法
    public Dog(){
    }
    public Dog(String name,int age,String color){
        this.name = name;
        if(age>0){
            this.age = age;
        }else{
            System.out.println("年龄不规范");
        }
        this.color = color;
    }
	
    //setter & getter
    public void setAge(int age){
        if(age>0){
            this.age = age;
        }else{
            System.out.println("输入年龄不规范，重新输入");
        }
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
	
    //普通方法
    public void eat(){
        System.out.println("eating 骨头");
    }
    public void play(){
        System.out.println("palying....");
    }
    public void show(){
        System.out.println("name:"+this.name);
        System.out.println("age:"+this.age);
        System.out.println("color:"+this.color);
    }
}
```

DogTest.java

```java
package com.mashibing;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        dog.name="大黄"; //错
//        dog.color="yellow"; //错
//        dog.setAge(-20); //错
        dog.setName("大黄");
        dog.setAge(20);
        dog.setColor("黄");
        dog.show();
        System.out.println(dog.getAge());
    }
}
```

<br>

<br>

## 访问控制符

使用访问控制符，实现封装

### 成员的访问权限

成员（成员变量或成员方法）访问权限共有四种：

- public 公共的
  - 可以被项目中所有的类访问。(项目可见性) 
- protected 受保护的 
  - 可以被这个类本身访问；
  - 可以被同一个包中的所有其他的类访问；
  - 被它的子类（同一个包以及不同包中的子类）访问

- default／friendly 默认的/友好的（包可见性） 
  - 被这个类本身访问
  - 被同一个包中的类访问。

- private 私有的 
  - 只能被这个类本身访问。（类可见性）

|          | publc | protected | default | private |
| -------- | ----- | --------- | ------- | ------- |
| 所有类   | *     |           |         |         |
| 子类     | *     | *         |         |         |
| 同一个包 | *     | *         | *       |         |
| 同一个类 | *     | *         | *       | *       |

### 类的访问权限

类的访问权限只有两种

- public 公共的
  - 可被同一项目中所有的类访问。 (必须不文件名同名) 

- default／friendly 默认的/友好的
  - 可被同一个包中的类访问。

一个java文件里面只能有一个public class 且类名和文件名相同

### 封装要点

- ##### 类的属性的处理:

  1. 一般使用private. (除非本属性确定会让子类继承)
  2. 提供相应的get/set方法来访问相关属性. 这些方法通常是**public**从而提供对属性的读取操作。 （注意：boolean变量的get方法是用：is开头!） 

- ##### 类的方法的处理：

  1. 一些只用于本类的辅助性方法可以用private
  2.  **希望其他类调用的方法用public**

<br>

<br>

## 继承 inheritance

<br>

### 继承

![2021-09-28_233334](/image/2021-09-28_233334.jpg)

![2021-09-28_233403](/image/2021-09-28_233403.jpg)

**类是对对象的抽象，继承是对某一批类的抽象，从而实现对现实世界更好的建模。**

- 表示父类跟子类之间的关系
  *   当两个类或者多个类具备相同的属性和方法的时候，可以提取出来，变成父类，子类可以继承
  *   extends的意思是“扩展”。子类是父类的扩展
  *   子类跟父类是is-a的关系
- 提高代码的复用性！
- 不同的叫法：父类（超类）、子类（基类、派生类）

<br>

### 使用

1. 使用继承的时候需要使用**extends**关键字
2. 使用继承关系之后，**父类中的属性和方法都可以在子类中进行使用**(私有属性和私有方法不能在子类中被调用)
3. java中是**单继承关系**(因为如果包含多个父类，同时父类中包含重名方法，无法决定改调用谁)

```java
class Pet{
	//公共的属性和方法
}
```

```java
class Dog extends Pet{ //只能继承一个父类
	//子类特有的属性和方法
}
```

<br>

### super 关键字

super:是 直接父类 对象的引用

- **用途**：

1. ​	可以通过super来访问父类中被子类覆盖的方法或属性：

   - super.父类方法 ();
   - super.父类属性;
   - （在普通方法中的位置无要求）

   ```java
   class Pet{
   	//... 公共的属性和方法
       private void play(){
           System.out.println("play.....");
       }
   }
   ```

   ```java
   class Dog extends Pet{
   	//... 子类特有的属性和方法
       public void play(){
           super.play();//父类中被子类覆盖的方法
           System.out.println("dog is playing ball");
       }
   }
   
   /*
   main中创建对象dog后，写dog.play();会输出：
   play.....
   dog is playing ball
   */
   ```

2. 当super在构造方法中使用的话，会调用父类的构造方法，

   - super(name,age,gender); 

   - 一定要将super放在第一行
   - 在构造方法中，不能同时使用 super()去调用构造方法和this()去调用构造方法。

   ```java
   class Pet{
   	//... 公共的属性和方法
       public Pet(){
           System.out.println("pet 无参构造方法");
       }
       public Pet(String name, int age, String gender) {
   //        this();
           this.name = name;
           this.age = age;
           this.gender = gender;
       }
   }
   ```

   ```java
   class Dog extends Pet{
   	//... 子类特有的属性和方法
       public Dog(String name, int age, String gender, String sound) {
           super(name,age,gender); //必须放在第一行
           //this();  不能用
           this.sound = sound;
       }
   }
   // 不会输出：pet 无参构造方法。除非在父类含参数构造方法中写this();
   ```

- **注意**

1. 父类中私有private的属性和方法都不能被调用，包括构造方法
2. 任何类的构造函数中，若是构造函数的第一行代码没有显式的调用super(...);那么Java默认都会调用super();作为父类的初始化函数。 所以你这里的super();加不加都无所谓。
3. 子类的构造方法中都会默认使用super关键字调用父类的无参构造方法,因此在定义任何类的时候，无论自己是否自定义了其他构造方法，最好将无参构造方法写上
4. 如果构造方法中显式的指定了super的构造方法，那么无参的构造方法就不会被调用
5. 不能被继承的父类成员：
   - 不能直接访问private成员
   - 子类与父类不在同包，使用默认访问权限的成员
   - 构造方法
6. 多重继承关系的初始化顺序：父类属性——》父类构造方法——》子类属性——》子类构造方法
7. 构造方法调用顺序： 
   - 根据super的说明，构造方法第一句 总是：super(…)来调用父类对应的构造方法。
   - 先向上追溯到Object，然后再依次向下执行类的初始化块和构造方法，直到当前子类为止。

- **super小结**
  - super只能出现在子类的方法和构造方法中
  - super调用构造方法时，只能是第一句
  - super和this不能同时出现在构造方法中
  - super不能访问父类的private成员
  - super和this都不能再static方法中

### 小结

1. 在创建子类对象的时候一定会优先创建父类对象
2. 所有的java类都具备同一个老祖宗类，称之为Object（java.lang.Object），是所有类的根类。（int,Date也是类）
3. java中的多继承，可以通过接口来实现
4. 如果定义一个类时，没有调用extends,则它的父类是java.lang.Object
5. 静态方法能被继承，不能被重写

<br>

### 方法重写 override

必须要存在继承关系，当父类中的方法无法满足子类需求的时候可以选择使用重写的方式

- 使用：
  - @override

*   注意：
    1. 重写表示的是子类覆盖父类的方法，当覆盖之后，调用同样的方法的时候会优先调用子类
    2. 重写的方法名称，返回值类型，参数列表必须跟父类一直
    3. 子类重写的方法不允许比父类的方法具备更小的访问权限（由于多态）
       - 父类      public     子类  public
       - 父类      protected     子类  public protected
       - 父类      default     子类  public protected  default
*   重写toString()：
    *   toString()的特殊用法：父类中重写Object类的toString()方法,使得System.out.println(对象)时可以打印出对象的属性
*   父类的静态方法子类可以进行调用(可以被继承)，但是子类不可以重写父类的静态方法
*   构造方法不能重写（因为构造方法不会被继承）
*   父类方法的重写：
    - “ ==”：方法名、形参列表相同。
    -  “≤≤”：返回值类型和异常类型，子类小于等于父类。
    -  “≥”：访问权限，子类大于等于父类

```java
// 普通重写

// Pet.java中
public class Pet {
	//......
    private void play(){
        System.out.println("play.....");
    }
}

// Dog.java中
public class Penguin extends Pet{
	//......
    @Override
    public void play(){
        System.out.println("penguin is playing ice"); //重写了
    }
}
```

```java
// 特殊用法
// 在父类中，重写java.lang.Object类的toString()方法（该父类的父类是Object）

// Pet.java中重写Object类的toString() [test1]
public class Pet {
	//......
    @Override
    private String toString(){
        return "my name is "+this.name+",my age is "+this.age+",my gender is "+this.gender;
    }
}

// Dog.java中重写Pet类的toString() [test2]
public class Dog extends Pet{
	//......
    @Override
    public String toString(){
        return super.toString()+",my sound is "+this.sound;
    }
}

// PetTest.java中调用toString()
public class PetTest {
    public static void main(String[] args) {
        //test1
        Pet pet = new Pet();
        System.out.println(pet);//这里println一个pet对象
        /*
        重写前,会打印：com.mashibing.extend.Pet@4f023edb (打印地址)
        重写后，会打印：my name is null,my age is 0,my gender is null (打印出属性)
        */
        
        //test2
        Dog dog = new Dog();
        System.out.println(dog);
        /*
        重写前，会打印：my name is null,my age is 0,my gender is null
        重写后，会打印：my name is null,my age is 0,my gender is null,my sound is null
        */
    }
}
```

```java
// 父类的静态方法子类可以进行调用，但是子类不可以重写

// Pet.java中
public class Pet {
	//......
    public static void test(){
        System.out.println("static test");
    }
}

// Dog.java中，这样写是不行的
public class Dog extends Pet{
	//......
    @Override //不允许重写
    public static void test(){ //不允许重写
        System.out.println("子类 test"); //不允许重写
    }
}

// PetTest.java中
public class PetTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
		dog.test();
        //子类Dog中没有重写静态方法，静态方法可以被子类继承和调用，此时输出：static test
    }
}
```

<br>

### 抽象类 abstract class

java中的对象是对现实世界的具象化，但是在现实世界中，某些类并不具备实例化的意义，因此可以定义为抽象类

- 创建抽象类的时class前添加 abstract 的关键字（即public abstract class）。抽象类不再能进行实例化，也就是不能new出对象。
- 父类中使用abstract关键字修饰的方法叫做抽象方法，可以不写方法的实现。但子类在继承抽象父类的时候，必须要将父类中的抽象方法进行实现或者将子类也定义为抽象类
- 抽象方法没有方法体
  - 抽象方法必须在抽象类中
  - 抽象方法必须在子类中被实现，除非子类是抽象类

- 有抽象方法的一定是抽象类，但是抽象类中不一定包含抽象方法
- 抽象父类需要构造方法来给子类调用，但有构造方法的抽象父类仍然不能被实例化。

```java
public abstract class Pet { //抽象类
    private String name;
    private int age;
    
    public abstract void print();//抽象方法
}
```

```java
//使用以下两种方式才不会出错：

//必须：方式一：必须重写其抽象方法进行实现（一般只这样用）
public class Dog extends Pet{
    private String gender;
	
    //重写实现
    @Override
    public void print() { 
        System.out.println("dog print"); 
    }
}

//必须：方式二：或者将子类也定义为抽象类 （一般不这样用）
public abstract class Dog extends Pet{ //抽象该子类
    private String gender;
	
    @Override
    public abstract void print(); //抽象该方法
}
```

<br>

<br>

## final

final的使用：

* final可以**修饰变量**：
  * 表示变量的值不可变（常量，等于其他语言的constant）
  * public final int age = 10;
  * 使用final修饰引用型变量，变量不可以再指向另外的对象
    * 使用final修饰引用型变量，变量的值是固定不变的，而变量所指向的对象的属性值是可变的

```java
class Test{
    public static void main(String[] args){
        final Dog dog = new Dog("欧欧");
        dog.name = "美美";
        // dog = new Dog("亚亚"); 不行。使用final修饰引用型变量，变量不可以再指向另外的对象
    }
}
```

* final可以**修饰方法**：
  * 表示方法不可以被重写
  * public final void test(){}
* final可以**修饰类**：
  * 表示类不可以被继承
  * public final class Penguin extends Pet{}

<br>

<br>

## Object类

3.9-Object,多态 1.mp4   00:16:00

### Object类是所有类的父类

- 一个类如果没有使用extends显性的继承另外一个类，那么这个类就继承自Object类
- 打开Object.java：idea中双击shift，搜索Object.java，include none-project items.

```java
public class Person{
}
//等同于
public class Person extends Object{
}
```

### 方法

```java
package java.lang;
import jdk.internal.vm.annotation.IntrinsicCandidate;

public class Object {
    // 构造方法
    @IntrinsicCandidate
    public Object() {}
	
    // getClass()
    @IntrinsicCandidate
    public final native Class<?> getClass();

	// hashCode() 哈希码
    @IntrinsicCandidate
    public native int hashCode();

	// equals() 比较 (两个对象在调用的时候，idea自己会帮忙重写实现，来帮我们比较两个对象的值是否相同？)
    public boolean equals(Object obj) {
        return (this == obj);
    }

	// clone() 克隆
    @IntrinsicCandidate
    protected native Object clone() throws CloneNotSupportedException;

	// toString() 打印地址
    // 使用方法：println一个对象，则会显示该对象的地址。可以被重写。
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

	// notify(),notifyAll(),wait(),wait(long),wait(long,int) 与多线程相关
    @IntrinsicCandidate
    public final native void notify();
    @IntrinsicCandidate
    public final native void notifyAll();
    public final native void wait(long timeoutMillis) throws InterruptedException;
    public final void wait(long timeoutMillis, int nanos) throws InterruptedException {
        if (timeoutMillis < 0) {
            throw new IllegalArgumentException("timeoutMillis value is negative");
        }
        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                                "nanosecond timeout value out of range");
        }
        if (nanos > 0 && timeoutMillis < Long.MAX_VALUE) {
            timeoutMillis++;
        }
        wait(timeoutMillis);
    }
    @Deprecated(since="9")
    
    protected void finalize() throws Throwable { }
}
```

### 快捷重写

Alt+Insert

### 对象的比较--"=="和equals();

- ==： 
  - 比较两基本类型变量的值是否相等
  - 比较两个引用类型（如String，对象）的值即内存地址是否相等，即是否指向同一对象。

- equals() ： 
  - 两对象的内容是否一致

-  示例

  - object1.equals(object2);  如：p1.equals(p2)
    - 比较所指对象的内容是否一样
    - 是比较两个对象，而非两个基本数据类型的变量

  - object1 == object2;  如：p1==p2
    - 比较p1和p2的值即内存地址是否相等，即是否是指向同一对象。

- 自定义类须重写equals()，否则其对象比较结果总是false。*而String类已经重写了equals(),来比较其值。*

<br>

<br>

```java
// 此处代码示例：
// 适用于 继承inheritance 至 当前位置
// exercise/Practice3_9/
```

<br>

<br>

## 多态 polymorphism


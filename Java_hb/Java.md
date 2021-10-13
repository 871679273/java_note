# 面向对象

## 类和对象

## 内存分配

```java
class A{
    int i;
    int j;
}
class TestMemo{
    public static void main(String[] args){
        A aa = new A(); //(A*)malloc(sizeof(A));
        	// new A();在堆中动态分配一块区域，被当作了A对象
        	// aa本身的内存是在栈中分配的
        	// 堆中内存的地址付给了aa
        	// aa指向堆中的内存，aa代表了堆中的内容
        	// aa.i 代表： aa这个静态指针变量所指向的动态内存中的A对象的i这个成员
        aa.i = 10;
        aa.j = 20;
        
    }
}
```

![幻灯片17](./images/幻灯片17.JPG)

- 非java中，stack自动释放，heap需要手动释放。java中都自动了。
- 凡是在stack栈中的都只能在函数内使用，heap中的可以跨函数使用。

```java
class A{
    int i = 10;
    int j = 20;
}
class TestMemo{
    public static void main(String[] args){
        A aa1 = new A();
        A aa2 = aa1;
        
        aa1.j = 99;
        System.out.printf("%d\n", aa2.j); // 99
    }
}
```

## 访问控制符

- 将属性封装进类里，外面不能想面向过程语言那样随意修改（直接访问）里面的属性了。而是只向外界提供了一个按钮，像电视机一样，只有按按钮才能修改。这样变得安全。
- 私有方法（成员=属性+方法），外部不能访问

- protected和public都可以通过对象名.属性的方式访问

- 把一个类想成一个人，内部属性或方法都是自己的东西，访问控制符只是这个人控制自己想要对外部展示什么东西，隐藏什么东西。因此private的属性在内部也可以被内部其他东西访问，都是自己的。（在一个类的内部，所有的成员可以相互访问，访问控制符是透明的；访问控制符是针对外部访问而言的）

- ```java
  //static的存在则规定了另外的规则
  class Test{
      int age = 5;
      static void f() { //加static，mian函数能访问；不加static，main函数不能访问
          System.out.println("fffff");
      }
      
      public static void main(String[] args){
          f();
      }
  }
  ```

## 构造函数

- 构造函数不写void。写：public 类名() 

## 函数重载

- 函数名一样，传入参数不同（个数，类型，顺序），函数不同

## This

- this代表当前时刻正在创建的对象

## static

- 首先，static修饰后，仍然属于类，仍然可以通过创建新的对象来调用

- static修饰后，等于激活了它，它可以通过 [类名（首字母大写）].[属性或方法] 来调用

- static之后，该成员只有一个了，多个对象共用一个static的成员

- static只是表明了该成员具有了可以通过类名访问的潜在特征，但是否可以通过类名访问，还必须满足一个条件：该成员必须是非私有的。

- 若是被private了，就不能被类名.方法/属性 来调用了。（private在static前面，优先级应更高）

- 静态方法不能直接访问非静态成员（因为没有创建对象），非静态成员可以访问静态成员（因为创建了对象）

- 静态方法不能以任何方式引用this和super关键字（当静态方法被调用时，this所引用的对象根本就没有产生）

- ```java
  // 统计创建了几个对象
  class A{
      private int i;
      private static int cnt = 0;
      
      public A(){
          ++cnt;
      }
      
      public A(int i){
          this.i = i;
          ++cnt;
      }
      
      public static int getCnt(){
          return cnt;
      }
  }
  
  class TestStatic_1{
      public static void main(String[] args){
          System.out.printf("当前时刻A对象的个数是：%d\n",A.getCnt());
          A aa1 = new A();
          System.out.printf("当前时刻A对象的个数是：%d\n",A.getCnt());
          A aa2 = new A();
          System.out.printf("当前时刻A对象的个数是：%d\n",A.getCnt());
      }
  }
  ```

- ```java
  // 限制只能创造一个A
  class A{
      public int i = 20;
      private static A aa = new A(); // 先静态的创建了一个aa。它是一个属性。
      
      // 将构造方法通过private锁起来，这样只能通过上面那一行代码，在里面创建出一个对象
      private A(){     
      }
      
      public static A getA(){ // 这个方法公开给大家调用那个aa对象。static不能去掉
          return aa;			// 因为外部没法建对象了，只能通过类名.方法来调用它
      }
  }
  
  public class TestStatic_2{
      public static void main(String[] args){
          A aa1 = A.getA();
          A aa2 = A.getA();
          
          aa1.i = 99;
          System.out.printf("%d\n", aa2.i); // 输出99
          
          if (aa1==aa2){
              System.out.printf("相等"); // 输出相等
          }else{
              System.out.printf("不相等");
          }
      }
  }
  /*
  要理解六个知识点：
  1.构造函数被private了
  2.private static A aa = new A();理解如何new出对象
  3.private static A aa = new A();理解aa是一个属性
  4.private static A aa = new A();理解这里可以定义一个对象指向他本身
  5.public static A getA()；理解static不能省
  6.private static A aa = new A();理解static不能省
  */
  ```

## 继承

- 私有的属性和方法不能被继承

- 私有的物理上已经被继承过来，只不过逻辑上程序员不能去访问它，因此继承必须慎重，否则会浪费内存

- 子类访问父类成员的三种方式

  - 在子类内部访问父类成员
  - 通过子类的对象名访问父类成员
  - 通过子类的类名访问父类成员
  - 代码演示

  ```java
  class A
  {
  	public static int i;
  	protected static int j;
  	private static int k;
  }
  
  class B extends A
  {
  	private void g()
  	{
  		i = 22;
  		//k = 20;
  	}
  }
  
  class M
  {
  	public static void main(String[] args)
  	{
  		A.i = 99;
  		//A.k = 99;  //error
  		B.i = 99; // 可。继承了过来。
  		//B.k = 99; //error
  		
  		B bb = new B();
  		bb.i = 99;
  		//bb.k = 99; //error
  	}
  }
  ```

- 子类永远无法继承父类的构造方法。因此，要在子类的构造方法中使用语句super(参数列表)调用父类的构造方法。（已经继承了父类的属性，需要初始化他们）（也可以全部用this.name = name，但父类属性很多时这样写会很繁琐）

## super

- 子类永远无法继承父类的构造方法。因此，要在子类的构造方法中使用语句super(参数列表)调用父类的构造方法。（已经继承了父类的属性，需要初始化他们）（也可以全部用this.name = name，但父类属性很多时这样写会很繁琐）
- 普通方法中不能调用父类的构造方法（super（））

## 其他

- 当一个对象呗创建时，会对其中各种类型的成员变量自动进行初始化赋值。但其他地方的局部变量编译时是不会自动进行初始化的，java要求所有的局部变量在使用之前都必须得初始化。
- 引用：对指针的危险功能进行屏蔽后剩下的东西，本质还是指针。
- A aa1 = new A();A aa2 = new A(); 
  - aa1、aa2在栈（存放指针）。
  - 两个对象在堆
  - show()方法存放在方法区，只有一个（代码区）。但被两个对象共同使用。
  - ![image-20211013140303666](./images/image-20211013140303666.png)
  - 内部存在这样一个过程：
  - ![image-20211013140704242](./images/image-20211013140704242.png)

- class写完了只是一个模型，必须照这个模型造一个事物，才能有实际存在（意义）。

- ```java
  /* 本程序证明了：一个类的属性可以是一个对象
  就像一辆车里面有各种零件：发动机，底盘等
  */
  class A{
      public void f(){
          System.out.printf("haha\n");
      }
  }
  
  class C{
      public int i = 10;
      public A aa = new A(); //aa是对象，也是C的一个属性
      
      public void g(){
          aa.f();
      }
  }
  
  class M{
      public static void main(String[] args){
          C cc = new C();
          cc.g();
      }
  }
  ```

  
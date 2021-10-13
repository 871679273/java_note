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

- static修饰后，可以通过 [类名（首字母大写）].[属性或方法] 来调用

## 其他

- 当一个对象呗创建时，会对其中各种类型的成员变量自动进行初始化赋值。但其他地方的局部变量编译时是不会自动进行初始化的，java要求所有的局部变量在使用之前都必须得初始化。
- 引用：对指针的危险功能进行屏蔽后剩下的东西，本质还是指针。
- A aa1 = new A();A aa2 = new A(); 
  - aa1、aa2在栈（存放指针）。
  - 两个对象在堆
  - show()方法存放在方法区（代码区）。但被两个对象共同使用。
  - ![image-20211013140303666](./images/image-20211013140303666.png)
  - 内部存在这样一个过程：
  - ![image-20211013140704242](./images/image-20211013140704242.png)

- class写完了只是一个模型，必须照这个模型造一个事物，才能有实际存在（意义）。


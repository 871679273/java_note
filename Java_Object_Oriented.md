# java面向对象

### 面向过程编程/面向对象编程

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

### 类和对象

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

### 局部变量和成员变量

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

### 引用类型

- 数据类型：1.基本数据类型 2.引用数据类型

- 引用类型：1.类 Class 2.接口 interface 3.数组

  ![2021-09-27_163940](/image/2021-09-27_163940.jpg)

- Java中的对象和数组是通过引用对其操作的
  - 引用可以理解为一种受限的指针
  - 指针是可以进行与整数做加减运算的，两个指针之间也可以迚行大小比较运算和相减运算。引用不行，只能进行赋值运算。
  - 引用就是一个变量或对象的别名（引用的本质是一个对象）；指针是一个段内存空间的地址(指向存储一个变量值的空间或一个对象的空间)

<br>

<br>

### 内存分析

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

### 构造方法

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


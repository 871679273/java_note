# JavaSE

<BR>

## 第一部分：基础知识

<BR>

<BR>

<BR>

<BR>

## 第二部分：面向对象

<BR>

### 1.封装

#### 类

- 对一类事物抽象所得到的的一个概念

#### 对象

- 一个具体的事物

#### 构造函数

- 不能有返回值、方法名与类名相同
- 可以有多个。生成一个对象时只能调用其中一个构造函数。
- 默认生成无参，无方法体，无返回值的构造函数。但一旦自己定义，编译器将不再生成默认的构造函数。

#### static

- 凡是static修饰的成员都是静态成员。
  - 静态成员都是属于类的（类变量，类方法）。
  - 可以通过类名调用或对象吗调用，都可以。共用一块堆的内存空间。
- 非静态的可以访问静态的。静态的而不可以访问非静态的（this,super都不能用）
- 必须遵守访问权限。通过类名只能访问一个类中的非私有的静态成员。

#### this

- 非静态方法默认都含有一个this指针。this代表正在调用本方法的对象。

#### final

- 修饰类：则该类不能被继承。
- 修饰方法：则该方法可以被继承但不能被重写。
- 修饰属性：表示该属性能且只能被赋一次值，赋值方式有两种，并且只能选择其中一种：1.定义的同时，显式初始化。2.在构造函数中初始化。
- 使用细节：
  - final修饰的一般叫常量，用XX_XX_XX来命名
  - final修饰的属性在定义类时必须赋初始值，且以后不能再修改。赋值可在以下位置之一：
    - 定义时
    - 在构造器中（可以先定义，后在构造器中赋值）
    - 在代码块中
  - 如果是静态的，则初始化位置只能是：1.定义时。2.在静态代码块中。不能在构造器中赋值
  - 一般来说，类是final，则方法不必要再修饰为final
  - final不能修饰构造方法
  - **final和static的搭配使用**：当final和static搭配使用了，在外部调用该final static成员时，这个类不会被加载（初始化）。这就提高了效率（这是底层编译器的优化设计）
  - 包装类(Integer,Double,Float,Boolean等都是final)，String也是final类

#### 函数重载

- 同名不同参。返回值不能作为是否构成函数重载的依据。

<BR>

### 2.继承

#### 定义

- 子类继承了父类的成员

#### 注意：

- 非私有成员才可以被子类继承
- 重写：
  - 重写方法必须和被重写方法具有相同的方法名称，参数列表，返回值类型。
  - 重写方法的访问权限不能小于被重写方法
- 构造器：
  - 继承后的构造器，里面默认有super()来调用父类构造方法。但写了this()构造器后则super()失效。
  - 子类永远无法继承父类的构造方法。因此，要在子类的构造方法中使用语句super(参数列表)调用父类的构造方法。（已经继承了父类的属性，需要初始化他们）（也可以全部用this.name = name，但父类属性很多时这样写会很繁琐；且父类属性私有时，访问不了，但用super构造方法可以）
  - 普通方法中不能调用父类的构造方法（super（））
  - 必须是构造方法的第一条语句
  - 不写super，则默认调用super（）

<BR>

### 3.多态

#### 定义

- 同一代码可以随上下文的不同而执行不同的操作，俗称多态
- 即：
  - 一个父类的引用它既可以指向父类对象也可以指向子类对象
  - 他可以根据当前时刻指向的不同，自动调用不用对象的方法
- 多态的前提是两个对象（类）之间存在继承关系

#### 编译类型和运行类型

- 编译类型看对象定义时等号的左边，运行类型看右边

- 编译类型在定义对象时就确定了，不能改变

- 运行类型是可以变化的

- 运行类型可以用obj.getClass()获取

- ```java
  Animal animal = new Dog();
  animal = new Cat();//运行类型变了，编译类型没变，仍是Animal
  ```

#### 多态的向上转型

- 本质：父类的引用指向了子类的对象
- 语法：父类类型 引用名 = new 子类类型();
- 特点：
  - 编译类型看左边，运行类型看右边
  - 可以调用父类中的所有成员（遵循访问权限），最终运行效果看子类的具体实现
  - 不能调用子类中的特有成员（因为在编译阶段看的是编译类型，所有这样做时直接会出错）

#### 多态的向下转型

- 语法： 子类类型 引用名 = （子类类型） 父类引用;
- 只能强转父类的引用，不能强转父类的对象
- 要求父类的引用必须指向的是当前目标类型的对象
- 当向下转型后，可以调用子类类型中的所有成员

#### 注意事项

- 属性没有重写的说法。属性的值看编译类型是什么。
- aa instanceOf AA。可以用于判断对象的运行类型是否为XX类型或XX类型的子类型
- 通过父类的引用，只能访问子类从父类继承过来的成员
- 只有在父类的引用本身指向的就是一个子类对象上，我们才可以把父类的引用强制转化为子类的引用

#### java的动态绑定机制

（非常非常重要）

- 当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
- 当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用

#### 多态的应用

- 多态数组
- 多态参数

<BR>

### 相关知识

#### Object类

- equals和==:

  - ==：
    - ==是比较运算符
      1. 既可以判断基本类型，又可以判断引用类型
      2. 如判断基本类型，则判断值是否相等
      3. 如判断引用类型，则判断地址是否相等

  - equals:
    - equals是Object类中的方法，只能判断引用类型
    - 默认判断的是地址是否相等。
    - 子类往往重写该方法，用于判断内容是否相等。（如Integer，String）

- hashCode()

- toString()

- finalize()

  - 当对象被回收时，系统自动调用该对象的 finalize 方法。子类可以重写该方法，做一些释放资源的操作 
  - 什么时候被回收：当某个对象没有任何引用时，则 jvm 就认为这个对象是一个垃圾对象，就会使用垃圾回收机制来销毁该对象，在销毁该对象前，会先调用 finalize 方法(程序员就可以在里面写自己的业务逻辑代码，比如释放资源：数据库连接、打开的文件......)。如果不重写finalize，那么就会调用Object类的finalize，即默认处理。
  - 垃圾回收机制的调用，是由系统来决定(即有自己的 GC 算法), 也可以通过 System.gc() 主动触发垃圾回收机制。提示： 我们在实际开发中，几乎不会运用 finalize , 所以更多就是为了应付面试.

#### 代码块

- ##### 定义：

  - 代码块又称为初始化块，属于类中的成员（即是类的一部分），
  - 类似于方法，将逻辑语句封装在方法体中，通过{}包围起来
  - 和方法不同，没有方法名，返回值，参数，只有方法体，
  - 而且不用通过对象或类显式调用，而是加载类时、创建对象时隐式调用

- ##### 语法：

  - [修饰符]{ ...代码... };

- ##### 说明注意

  - 修饰符可选，但要写的话只能写static
  - 代码块分为两类
    - 使用static修饰的叫静态代码块
    - 没有static修饰的叫普通代码块/非静态代码块
  - 逻辑语句可以为任何逻辑语句（输入输出、方法调用、循环、判断等）
  - ; 分号可以写可以省略

- ##### 应用场景和好处

  - **构造代码块**：将多个不同构造器里相同的代码抽取至构造代码块中，提高代码复用性。构造代码块中的代码比构造器先执行。

- ##### 注意和细节

  - **静态代码块**：作用就是对类进行初始化。随着类的加载而被执行，且只执行一次。普通代码块每创建一个对象调用一次。

  - **类什么时候会被加载（重要）**
    1. 创建对象实例时(new)
    2. 创建子类对象实例，父类也会被加载
    3. 使用类的静态成员时
    
  - **普通的代码块，在创建对象实例时，会被隐式的调用。被创建一次就调用一次。如果只是使用类的静态成员时，普通代码块并不会执行。**

  - **创建一个对象时，在一个类的调用顺序是（重要）：**
    1. 先调用静态代码块和静态属性初始化（先初始化类。静态代码块和静态属性初始化调用时优先级一样，所以按照定义的顺序调用）
    2. 再调用普通代码块和普通属性的初始化。（两者优先级一样，按定义顺序调用）
    3. 最后调用构造方法。
    
  - **构造器的最前面隐含了super()和调用普通代码块**

  - **创建对象时，初始化顺序（含继承关系时）**：

    - **原则**：
      - 先初始化类（先执行static），再创建对象。
      - 构造器里隐含了一个super()在最前面。
      - 先进入super()，（父类为Object则不会执行任何东西），再初始化代码块和属性，最后进入构造器。

    1. 先初始化类：父类静态代码块和静态属性--->子类静态代码块和静态属性
    2. 再创建对象：进入子类构造器，构造器先执行super(),进入父类构造器。
    3. 执行父类普通代码块、初始化普通属性（两者优先级一样）--->再执行父类构造方法代码
    4. 回到子类，执行子类普通代码块、初始化普通属性（两者优先级一样）--->再执行子类构造方法代码

  - **静态代码块只能调用静态成员。普通代码块可以调用任何成员。**

  - **单例模式**：静态方法和属性的经典使用

#### 抽象类

##### 定义

- 当父类的一些方法不能确定具体内容时，可以用abstract关键字来修饰该方法。同时有抽象方法就必须要abstract修饰类。
- 一般来说，抽象类会被继承， 由其子类来重写、实现抽象方法
- 抽象类的价值在于设计。考官爱问，在框架和设计模式中使用较多

##### 语法

- ```java
  abstract class Animal{ //修饰符在abstract前
  	public abstract void cry();//抽象方法，没有方法体（没有{}符号）
  }
  ```

##### 注意细节

- 抽象类不能被实例化
- 抽象类不一定要包含抽象方法（而且可以有实现的方法（不抽象的方法））
- 一旦类包含了抽象方法，则必须声明该类为抽象类
- abstract只能修饰类和方法。（不能修饰其他:属性等）

- 只重写了抽象类部分抽象方法的类也必须得被标记为abstract
- 抽象类可以有任意成员（抽象类本质还是类），比如：非抽象方法、构造器、静态属性等
- 如果一个类继承了抽象类，则他必须实现抽象类的所有抽象方法，除非他自己也声明为abstract类
- 抽象方法不能使用private,final,static来修饰，因为这些关键字都是和重写相违背的

#### 接口

##### 定义

- 接口就是给出一些没有实现的方法，封装到一起，到某个类要使用的时候，再根据具体情况把这些方法写出类
- 语法：
  - interface 接口名{ //属性 //方法}
  - class 类名 implements 接口{ 自己属性; 自己方法; 必须实现的接口的抽象方法 }

- 小结：
  - 在jdk7.0前，接口中的方法都是public abstract。接口里所有方法都没有方法体。
  - 在jdk8.0后，接口类还可以有静态方法，默认方法，可以有具体实现。要写上default、static修饰符。

##### 注意：

- 可以省略abstract，自动是抽象方法
- 如果一个类implements了接口，则需要将该接口的所有抽象方法都实现

- 接口不能被实例化
- 接口中所有方法都是public方法，public abstract可以省略
- 抽象类实现接口，可以不实现接口的方法
- 一个类同时可以实现多个接口
- 接口中的属性只能是final，而且是public static final 的（可以省略）。属性可以用接口名.属性名来调用。
- 接口不能继承其他类。可以继承多个其他接口。
- 接口的修饰符只能是public和默认的。（这一点和类是一样的）

- 不可以定义接口对象，但接口却可以实现多态
- 重写接口方法时public不能省
- 举例：
  - 线程的创建
  - 事件的处理
  - 容器的组织方式
  - serializable接口

##### 接口的多态特性

- 接口类型的变量可以指向实现了接口的对象实例

##### 接口vs继承

- 解决的问题不同：
  - 继承的价值主要在于：解决代码的复用性和可维护性
  - 接口的价值主要在于：设计。设计好各种规范（方法），让其他类去实现这些方法。更灵活。
- 接口更灵活：
  - 继承时is-a关系
  - 接口是like-a关系
- 接口在一定程度上实现了代码解耦（即：接口规范性+动态绑定机制）

<br>

#### 内部类

##### 分类

- 定义在外部类局部位置上（比如方法内）：
  - 局部内部类（有类名）
  - 匿名内部类（没有类名，重点！！）
- 定义在外部类的成员位置上
  - 成员内部类（没有static修饰）
  - 静态内部类（使用static修饰）

##### 局部内部类

- 局部内部类是定义在外部类的局部位置，通常在方法
- 可以直接访问外部类的所有成员，包括私有的
- 不能添加访问修饰符（因为他的地位就是局部变量），但可以使用final修饰
- 作用域：仅仅在定义它的方法或代码块中
- 局部内部类可以直接访问外部类的成员
- 使用：外部类在方法中创建内部类对象，然后调用即可
- 如果外部类和内部类的成员重名了，默认会遵循就近原则，如果想访问外部类的成员，使用 外部类名.this.成员 去访问。

##### 匿名内部类

- 基于接口的匿名内部类

1. ```java
   //创建了一个实现了接口的对象，但这个对象所属的类是匿名的。把这个对象交给接口类去引用，实现多态。
   //该匿名内部类只使用一次。
   //jdk底层在创建匿名内部类时（名字为'外部类名$1'），立马就创建了实例.
   //该匿名内部类实现了接口
   InterfaceA interface = new InterfaceA(){
   	.......... 
       //override some methods
   }
   ```

- 基于类的匿名内部类
  - 同理。相当于extends了父类。
  - 基于抽象类的匿名内部类则必须重写方法。
- 典型用法：匿名内部类当做实参直接传递。(Chapter10 Homework4)

##### 成员内部类

- 可以直接访问外部类的所有成员，包含私有的

- 从成员的角度来看，可以添加任意修饰符

- 访问方式：

  - 在外部类里：创建该成员内部类对象，访问

  - 在外部其他类里：

    ```java
    //方式一
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner(); //相当于是outer实例的一个成员
    //方式二(缩写)
    Outer.Inner inner = new Outer().new Inner();
    //方式三（通过一个方法来获取）
    Outer.Inner inner = new Outer().getInnerInstance();//自己写一个方法返回一个inner
    ```

- 就近原则：如果内部类的成员与外部类的成员重名，则遵守就近原则。可通过外部类名.this.属性来访问外部类的成员

##### 静态内部类

- 在外部类成员的位置，使用static修饰

- 可以访问外部类的成员：静态的可以，非静态的不可以

- 从成员的角度来看，可以添加任意修饰符

- 作用域和其他成员一样，为整个类体

- 访问方式：

  - 在外部类里：创建该成员内部类对象，访问

  - 在外部其他类里：

    ```java
    //方式一
    Outer.Inner inner = new Outer.Inner();//可以通过类名来访问
    //方式二（通过一个方法来获取）
    //若是创建的静态方法，则可以直接类名访问该方法，获得对象
    ```

- 就近原则：
  - 如果内部类的成员与外部类的成员重名，则遵守就近原则。
  - 可通过外部类名.属性来访问外部类的成员（因为访问的是外部类的静态成员）

<br>

<br>

## 第三部分：高级部分

### 0.其他

#### 枚举类

##### 定义

- 枚举对应英文（enum）
- 枚举是一组常量的集合
- 枚举属于一种特殊的类，里面只包含一组优先的特定的对象
- 枚举对象相当于枚举类的成员，用类名.对象名调用某个对象

##### 实现

1. **自定义类，实现枚举**

   1. 构造器私有化
   2. 本类内部创建一组对象
   3. 对外暴露对象(public static final)
   4. 可以提供get方法，不要提供set方法

   ```java
   //步骤
   //1.构造器私有化
   //2.去掉setter方法，因为枚举对象值通常为只读
   //3.对枚举对象/属性使用final+static共同修饰，实现底层优化
   //4.枚举对象名通常全部大写
   //5.枚举对象根据需要，也可以有多个属性
   
   class Season{
       private String name;
       private String description;
       
       private Season(String name,String description){
           this.name = name;
           this.description = description;
       }
       
       public final static Season SPRING = new Season("春天","温暖");
       public final static Season SUMMER = new Season("春天","温暖");
       public final static Season AUTUMN = new Season("春天","温暖");
       public final static Season WINTER = new Season("春天","温暖");
       
       //下面是getters，没有setters
       //可以改写tostring来打印
   }
   ```

2. **使用enum关键字实现**

   ```java
   //如果使用了enum来实现枚举类
   //1.使用关键字enum替代class
   //2.public static final Season SPRING = new Season("春天","温暖"); 直接使用
   //    SPRING("春天","温暖");代替。
   //    语法：常量名(实参列表)
   //3.如果有多个常量（对象），使用逗号间隔
   //4.如果使用enum来实现，要求定义常量对象，写在最前面
   //5.如果使用了无参构造器，则可以省略()如：enum Gender{BOY,GIRL;}
   //6.enum类的toString返回的是name
   enum Season{
       SPRING("春天","温暖"), SUMMER("春天","温暖"), AUTUMN("春天","温暖"), 
       WINTER;
       
       private String name;
       private String description;
       
       private Season(String name,String description){
           this.name = name;
           this.description = description;
       }
       
       //下面是getters，没有setters
   }
   ```

##### enum类的常用方法

1. name() 返回枚举对象的名字（建议用toString）
2. ordinal() 返回对象编号，次序，零开始编号
3. values() 返回对象数组
4. valueOf(String str) 给对象名，返回对象
5. Season.AUTUMN.compareTo(Season.SUMMER) 比较的是编号（结果是编号相减）

##### 使用细节

1. 使用enum关键字后，不能再继承其他类。因为enum已经是继承Enum类，java只能单继承
2. 使用enum关键字后，可以实现接口。

<br>

#### 注解

- Annotation、Metadata
- 三个基本Annotation:
  - @Override
  - @Deprecated:用于表示某个程序元素（类，方法等）已过时。
  - @SuppressWarnings：抑制编译器警告

<br>

<br>

### 1.异常

#### 定义

- 运行时的错误
- 处理异常，使程序能继续运行
- 快捷键 Ctrl + Alt + T

#### 分类

- Throwable
  - Error
    - StackOverflowError
    - OutOfMemoryError
  - Exception
    - RuntimeException (NullPointerException、ArithmeticException...)
    - 编译异常
- 无法处理的错误error
- 可以处理的异常
  - 必须处理的异常
    - 是Exception子类但不是RuntimeException的子类
  - 可处理可不处理的异常
    - 是RuntimeException的子类

#### 常见异常

- 常见运行时异常
  - NullPointerException空指针异常
    - 当程序试图在需要对象的地方使用null时，抛出该异常
  - ArithmeticException数学运算异常
  - ArrayIndexOutOfBoundsException 数组下标越界异常
  - ClassCastException  类型转换异常
  - NumberFormatException 数字格式异常

#### 注意问题：

- finally{....}一定会执行

- 先捕获子类异常，再捕获父类异常，顺序不可颠倒

- 重写方法抛出的异常的范围不能大于被重写方法抛出的异常的范围

- 假设f方法抛出了A异常，则f方法有两种方式处理A异常：
  1. throws A：

     将发生的异常抛出，交给调用者（方法）来处理，（f1-->main-->jvm）最顶级的处理者就是JVM，jvm处理方式：1.输出异常信息2.退出程序

  2. try{ ... } catch( ){ ... }

- 可以使用多个catch分别捕获多个异常，子类异常要在父类异常之前

- 可以只有try-finally。

- 对于编译异常，程序中必须处理，比如try-catch或throws

- 对于运行时异常，程序中如果没有处理，默认就是throws的方式处理

- 

#### 示例

```java
// 1
try{
    int x = 10 / 0;
}catch (Exception e){
    System.out.println("异常信息"+e.getMessage());
}
```

```java
//输入一个整数，如果不是整数，提示一下，继续输入，直到为整数为止。
public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String str = "";
        
        while (true){
            System.out.println("input an int number");
            str = scanner.nextLine();
            try {
                num = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入错误");
            }
        }
        
    }
}
```

```java
//自定义异常
```

<br>

### 2.线程

#### 定义

- 一个程序运行时的不同执行路径

#### 创建线程的方式：

- 继承Thread类
- 实现Runnable接口

#### 线程的同步

- 多个线程操作同一资源，并且要求这些操作中的若干个操作不能被中断，这时就需要考虑线程同步的问题
- 线程同步是通过synchronized来实现的
- synchronized可以修饰两种：
  - 代码块
  - 方法（默认锁定的是this）
- 示例：
  - 卖票

#### 线程的通信

- 有时多个线程只有彼此相互协作才可以完成某个功能，这时就需要线程的通信
- 实现方式
  - wait 和 notify()/notifyAll()
- 示例
  - 生产和消费

<br>

### 3.包

#### 包的生成与运行

- package 语句必须是第一条语句。类名是报名和类名的组合。只有在整个包的最上层目录才可以运行

#### 同包，不同包的相互访问

#### jar包的生成与jar包的使用

- 普通jar包的生成
- 可运行jar包的生成

<br>

### 4.GUI

#### 内部类

- 在一个类内部定义的类叫内部类
- 内部类的方法可以访问外部类的所有成员
- 外部类的方法不可以直接访问内部类的任何成员
- 产生内部类的原因：
  - 如果一个类A要使用B类的所有成员，并且A类不需要被除B以外的其他类访问，则我们可以把A定义成B的内部类
  - 几乎不存在直接生成内部类对象的问题，因此几乎不存在外部类需要访问内部类成员的问题

#### 匿名类

- 匿名类是内部类的一种极端表现形式
- 匿名类可以访问外部类的所有成员和包裹本匿名类方法中的final类型的局部变量

<br>

<br>

### 5.IO

#### 定义

- 如果一个类是用来完成程序和设备之间的数据传输，则这个类有一个特殊的称为叫做流。
- 流一定是类，但类不一定是流
- 分类：
  - 输入流  输出流
  - 字节流  字符流
  - 原始流  包裹流

#### 四大基本抽象流

- InputStream OutputStream  <br>

  Reader Writer

- 字节流和字符流的区别：
  - 字节流可以处理所有格式的文件
  - 字符流只能处理文本格式的文件

#### 文件流

- FileInputStream  FileOutputStream

  FileReader  FIleWriter

#### 缓冲流

- BufferedInputStream  BufferedOutputStream

  BufferedReader  BufferedWriter

- 缓冲流可以提高数据传输的速度

#### 转化流

- OutputStreamWriter  InputStreamReader
- 例子：
  - 编程实现：把用户从键盘输入的字符保存到一个String对象中

#### 数据流

- DataInputStream   DataOutputStream
- 数据流可以把基本类型数据的二进制直接读入或写出
- 例子：
  - 编程实现：将long类型数据写入byte数组，然后再从byte数组中把该数据读出

#### Print流

- PrintStream  PrintWriter
- Print流可以把基本类型数据格式化后的字符串输出
- 例子:
  - 编程实现：把键盘输入的数据写入A文件，如果输入有误则把出错信息写入B文件

#### Object流

- ObjectInputStream  ObjectOutputStream
- Object流可以把一个对象直接写入或读出

<br>

### 6.容器

#### 定义

- 如果一个类是专门用来存放其他类对象的，则这个类有另外一个特殊的名字叫容器

- 容器一定是类，但类不一定是容器

#### Collection接口

##### Set 接口

- 无序，不允许重复
- 实现类：
  - TreeSet  HashSet

##### List 接口

- 有序，允许重复
- 实现类：
  - ArrayList  LinkedList

##### Map 接口

- 既保存数据本身，也保存数据的主键的一种接口
- 实现类：HashMap  TreeMap

##### hashCode( )和equals()方法

- 所有hash开头的都用要重写两个方法

#### Collections类

- 该类提供了对Collection接口实现类的排序，倒置、查找等功能

#### Comparable 接口

- 通过该接口的方法可以制定出对象之间比较的标准
- 凡是需要进行对象的比较排序的场合均可以考虑实现该接口

#### Iterator 接口

- 利用该接口提供的方法我们可以遍历所以容器中的元素

<br>

<br>

<br>

<br>

## 设计模式

### 单例模式

#### 1.定义

- 单例：单个的实例
- 所谓类的单例设计模式，就是采取一定的方法，保证在整个软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法。
- 单例模式有两种：1.饿汉式。2.懒汉式。

#### 2.饿汉式

- 步骤：
  1. 构造器私有化（防止用户直接new对象）
  2. 类的内部创建对象（private static 作为属性）
  3. 向外暴露一个静态的公共方法。（public static ClassName getInstance(){return 对象;}）
  
- ```java
  public class SingleTon01 {
      public static void main(String[] args) {
          //通过方法可以获取对象
          GirlFriend instance = GirlFriend.getInstance();
      }
  }
  
  class GirlFriend {
      private String name;
      //为了能够在静态方法中，返回 gf对象，需要将其修饰为static
      //對象，通常是重量級的對象, 餓漢式可能造成創建了對象，但是沒有使用.
      private static GirlFriend gf = new GirlFriend("小红红");
  
      private GirlFriend(String name) {
          this.name = name;
      }
  
      public static GirlFriend getInstance() {
          return gf;
      }
  }
  ```

  

#### 3.懒汉式

- 步骤：

  1. 构造器私有化（防止用户直接new对象）
  2. 定义一个static静态属性对象
  3. 向外暴露一个静态的公共方法，可以返回一个对象。该方法加入if判断，如果static属性为空，则创建对象。
  4. 懶漢式，只有當用戶使用getInstance時，才返回cat對象, 後面再次調用時，會返回上次創建的cat對象，從而保證了單例

- ```java
  public class SingleTon02 {
      public static void main(String[] args) {
          Cat instance = Cat.getInstance();
      }
  }
  
  class Cat {
      private String name;
      private static Cat cat ; //默認是null
  
      private Cat(String name) {
          this.name = name;
      }
      
      public static Cat getInstance() {
          if(cat == null) {//如果還沒有創建cat對象
              cat = new Cat("小可愛");
          }
          return cat;
      }
  }
  ```

#### 4.饿汉式VS懒汉式

1. 创建时机不同：饿汉式是在类加载时就创建对象实例。懒汉式是在使用时才创建。
2. 线程安全问题：懒汉式存在线程安全问题，饿汉式不存在。
3. 浪费资源问题：饿汉式存在浪费资源的可能。
4. JavaSE标准类中，java.lang.Runtime就是经典的单例模式

<br>

<br>

### 模板模式

#### 1.定义

```java
abstract public class Template { //抽象类-模板设计模式

    public abstract void job();//抽象方法

    public void calculateTime() {//实现方法，调用job方法
        //得到开始的时间
        long start = System.currentTimeMillis();
        job(); //动态绑定机制
        //得的结束的时间
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间 " + (end - start));
    }
}
//calculateTime就是模板，job就是自己可以写的东西
```


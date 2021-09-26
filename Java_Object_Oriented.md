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

#### 4.注意

- 类可以不添加属性和方法
- 一个java文件中可以定义N个class，但只能有一个public class且其类名跟文件名保持一致


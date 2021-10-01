# 异常

<br>

<br>

## 异常 

在程序运行过程中，出现的不正常情况叫做异常

1. 相同的代码在运行的时候，根据输入的参数或者操作的不同，有可能会发生异常，有可能不会发生异常，应该在写代码的过程中尽可能的保证代码的正确性，不要到处都bug
2. 如果要解决代码中出现的异常，需要添加非常复杂的代码逻辑来进行判断，会使代码变得非常臃肿，不利于维护，可读性比较差。因此，推荐大家使用异常机制来处理程序运行过程中出现的问题
3. 程序在运行过程中如果出现了问题，会导致后面的代码无法正常执行，而使用异常处理机制之后，可以对异常情况进行处理。同时后续的代码会继续执行，不会中断整个程序
4. 在异常的处理过程中，不要只是简单的输出错误，要尽可能的讲详细的异常信息进行输出。使用 e.printStackTrace(); 打印异常的堆栈信息，可以从异常信息的最后一行开始追踪，寻找自己编写的java类

## 异常处理

Java编程语言使用异常处理机制为程序提供了错误处理的能力：

程序中预先设置好对付异常的处理办法 —> 程序运行 —> 异常 —> 对异常进行处理 —> 处理完毕，程序继续运行

**异常处理的方式**：

Java的异常处理是通过5个关键字来实现的：try、catch、finally、throw、throws

![image-20211001230616397](../image/image-20211001230616397.png)

### 1、捕获异常

try {代码逻辑} catch(Exception e) {异常处理逻辑}

```java
public class TestException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("请输入被除数:");
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1 / num2));
        }catch(Exception e){
            System.out.println("出现异常");
            e.printStackTrace();// 异常跟踪和输出
            //System.out.println("--------");
            //System.out.println(e.getMessage());
        }
        System.out.println("感谢使用本程序！");
    }
}
```

try {代码逻辑} catch(具体的异常 e) {异常处理逻辑} catch(具体的异常 e)：(推荐)

```java
public class TestException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("请输入被除数:");
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1 / num2));
        }catch(ArithmeticException e){
            System.out.println("数学异常，除数不能是0");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("输入的参数值类型不匹配");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("空指针异常");
            e.printStackTrace();
        }
        System.out.println("感谢使用本程序！");
    }
}
```

 - #### 执行过程中可能存在的情况：

   1. **正常执行。**只执行try中的代码

   2. **遇到异常情况。**会处理try中异常代码之前的逻辑，后面的逻辑不会执行，最后会执行catch中的代码

      ![image-20211001232051048](../image/image-20211001232051048.png)

      - （常用）catch(Exception e){} 里面写入：**e.printStackTrace()**;  输出异常的堆栈信息。堆栈跟踪功能显示出程序运行到当前类的执行流程
      - （少用）catch(Exception e){} 里面写入：System.out.println(**e.getMessage()**);。返回异常信息描述字符串，是printStackTrace()输出信息的一部分
      - （推荐）多写几个catch去捕获具体异常

   3. **异常类型不匹配。**使用多重catch的时候，会遇到异常子类不匹配的情况，此时依然会报错，因此建议在catch的最后将所有的异常的父类写上。可以针对每一种具体的异常做相应的更丰富的处理

      ![image-20211001235125527](../image/image-20211001235125527.png)

- #### 注意：

  - 当使用多重的catch的时候一定要注意相关异常的顺序，将子类放在最前面的catch，父类放在后面的catch。（Exception是ArithmeticException的父类）

 - #### 常见的异常类型

   | 异 常 类 型                    | 说 明                                 |
   | ------------------------------ | ------------------------------------- |
   | Exception                      | 异常层次结构的父类                    |
   | InputMismatchException         | 输入类型不匹配                        |
   | ArithmeticException            | 算术错误情形，如以零作除数            |
   | ArrayIndexOutOfBoundsException | 数组下标越界                          |
   | NullPointerException           | 尝试访问 null 对象成员                |
   | ClassNotFoundException         | 不能加载所需的类                      |
   | IllegalArgumentException       | 方法接收到非法参数                    |
   | ClassCastException             | 对象强制类型转换出错                  |
   | NumberFormatException          | 数字格式转换异常，如把"abc"转换成数字 |


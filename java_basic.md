##### 简单的DOS命令

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

##### HelloWorld

1.写java文件<br>

public class HelloWorld{<br>

&nbsp;&nbsp;&nbsp;&nbsp;public static void main(String [] args){<br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("hello菜鸟");<br>

&nbsp;&nbsp;&nbsp;&nbsp;}<br>

}

2.编译<br>

命令行中，进入所在目录：javac HelloWorld.java<br>

3.执行（解释）<br>

java HelloWorld.java<br>

<br>

##### 注释

1.单行注释：//<br>

2.多行注释：/* */<br>

3.文档注释：<br>

/**<br>

*第一行内容<br>

*第二行内容<br>

*/<br>

<br>

##### 反编译工具

class to java<br>

1.ide插件<br>

2.jd-gui.exe<br>

<br>

##### 标识符（命名规则）

###### 硬性规定：<br>

1.开头必须是字母，或下划线，或$（不能是数字）<br>

2.其他部分必须是字母，数字，下划线，美元符号，不能有其他符号<br>

3.大小写敏感，长度无限制<br>

4.不能是java关键字<br>

###### 规范建议：<br>

1.驼峰标识<br>

- 类名、接口：首字符大写
- 方法、变量：首字符小写

2.见名知意<br>

<br>

##### 字符集

<br>

##### JAVA基本数据类型

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

##### 变量和常量

###### 变量

1. java是一种强类型语言，每个变量都必须声明其类型<br>
2. 变量是最基本的储存单元（另如对象），变量要素包括变量名，变量类型，作用域<br>
3. 先声明后赋值：int a; a= 10; 声明+赋值(常用): int a = 10;<br>
4. 类内，方法外定义的变量叫成员变量，存在默认值；类内，方法内定义的变量，不存在默认值，需要进行初始化操作（手动赋值）。<br>
5. int x=10, y=20;<br>

###### 常量

1. final修饰的变量为最终变量（常量），不能二次赋值；final double PI =3.14;<br>

<br>

##### 运算符

- 算数运算符：+、 -、 *、 取整除：/、 取余数（模）：%；<br>
- 单目运算符：a++ ：先输出，再加自身； ++a：先加自身，再输出<br>
- 






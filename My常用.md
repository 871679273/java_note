### 快捷键和代码模板

- 格式化代码：ctrl+alt +L
- 查看类的层级关系：ctrl+h
- 定位方法位置：ctrl+b
- 自动分配变量名：输入new 类().var 

【1】创建内容：alt+insert

【2】main方法：psvm

【3】输出语句：sout

【4】复制行：ctrl+d

【5】删除行：ctrl+y

【6】代码向上/下移动：Ctrl + Shift + Up / Down

【7】搜索类：  ctrl+n

【8】生成代码  ：alt + Insert（如构造函数等，getter,setter,hashCode,equals,toString）

【9】百能快捷键 : alt + Enter （导包，生成变量等）

【10】单行注释或多行注释 ：  Ctrl + / 或 Ctrl + Shift + /

【11】重命名 shift+f6

【12】for循环  直接 ：fori   回车即可

【13】代码块包围：try-catch,if,while等  ctrl+alt+t

【16】代码一层一层调用的快捷键：
点进源码：ctrl+鼠标悬浮在代码上+点进去即可：
【19】撤回：ctrl+z

【20】REDO操作：
如果跟搜狗输入法的快捷键冲突，可以选择将搜狗的快捷键取消。

- file-settings-Editor-General-Postfix Completion 和 Editor-Live Templates
- "hhh".sout、b.sout(soutp:打印方法的形参soutm:打印方法的名字soutv:打印变量)
- 普通for循环：   fori（正向）   或者   .fori （正向）   . forr(逆向)。 增强for循环：  iter  或者  .for（可以用于数组的遍历，集合的遍历）
- ifn 或者  .null ：判断是否为null  （if null）
  inn 或者 .nn ：判断不等于null   (if not null)
-  属性修饰符：
  prsf : private static final
  psf  :public static final 

### 随机数

```java
foodX = ((int)((Math.random())*30)+1)*25;//[25,750]

foodY = (new Random().nextInt(26)+4)*25;//[100,725]
```

### 运算符

```java
//boolean取反
isStart =! isStart;
```

### switch

```java
switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("记账系统》》》》退出");
                    System.out.println("确定要退出吗？Y/N");
                    String isExit = sc.next();
                    switch (isExit){
                        case "Y":
                            System.out.println("已退出");
                            return;//结束当前方法
                        default:
                            break;
                    }
```

### 循环

- 增强for循环

```java
for(int num:balls){
    System.out.print(num+"\t"); //不换行
}
//balls可以是数组
```

- 

### 相等比较

```java
//字符串
"猫".equals(petName) //与petName.equals("猫")相比，可以防止空指针异常。petName可能是空的。
"hello".equals("hi")

//int,char
用 ==
```

### equals重写

```java
//比较对象属性值是否相等
//重写父类(Object)的equals()方法：public boolean equals(Object obj)，并判断测试类中创建的两个对象是否相等。相等就是判断属性是否相同
public boolean equals(Object obj) {
    //判断两个比较对象（引用）是否相同
    if (this == obj) {
        return true;
    }
    
    //判断obj 是否是 Doctor类型或其子类
    //过关斩将 校验方式
    if (!(obj instanceof Doctor)) { //不是的话
        return false;
    }

    //向下转型, 因为obj的运行类型是Doctor或者其子类型
    Doctor doctor = (Doctor)obj;
    return this.name.equals(doctor.name) && this.age == doctor.age &&
        this.gender == doctor.gender && this.sal == doctor.sal;

}
```



### 转义符

```java
// 换行
\n
// tab
\t
```

### 数组

#### Arrays类静态方法

实现对数组的操作

```java
//实现对数组的排序
Arrays.sort(data)
//将数组中的内容全部打印出来
Arrays.toString(); 
//比较数组元素是否相等
Arrays.equals();
//二分查找法找指定元素的索引值（下标）
Arrays.binarySearch(); 
//截取数组
Arrays.copeOf(arr,num) 
Arrays.copeOfRange(arr,rangeL,rangeR);
```

### length

```java
//获取数组长度
arr.length //属性
//获取string长度
str.length() //方法
```

### 类型转换

```java
//String to int
int a = Interger.parseInt("15");
//String to double
double d1 = Double.parseDouble("18.8");
//char to string
char c = '强';
String str = c + "";
```

### Math

```java
//向上取整用
Math.ceil(double a)
//向下取整用
Math.floor(double a)
//次方
Math.pow(a,b);
//平方根，立方根
Math.sqrt();Math.cbrt();
```

### Date

```java
Date date = null; // date 是 java.util.Date 类型，表示日期
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //可以用于日期格式化的
sdf.format(date)//调取时间

```


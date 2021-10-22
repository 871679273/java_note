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

### 增强for循环

```java
for(int num:balls){
    System.out.print(num+"\t"); //不换行
}
//balls可以是数组
```

### equals

```java
"猫".equals(petName) //与petName.equals("猫")相比，可以防止空指针异常。petName可能是空的。
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


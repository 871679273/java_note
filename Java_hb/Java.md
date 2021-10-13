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

![幻灯片17](/images/幻灯片17.JPG)

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




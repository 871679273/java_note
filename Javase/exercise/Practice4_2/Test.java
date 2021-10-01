package Practice4_2;

//public class Test {
//    public static void main(String [] args){
//        new Outer().new Inner().print();//调用方法获取私有属性
//    }
//}


//public class Test {
//    public static void main(String[] args) {
//        Outer.Inner inner = new Outer().new Inner();
//        inner.show();
//    }
//}

public class Test {
    public static void main(String[] args) {
        StaticClass.InnerClass innerClass = new StaticClass.InnerClass();
//        StaticClass.InnerClass innerClass = new StaticClass().new InnerClass();
        innerClass.show();
    }
}

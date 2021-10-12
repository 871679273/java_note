package Practice4_2;

//class Outer{
//    private String info="hello World";//声明私有属性
//    class Inner{
//        public void print(){     //打印输出的方法
//            System.out.println(info); //内部类可以访问外部类的私有属性
//        }
//    }
//}

public class Outer {
    private String name="外部类";

    class Inner{
        private String name = "内部类";
        public void show(){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Outer.this.name);
        }
    }
}

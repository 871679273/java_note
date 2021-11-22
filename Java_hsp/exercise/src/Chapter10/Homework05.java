package Chapter10;

/**
 * @Auther: xhq
 * @Date: 2021-11-17 - 0:35
 * @Description: Chapter10
 * @version: 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        new A().f1();
    }
}
class A{
    private final String name = "00";

    public void f1(){
        class B{
            private String name = "11";
            public void show(){
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}
package Chapter7;

/**
 * @Auther: xhq
 * @Date: 2021-11-02 - 14:39
 * @Description: Chapter7
 * @version: 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        Cale cale = new Cale(3,4);
        System.out.println(cale.plus());
        System.out.println(cale.minus());
        System.out.println(cale.multiply());
        System.out.println(cale.divide());

    }
}
class Cale{
    private int a;
    private int b;

    public Cale(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int plus(){
        return a+b;
    }

    public int minus(){
        return a-b;
    }

    public int multiply(){
        return a*b;
    }

    public Double divide(){
        if(b==0){
            System.out.println("除数为零");
            return null;
        }else{
            return 1.0*a/b;
        }
    }
}
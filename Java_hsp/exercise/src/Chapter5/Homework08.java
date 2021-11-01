package Chapter5;

/**
 * @Auther: xhq
 * @Date: 2021-11-01 - 1:46
 * @Description: Chapter5
 * @version: 1.0
 */
public class Homework08 {
    public static void main(String[] args) {
        Homework08.f();
    }
    public static void f(){
        double sum = 0d;
        double f = -1d;
        for (int i = 1; i <= 100; i++) {
            f *= -1;
            sum += f/i;
        }
        System.out.println(sum);
    }
}

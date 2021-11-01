package Chapter5;

/**
 * @Auther: xhq
 * @Date: 2021-11-01 - 2:05
 * @Description: Chapter5
 * @version: 1.0
 */
public class Homework09 {
    public static void main(String[] args) {
        int sum = 0;
        int x = 0;
        for (int i = 1; i <= 100; i++) {
            x += i;
            sum += x;
        }
        System.out.println(sum);
    }
}

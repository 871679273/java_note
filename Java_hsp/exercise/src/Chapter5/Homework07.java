package Chapter5;

/**
 * @Auther: xhq
 * @Date: 2021-11-01 - 1:40
 * @Description: Chapter5
 * @version: 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Homework07.f();
        System.out.println();
        Homework07.g();
    }
    public static void f(){
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
    }
    public static void g(){
        for (char c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + " ");
        }
    }
}

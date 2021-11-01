package Chapter5;

import java.util.Scanner;

/**
 * @Auther: xhq
 * @Date: 2021-10-31 - 22:30
 * @Description: Chapter5
 * @version: 1.0
 */
public class Homework02 {
    public static void f(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>0){
            System.out.println(">0");
        }else if(num==0){
            System.out.println("=0");
        }else {
            System.out.println("<0");
        }
    }

    public static void main(String[] args) {
        Homework02.f();
    }
}

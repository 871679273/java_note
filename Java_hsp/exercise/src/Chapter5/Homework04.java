package Chapter5;

import java.util.Scanner;

/**
 * @Auther: xhq
 * @Date: 2021-10-31 - 23:21
 * @Description: Chapter5
 * @version: 1.0
 */
public class Homework04 {
    public static void f(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>999 && num<100){
            System.out.println("请输入一个三位数");
            num = sc.nextInt();
        }
        int a = num/100;
        int b = num%100/10;
        int c = num%10;
        if((int)Math.pow(a,3)+(int)Math.pow(b,3)+(int)Math.pow(c,3)==num){
            System.out.println("水仙花数");
        }else{
            System.out.println("啥也不是");
        }
    }

    public static void main(String[] args) {
        Homework04.f();
    }
}

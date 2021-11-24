package Chapter12;

import java.util.Scanner;

/**
 * @Auther: xhq
 * @Date: 2021-11-23 - 5:21
 * @Description: Chapter12
 * @version: 1.0
 */
public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String str = "";
        while (true){
            System.out.println("input an int number");
            str = scanner.nextLine();
            try {
                num = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入错误");
            }
        }
    }
}

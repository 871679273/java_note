package Chapter6;

import java.util.Scanner;

/**
 * @Auther: xhq
 * @Date: 2021-11-01 - 2:22
 * @Description: Chapter6
 * @version: 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        Homework04.f();
    }

    public static void g(){
        int[] arr = {10,12,45,90};
        int[] arrNew = new int[arr.length + 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("输入插入数字");
        int num = sc.nextInt();

        boolean flag = true;
        for (int i = 0; i < arrNew.length; i++) {
            if (flag) {
                if (num >= arr[i] && i<arr.length-1) {
                    arrNew[i] = arr[i];
                }else if (num < arr[i] && i<arr.length-1){
                    flag = false;
                    arrNew[i] = num;
                }else{
                    arrNew[i] = arr[i];
                    arrNew[i+1] = num;
                    break;
                }
            }else{
                arrNew[i] = arr[i-1];
            }
        }

        arr = arrNew;
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void f(){
        int[] arr = {10,12,45,90};
        int[] arrNew = new int[arr.length + 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("输入插入数字");
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(num<=arr[i]){
                index = i;
                break;
            }
        }
        if(index == -1){
            index = arr.length;
        }
        //扩容
        for (int i = 0, j = 0; i < arrNew.length; i++) {
            if(i != index){
                arrNew[i] = arr[j];
                j++;
            }else{
                arrNew[i] = num;
            }
        }
        arr = arrNew;
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

package Chapter7;

import java.util.Arrays;

/**
 * @Auther: xhq
 * @Date: 2021-11-02 - 14:29
 * @Description: Chapter7
 * @version: 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = A03.copyArr(arr);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr);
        System.out.println(arr2);
    }
}
class A03{
    public static int[] copyArr(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }
}
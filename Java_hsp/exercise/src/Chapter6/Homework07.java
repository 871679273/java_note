package Chapter6;

/**
 * @Auther: xhq
 * @Date: 2021-11-01 - 4:21
 * @Description: Chapter6
 * @version: 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        //生成随机数组
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*99+1);
        }
        //打印
        System.out.println("before");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        //冒泡排序
        System.out.println("\nafter");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j]>arr[j+1]){
                    arr[j] += arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] -= arr[j+1];
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}

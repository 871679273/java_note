package Chapter6;

/**
 * @Auther: xhq
 * @Date: 2021-11-01 - 3:41
 * @Description: Chapter6
 * @version: 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        //生成随机数组
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*99+1);
        }
        //倒序打印
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        //计算
        double mean = 0;
        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            mean += arr[i];
            if(arr[i]>=max){
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i]<=min){
                min = arr[i];
                minIndex = i;
            }
        }
        mean /= arr.length;
        System.out.println("\n平均值 = "+mean+"，最大值下标是："+maxIndex+"，最小值下标是" +
                "："+minIndex+"。");
        //查找
        int n = 8;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n){
                System.out.println("number 8 exist");
                index = i;
                break;
            }
        }
        if(index==-1){
            System.out.println("number 8 not find");
        }
    }
}

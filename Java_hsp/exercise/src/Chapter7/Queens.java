package Chapter7;

import java.util.Arrays;

/**
 * @Auther: xhq
 * @Date: 2021-11-01 - 20:02
 * @Description: Chapter7
 * @version: 1.0
 */
public class Queens {
    static int cnt = 0;
    //判断下一行能不能走
    public static boolean go(int[] arr,int index){
        if(index==8){
            System.out.println(Arrays.toString(arr)+"\n");
            cnt++;
            System.out.println(cnt);
            return true;
        }else{
            for (int i = 0; i < 8; i++) {
                arr[index]=i;
                if(Queens.check(arr,index)){
                    go(arr,index+1);
                }
            }
            return false;
        }
    }

    //判断当前位置能不能摆
    public static boolean check(int[] arr, int index){
        for (int i = 0; i < index; i++) {
            if(arr[index] == arr[i] || Math.abs(arr[index]-arr[i]) == Math.abs(index-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {-1,-1,-1,-1,-1,-1,-1,-1};
        Queens.go(arr,0);
    }

}

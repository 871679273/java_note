package Chapter7;

import java.util.Objects;

/**
 * @Auther: xhq
 * @Date: 2021-11-02 - 14:17
 * @Description: Chapter7
 * @version: 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        String[] arr = {"1av","2s","3w"};
        A02 a = new A02();
        System.out.println(a.find("3",arr));
    }
}
class A02{
    public int find(String str, String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(str.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }
}
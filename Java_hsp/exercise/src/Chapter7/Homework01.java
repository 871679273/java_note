package Chapter7;

/**
 * @Auther: xhq
 * @Date: 2021-11-02 - 13:49
 * @Description: Chapter7
 * @version: 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        double[] arr = {1,2};
        A01 a = new A01();
        Double res = a.max(arr);
        if(res!=null){
            System.out.println(res);
        }else{
            System.out.println("输入错误");
        }
    }
}
class A01{
    public Double max(double[] arr){
        if (arr!=null && arr.length>0) {
            double max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                max = arr[i]>max?arr[i]:max;
            }
            return max;
        }else{
            return null;
        }
    }
}

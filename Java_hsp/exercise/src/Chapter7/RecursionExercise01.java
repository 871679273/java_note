package Chapter7;

/**
 * @Auther: xhq
 * @Date: 2021-11-01 - 4:41
 * @Description: Chapter7
 * @version: 1.0
 */
public class RecursionExercise01 {
    public static void main(String[] args) {
        T t = new T();
        int n = 7;
        int res = t.fibonacci(n);
        if(res!=-1){
            System.out.println(res);
        }

        System.out.println(t.peach(1));
    }
}
class T{
    public int fibonacci(int n){
        if (n>=1) {
            if(n==1 || n==2){
                return 1;
            }else{
                return fibonacci(n-1) + fibonacci(n-2);
            }
        }else{
            System.out.println("n <= 0");
            return -1;
        }
    }

    public int peach(int day){
        if (day<=10 && day>=1) {
            if(day==10){
                return 1;
            }else{
                return (peach(day+1)+1)*2;
            }
        }else{
            System.out.println("天数不对");
            return -1;
        }
    }
}

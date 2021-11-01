package Chapter5;

/**
 * @Auther: xhq
 * @Date: 2021-11-01 - 1:17
 * @Description: Chapter5
 * @version: 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        Homework06.g();
    }
    public static void f(){
        String str = "";
        int cnt = 0;
        for (int i = 1; i < 101; i++) {
            if(i%5 != 0){
                str = str + i + "\t";
                cnt++;
            }
            if(cnt==5){
                System.out.println(str);
                str = "";
                cnt = 0;
            }
        }
    }
    public static void g(){
        int cnt = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%5 != 0){
                cnt++;
                System.out.print(i + "\t");
                if(cnt % 5 == 0){
                    System.out.println();
                }
            }

        }
    }
}

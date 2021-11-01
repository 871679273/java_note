package Chapter5;

/**
 * @Auther: xhq
 * @Date: 2021-10-31 - 22:00
 * @Description: Chapter5
 * @version: 1.0
 */
public class Homework01 {
    public static void f(){
        int cnt = 0;
        double cash = 100000d;
        while(cash>0){
            if (cash>50000){
                cash *= 0.95;
                cnt++;
                System.out.println("第"+cnt+"次, 剩余："+cash);
            }else if (cash >1000){
                cash -= 1000;
                cnt++;
                System.out.println("第"+cnt+"次, 剩余："+cash);
            }else{
                System.out.println("结束，共"+cnt+"次");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Homework01.f();
    }
}

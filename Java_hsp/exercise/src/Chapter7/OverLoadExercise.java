package Chapter7;

/**
 * @Auther: xhq
 * @Date: 2021-11-02 - 10:02
 * @Description: Chapter7
 * @version: 1.0
 */
public class OverLoadExercise {
    public static void main(String[] args) {
        Methods me = new Methods();
        System.out.println(me.m(5));
        System.out.println(me.m(5,6));
        me.m("16");

        System.out.println(me.max(5,6));
        System.out.println(me.max(5.5,6.6));
        System.out.println(me.max(5.5,6.6,7.7));

    }
}
class Methods{
    public int m(int x){
        return x*x;
    }
    public int m(int x,int y){
        return x*y;
    }
    public void m(String str){
        System.out.println(str);
    }
    public int max(int x ,int y){
        return x>y?x:y;
    }
    public double max(double x ,double y){
        return (x>y?x:y);
    }
    public double max(double x,double y,double z){
        double i = (x>y?x:y);
        return z>i?z:i;
    }
}
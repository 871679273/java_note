package Chapter10;

/**
 * @Auther: xhq
 * @Date: 2021-11-14 - 21:06
 * @Description: Chapter10
 * @version: 1.0
 */
public class Exercise02 {
    public static void main(String[] args) {
        new Cellphtone().alarmclock(new Bell() {
            @Override
            public String ring() {
                return "懒猪起床了";
            }
        });
        new Cellphtone().alarmclock(new Bell() {
            @Override
            public String ring() {
                return "小伙伴上课了";
            }
        });
    }
}
interface Bell{
    String ring();
}
class Cellphtone{
    public void alarmclock(Bell bell){
        System.out.println(bell.ring());
    }
}

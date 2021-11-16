package Chapter11;

/**
 * @Auther: xhq
 * @Date: 2021-11-16 - 19:41
 * @Description: Chapter11
 * @version: 1.0
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        System.out.println("=========打印=========");
        Week[] week = Week.values();
        for (Week day : week) {
            System.out.println(day);
        }
    }
}
enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期3"),
    THURSDAY("星期4"),FRIDAY("星期5"),SATURDAY("星期6"),
    SUNDAY("星期7");

    private String name;
    private Week(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
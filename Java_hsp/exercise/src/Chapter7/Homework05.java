package Chapter7;

/**
 * @Auther: xhq
 * @Date: 2021-11-02 - 14:33
 * @Description: Chapter7
 * @version: 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        System.out.println(c.perimeter());
        System.out.println(c.area());
    }
}
class Circle{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double perimeter(){
        return 2*Math.PI*r;
    }

    public double area(){
        return Math.PI*Math.pow(r,2);
    }

}
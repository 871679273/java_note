package Chapter10;

/**
 * @Auther: xhq
 * @Date: 2021-11-17 - 0:20
 * @Description: Chapter10
 * @version: 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },18,10);
        cellphone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        },18,10);
    }
}
interface Calculator{
    double work(double n1, double n2);
}
class Cellphone{
    public void testWork(Calculator calculator, double n1, double n2){
        double result = calculator.work(n1,n2);
        System.out.println("result= "+result);
    }
}
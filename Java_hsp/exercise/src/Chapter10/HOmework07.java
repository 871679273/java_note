package Chapter10;

/**
 * @Auther: xhq
 * @Date: 2021-11-17 - 1:40
 * @Description: Chapter10
 * @version: 1.0
 */
public class HOmework07 {
    public static void main(String[] args) {
        new Car(1).air.flow();
        new Car(100).air.flow();
        new Car(-100).air.flow();
    }
}
class Car{
    private double temperature;
    public Air air = new Air();

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if (temperature > 40){
                System.out.println("吹冷气");
            }else if (temperature < 0){
                System.out.println("吹暖气");
            }else{
                System.out.println("关空调");
            }
        }
    }
}
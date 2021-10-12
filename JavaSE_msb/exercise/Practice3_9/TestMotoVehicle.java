package Practice3_9;

public class TestMotoVehicle {
    public static void main(String[] args) {
        Car car = new Car(1,"Baoma","1");
        System.out.println("租金是："+car.calcRent(5));
        Bus bus = new Bus(2,"金龙",20);
        System.out.println("租金是："+bus.calcRent(5));
    }
}

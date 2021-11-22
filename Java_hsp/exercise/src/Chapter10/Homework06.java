package Chapter10;

/**
 * @Auther: xhq
 * @Date: 2021-11-17 - 0:41
 * @Description: Chapter10
 * @version: 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        Person ts = new Person("唐僧", Factory.getHorse());
        ts.drive();
        ts.ride();
        ts.fly();
        ts.fly();
        ts.fly();
        ts.drive();
        ts.ride();
        ts.drive();
        ts.ride();
    }
}

interface Vehicle{
    String work();
}

class Horse implements Vehicle{
    private String name;
    public Horse(String name){
        this.name = name;
    }
    @Override
    public String work() {
        return "骑"+name;
    }
}

class Boat implements Vehicle{
    private String name;
    public Boat(String name){
        this.name = name;
    }
    @Override
    public String work() {
        return "开"+name;
    }
}

class Plane implements Vehicle{
    private String name;
    public Plane(String name){
        this.name = name;
    }
    @Override
    public String work() {
        return "开"+name;
    }
}

class Factory{
    private static final Vehicle horse = new Horse("白龙马");
    private static int num1 = 0;
    private static int num2 = 0;
    private Factory(){};
    public static Vehicle getHorse(){
        return horse;
    }
    public static Vehicle getBoat(){
        return new Boat("小白船"+ (++num1) + "号");
    }
    public static Vehicle getPlane(){
        return new Plane("dark fake gay"+ (++num2) + "号");
    }
}

class Person{
    private String name;
    private Vehicle vehicle;

    Person(String name, Vehicle vehicle){
        this.name = name;
        this.vehicle = vehicle;
    }

    public void ride(){
        if(!(vehicle instanceof Horse)){
            vehicle = Factory.getHorse();
        }
        System.out.println(vehicle.work());
    }
    public void drive(){
        vehicle = Factory.getBoat();
        System.out.println(vehicle.work());
    }
    public void fly(){
        vehicle = Factory.getPlane();
        System.out.println(vehicle.work());
    }

}
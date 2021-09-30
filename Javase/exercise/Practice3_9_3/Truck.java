package Practice3_9_3;

public class Truck extends MotoVehicle{
    private int weight;

    public Truck(){

    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int no, String brand, int weight) {
        super(no, brand);
        this.weight = weight;
    }

    @Override
    public int calcRent(int day) {
        return 50*day*this.weight;
    }
}

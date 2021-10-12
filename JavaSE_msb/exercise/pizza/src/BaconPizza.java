public class BaconPizza extends Pizza{
    private double weight;

    public BaconPizza() {
    }

    public BaconPizza(String name, int size, int price, double weight) {
        super(name, size, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //重写show

    @Override
    public String showPizza() {
        return super.showPizza()+"\n培根的克数是："+weight+"克";
    }
}

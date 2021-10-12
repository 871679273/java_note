public class FruitsPizza extends Pizza{
    //属性
    private String burdening;

    public FruitsPizza() {

    }

    public FruitsPizza(String name, int size, int price, String burdening) {
        super(name, size, price);
        this.burdening = burdening;
    }

    public String getBurdening() {
        return burdening;
    }

    public void setBurdening(String burdening) {
        this.burdening = burdening;
    }

    //重写show

    @Override
    public String showPizza() {
        return super.showPizza()+"\n你要加入的水果是："+burdening;
    }
}

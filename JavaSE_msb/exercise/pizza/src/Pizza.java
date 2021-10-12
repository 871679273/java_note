public class Pizza {
    private String name;
    private int size;
    private int price;

    public Pizza(){

    }
    public Pizza(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String showPizza(){
        return "披萨的名字是："+name+"\n披萨的大小是："+size+"寸\n披萨的价格是："+price+"元";
    };
}

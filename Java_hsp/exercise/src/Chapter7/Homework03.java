package Chapter7;

/**
 * @Auther: xhq
 * @Date: 2021-11-02 - 14:23
 * @Description: Chapter7
 * @version: 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Book book = new Book(99.9);
        System.out.println(book.getPrice());
        book.updatePrice(101);
        book.updatePrice(166);
    }
}
class Book{
    private double price;

    public Book(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void updatePrice(double newPrice){
        if(newPrice>150){
            this.price = 150;
        }else if(newPrice>100){
            this.price = 100;
        }
        System.out.println(price);;
    }
}
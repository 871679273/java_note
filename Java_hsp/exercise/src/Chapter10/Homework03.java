package Chapter10;

/**
 * @Auther: xhq
 * @Date: 2021-11-17 - 0:15
 * @Description: Chapter10
 * @version: 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        new Cat().shout();
        new Dog().shout();
    }
}
abstract class Animal{
    public abstract void shout();
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("meow~");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("woo~");
    }
}
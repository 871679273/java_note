package Chapter7;

/**
 * @Auther: xhq
 * @Date: 2021-11-02 - 19:28
 * @Description: Chapter7
 * @version: 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Dog dog = new Dog("dd",'男',3);
        dog.show();
    }
}
class Dog{
    private String name;
    private char gender;
    private int age;

    public Dog(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void show(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
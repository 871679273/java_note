package Practice3_7;

import java.util.Scanner;

public class AdoptDog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入昵称");
        String name = sc.nextLine();
        System.out.println("请输入品种");
        String strain = sc.nextLine();
        System.out.println("请输入健康值");
        int health = sc.nextInt();

        Dog dog = new Dog(name,health,strain);
        dog.show();
    }
}

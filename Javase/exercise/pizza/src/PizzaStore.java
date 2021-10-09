import java.util.Scanner;

public class PizzaStore {
    public static Pizza getPizza(int choice) {
        Scanner sc = new Scanner(System.in);
        Pizza p = null;
        switch (choice) {
            case 1: {
                System.out.println("请录入培根的克数：");
                double weight = sc.nextInt();
                System.out.println("请录入披萨的大小：");
                int size = sc.nextInt();
                System.out.println("请录入披萨的价格：");
                int price = sc.nextInt();
                //将录入的信息封装为披萨
                BaconPizza bp = new BaconPizza("培根披萨", size, price, weight);
                p = bp;
                break;
            }
            case 2: {
                System.out.println("请录入加入的水果：");
                String burdening = sc.next();
                System.out.println("请录入披萨的大小：");
                int size = sc.nextInt();
                System.out.println("请录入披萨的价格：");
                int price = sc.nextInt();
                //将录入的信息封装为披萨
                FruitsPizza fp = new FruitsPizza("水果披萨", size, price, burdening);
                p = fp;
                break;
            }
        }
        return p;
    }
}

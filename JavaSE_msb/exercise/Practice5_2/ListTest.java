package Practice5_2;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        Dog d1 = new Dog("大黄","red");
        Dog d2 = new Dog("二黄","green");
        Dog d3 = new Dog("三黄","blue");
        list.add(d1);
        list.add(d2);
        list.add(d3);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(d1);
        System.out.println(list);
        Dog d4 = new Dog("二黄","green");
        System.out.println(list.contains(d4));
    }
}

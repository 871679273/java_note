package Chapter10;

/**
 * @Auther: xhq
 * @Date: 2021-11-16 - 23:31
 * @Description: Chapter10
 * @version: 1.0
 */
public class Homework02 {
}
class TestFrock{
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());

        Frock frock1 = new Frock();
        System.out.println(frock1.getSerialNumber());
        Frock frock2 = new Frock();
        System.out.println(frock2.getSerialNumber());
        Frock frock3 = new Frock();
        System.out.println(frock3.getSerialNumber());
    }
}
class Frock{
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock(){
        this.serialNumber = getNextNum();
    }

    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
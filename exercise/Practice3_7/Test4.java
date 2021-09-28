package Practice3_7;

public class Test4 {
    public static void main(String[] args) {
        Penguin penguin1 = new Penguin();
        penguin1.setSex(Penguin.SEX_MALE);
        penguin1.show();

        Penguin.SEX_MALE = "雄";
        Penguin.SEX_FEMALE = "雌";
        penguin1.setSex(Penguin.SEX_FEMALE);
        penguin1.show();


    }
}

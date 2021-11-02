package Chapter7;

/**
 * @Auther: xhq
 * @Date: 2021-11-02 - 10:21
 * @Description: Chapter7
 * @version: 1.0
 */
public class VarParameterExercise {
    public static void main(String[] args) {
        HspMethod h = new HspMethod();
        System.out.println(h.showScore("lisi",100,100,100,99,100));
    }

}

class HspMethod{
    public String showScore(String name, double... nums ){
        String str = name;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return str + "\t" + sum;
    }
}
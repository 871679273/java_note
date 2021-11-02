package Chapter7;

import java.util.Random;
import java.util.Scanner;

/**
 * @Auther: xhq
 * @Date: 2021-11-02 - 20:11
 * @Description: Chapter7
 * @version: 1.0
 */
public class Homework14 {
    public static void main(String[] args) {
        Tom t = new Tom();
        t.play();
    }

}
class Tom{
    private int hand;
    private int computer;
    private int win = 0;

    String[][] arr = new String[4][4];
    Scanner sc = new Scanner(System.in);

    //返回出拳类型字符串
    public String type(int x){
        switch (x){
            case 0:
                return "拳头";
            case 1:
                return "剪刀";
            case 2:
                return "布";
            default:
                return null;
        }
    }

    public void play(){
        arr[0][0]="局数\t";
        arr[0][1]="玩家出拳\t";
        arr[0][2]="电脑出拳\t";
        arr[0][3]="输赢情况\t";
        //循环玩三次
        for (int i = 1; i <= 3; i++) {
            arr[i][0]=i+"\t";
            //输入你的出拳
            System.out.println("请输入你要出的拳：（0-拳头，1-剪刀，2-布）：");
            System.out.println("=======================================");
            hand = sc.nextInt();
            arr[i][1]=this.type(hand)+"\t\t";
            //随机生成对手拳
            computer = new Random().nextInt(3);
            arr[i][2]=this.type(computer)+"\t\t";
            //判断输赢
            if((hand-computer)==-1 || (hand-computer)==2){
                arr[i][3]="你赢了";
                win++;
            }else if(hand==computer){
                arr[i][3]="你平了";
            }else{
                arr[i][3]="你输了";
            }
            System.out.println("=======================================");
            System.out.println(arr[0][0]+"\t"+arr[0][1]+"\t"+arr[0][2]+"\t"+arr[0][3]+"\t");
            System.out.println(arr[i][0]+"\t"+arr[i][1]+"\t"+arr[i][2]+"\t"+arr[i][3]+"\t");
            System.out.println("=======================================");
            System.out.println("\n\n");
        }
        //最终结果
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i][0]+"\t"+arr[i][1]+"\t"+arr[i][2]+"\t"+arr[i][3]+"\t");
        }
        System.out.println("你赢了："+win+"次");
    }
}
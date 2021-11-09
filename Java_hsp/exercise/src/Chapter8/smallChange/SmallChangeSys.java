package Chapter8.smallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Auther: xhq
 * @Date: 2021-11-09 - 13:23
 * @Description: Chapter8.smallChange
 * @version: 1.0
 */
public class SmallChangeSys {
    //属性
    private boolean loop = true;
    private Scanner sc = new Scanner(System.in);
    private String key = "";
    private String detail = "-----------------零钱通明细------------------\n" +
            "说明\t\t时间\t\t\t\t\t入账\t\t\t余额";
    private double money = 0;
    private double balance = 0;
    Date date = new Date();
    private String note = "";

    //methods
    //1.界面
    public void mainMenu(){
        do{
            System.out.println("\n================零钱通菜单(OOP)===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");

            System.out.println("请选择(1-4): ");
            key = sc.next();

            switch (key){
                case "1":
                    //1 零钱通明细
                    detail();
                    break;
                case "2":
                    income();
                    break;
                case "3":
                    pay();
                    break;
                case "4":
                    exit();
                    break;
                default:
                    System.out.println("输入错误，重新输入");

            }
        }while(loop);
    }
    //2.零钱通明细
    private void detail(){
        System.out.println(detail);
    }
    //3.收益入账
    private void income(){
        System.out.println("收益入账金额:");
        money = sc.nextDouble();
        //money合法性判断
        if (money<=0){
            System.out.println("收入不对");
            return;
        }
        //计算balance，拼接进details
        balance += money;
        detail += "\n收益入账\t"
                +new SimpleDateFormat("yyyy-MM-dd HH:mm").format(date)
                +"\t"+money+"\t"
                +"\t"+balance;
    }
    //4.消费
    private void pay(){
        System.out.println("消费金额：");
        money = sc.nextDouble();
        //money合法性判断
        if (money<=0 || money>balance){
            System.out.println("消费金额不对");
            return;
        }
        System.out.println("消费说明：");
        note = sc.next();
        //计算balance，拼接进details
        balance -= money;
        detail += "\n"+note+"\t"
                +new SimpleDateFormat("yyyy-MM-dd HH:mm").format(date)
                +"\t-"+money+"\t"
                +"\t"+balance;
    }
    //5.exit
    private void exit(){
        String choice = "";
        while (true){
            System.out.println("Are you sure? y/n");
            choice = sc.next();
            if("y".equals(choice) || "n".equals(choice)){
                break;
            }
        }
        if("y".equals(choice)){
            loop = false;
        }
    }



}

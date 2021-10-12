import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //定义一个字符串，用来接收整个手指明细
        String details ="";
        int balance = 0;
        while(true){
            System.out.println("_____欢迎_____");
            System.out.println("1.收支明细");
            System.out.println("2.登记收入");
            System.out.println("3.登记支出");
            System.out.println("4.退出");
            System.out.println("请输入你要选择的功能：");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            //对录入的数做过滤
            while(choice!=1&&choice!=2&&choice!=3&&choice!=4){
                System.out.println("对不起，你录入的功能错误，请重新录入");
                choice = sc.nextInt();
            }
            switch (choice){
                case 1:
                    System.out.println("记账系统》》》》收支明细");
                    if(details!=""){
                        System.out.println(details.substring(0,details.length()-1));
                    }else{
                        System.out.println(details);
                    }
                    break;
                case 2:
                    System.out.println("记账系统》》》》登记收入");
                    System.out.println("请输入收入金额");
                    int income = sc.nextInt();
                    System.out.println("请录入收入说明");
                    String incomeDetail = sc.next();
                    balance += income;
                    details = details +"收入："+income+",收入说明："+incomeDetail + ",账户余额："+balance+'\n';
                    break;
                case 3:
                    System.out.println("记账系统》》》》登记支出");
                    System.out.println("请录入支出金额：");
                    int expend = sc.nextInt();
                    System.out.println("请录入支出说明：");
                    String expendDetail = sc.next();
                    balance -= expend;
                    details  = details +"支出："+expend+",支出说明："+expendDetail + ",账户余额："+balance+'\n';
                    break;
                case 4:
                    System.out.println("记账系统》》》》退出");
                    System.out.println("确定要退出吗？Y/N");
                    String isExit = sc.next();
                    switch (isExit){
                        case "Y":
                            System.out.println("已退出");
                            return;//结束当前方法
                        default:
                            break;
                    }

            }
        }
    }
}

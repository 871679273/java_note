import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] balls = new int[7];
        int count = 0;
        //定义一个变量，用来设定是否购买了彩票
        boolean isBuy = false;
        while(true){
            //写菜单
            System.out.println("---------欢迎进入双色球----------");
            System.out.println("1.购买彩票");
            System.out.println("2.查看开奖");
            System.out.println("3.退出");
            System.out.println("请选择你要完成的功能：");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("双色球系统》》购买彩票");
                    System.out.println("请选择你要购买几注：");
                    count =sc.nextInt();//购买的数量
                    for(int i=1;i<=7;i++){
                        if(i!=7){//录入红色球
                            System.out.println("请录入第"+i+"个红球：");
                            int redBall = sc.nextInt();
                            balls[i-1]=redBall;
                        }else{//录入蓝色球
                            System.out.println("请录入一个蓝色球：");
                            int blueBall = sc.nextInt();
                            balls[6]=blueBall;
                        }
                    }
                    //提示完整信息：
                    System.out.println("您购买了"+count+"注彩票,共消费"+count*2+"。 号码为：");
                    for(int num:balls){
                        System.out.print(num+"\t");
                    }
                    System.out.println();
                    isBuy=true;
                    break;
                case 2:
                    if(isBuy==true){
                        //购买号码
                        //生成号码
                        int[] luckBall = getLuckBall();
                        //比对号码
                        int level = getLevel(balls,luckBall);
                        //根据Level结果执行后面的逻辑
                        switch(level){
                            case 1:
                                System.out.println("中一等奖，一注中500万，共"+count*500+"万元");
                                break;
                            case 2:
                                System.out.println("中2等奖，一注中100万，共"+count*100+"万元");
                                break;
                            case 3:
                                System.out.println("中3等奖，一注中50万，共"+count*50+"万元");
                                break;
                            case 4:
                                System.out.println("中4等奖，一注中10万，共"+count*10+"万元");
                                break;
                            case 5:
                                System.out.println("中5等奖，一注中5万，共"+count*5+"万元");
                                break;
                            case 6:
                                System.out.println("中6等奖，一注中1万，共"+count*1+"万元");
                                break;
                        }

                        System.out.println("双色球系统》》查看开奖");
                    }else{
                        System.out.println("还没买呢");
                    }

                    break;
                case 3:
                    System.out.println("双色球系统》》退出");
                    return;
            }
        }
    }
    //定义一个方法专门用来生成中奖号码
    public static int[] getLuckBall(){
//        int[] luckBall = {1,2,3,4,5,6,7};
        int[] luckBall = new int[7];
        for(int i =1;i<=7;i++){
            if(i!=7){
                luckBall[i-1]=(int)(Math.random()*33)+1;
            }else{
                luckBall[6]=(int)(Math.random()*16)+1;
            }
        }
        return luckBall;
    }
    //比对号码
    public static int getLevel(int[] balls,int[] luckBall){
        int level = 1;
        // 比较红球
        int redCount = 0;
        // 比较蓝球
        int blueCount = 0;
        for(int i = 0;i<=6;i++){
            if(i!=6){
                for(int j = 0;j<=5;j++){
                    if(balls[i]==luckBall[j]){
                        redCount++;
                    }
                }
            }else{
                if(balls[6]==luckBall[6]){
                    blueCount++;
                }
            }
        }
        System.out.println("红球有"+redCount+"个相等");
        System.out.println("蓝球有"+redCount+"个相等");

        if(redCount==6&&blueCount==1){
            level=1;
        }else if(redCount==6){
            level=2;
        }else if(redCount==5&&blueCount==1){
            level=3;
        }else if(redCount==5||(redCount==4&&blueCount==1)){
            level=4;
        }else if(redCount==4||(redCount==3&&blueCount==1)){
            level=5;
        }else{
            level=6;
        }

        return level;
    }
}

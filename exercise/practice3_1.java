/* 1
import java.util.Scanner;

public class practice3_1{
	
	public static void main(String[] args){
		
		System.out.println("欢迎登陆马士兵教育会员系统");
		System.out.println("添加会员信息");
		System.out.println("请输入会员号<4位整数>：");
		//创建Scanner对象
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		System.out.println("请输入会员生日（月/日<用两位整数表示>）:");
		String birth = sc.nextLine();
		System.out.println("请输入积分:");
		String score = sc.nextLine();
		
		if(number.length()==4){
			System.out.println(number+"\t"+birth+"\t"+score);
		}else{
			System.out.println("录入信息失败，请重新输入四位会员号");
		}
	}
}
*/


/* 2
import java.util.Scanner;

public class practice3_1{
	
	public static void main(String[] args){
		
		System.out.println("欢迎登陆马士兵教育抽奖系统");
		System.out.println("请输入四位会员号");
		Scanner sc = new Scanner(System.in);
		String number0 = "1234";
		String number = sc.nextLine();
		if (number.equals(number0)){
			System.out.println("恭喜中奖");
		}else{
			System.out.println(number + "，谢谢支持");
		}
	}
}

*/

/* 3
import java.util.Scanner;

public class practice3_1{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		String userName = sc.nextLine();
		System.out.println("请输入密码");
		String passWord = sc.nextLine();
		if (userName.equals("John") && passWord.equals("1234")){
			System.out.println("欢迎您，"+userName);
		}else{
			System.out.println("登录失败");
		}
		//(userName.equals("John") && passWord.equals("1234"))?(System.out.println("欢迎您，"+userName)):(System.out.println("登录失败"));
	}
}
*/

/* 4
import java.util.Scanner;

public class practice3_1{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("你是boy还是girl");
		String sex = sc.nextLine();
		System.out.println("你多大");
		int age = sc.nextInt();
		
		if (age >= 7){
			System.out.println("来搬桌子");
		}else if (age >= 5 && sex.equals("boy")){
			System.out.println("来搬桌子");
		}else {
			System.out.println("你搬不动桌子");
		}
	}
}
*/


/* 5
import java.util.Scanner;

public class practice3_1{
	
	public static void main(String[] args){
		//随机生成一个银行存款
		int deposit = (int)(51*Math.random());
		if (deposit >= 40){
			System.out.println("买凯迪拉克");
		}else if (deposit >= 30){
			System.out.println("买帕萨特");
		}else if (deposit >= 20){
			System.out.println("买伊兰特");
		}else if (deposit >= 10){
			System.out.println("奥拓");
		}else{
			System.out.println("捷安特");
		}
	}
}
*/

/* 6
import java.util.Scanner;

public class practice3_1{
	public static void main (String[] args){
		//随机生成一个积分数0~10000
		int credit = (int)(10001*Math.random());
		if (credit < 2000){
			System.out.println("给你打9折");
		}else if (credit >= 2000 && credit < 4000){
			System.out.println("给你打8折");
		}else if (credit >= 4000 && credit < 8000){
			System.out.println("给你打7折");
		}else{
			System.out.println("给你打6折");
		}
	}
}
*/

/* 7
import java.util.Scanner;

public class practice3_1{
	public static void main (String[] args){
		double vip = Math.random();
		int money = (int)(401*Math.random());
		if (vip >= 0.5){
			System.out.println("会员您好");
			if(money >= 200){
				System.out.println("会员购物满200元打7.5折");
			}else{
				System.out.println("会员购物打8折");
			}
		}else{
			if (money >= 100){
				System.out.println("普通顾客购物满100元打9折");
			}else{
				System.out.println("本次购物不打折");
			}
		}
	}
}
*/

/* 8
import java.util.Scanner;

public class practice3_1{
	public static void main (String[] args){
		int number = (int)(6*Math.random());
		switch (number){
			case 1:
			System.out.println("拨爸爸的号");
			break;
			case 2:
			System.out.println("拨妈妈的号");
			break;
			case 3:
			System.out.println("拨爷爷的号");
			break;
			case 4:
			System.out.println("拨奶奶的号");
			break;
			default:
			System.out.println("输入错误");
		}
	}
}
*/


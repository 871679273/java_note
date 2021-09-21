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
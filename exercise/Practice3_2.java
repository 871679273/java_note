/*
public class Practice3_2{
	
	public static void main (String[] args){
		int i = 1;
		int sum = 0;
		while(i<=100){
			if (i%2==0){
				sum+=i;
			}
			i++;
		}
		System.out.println("答案："+sum);
	}
}
*/

/* 2
import java.util.Scanner;

public class Practice3_2{
	
	public static void main (String[] args){
		System.out.println("************************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤      2.网球鞋        3.网球拍");
		System.out.println("************************************");
		
		Scanner sc = new Scanner(System.in);
		String conti = "y";
		double shouldPay = 0.0;
		while(conti.equals("y")){
			System.out.println("请输入商品编号：");
			int num = sc.nextInt();
			System.out.println("请输入购买数量：");
			int amount = sc.nextInt();
			String nextLine = sc.nextLine();
			switch(num){
				case 1:
				System.out.println("T恤 ￥245.0  数量 "+amount+ "  合计  ￥"+amount*245.0);
				shouldPay += amount*245.0;
				break;
				case 2:
				System.out.println("T恤 ￥570.0  数量 "+amount+ "  合计  ￥"+amount*570.0);
				shouldPay += amount*570.0;
				break;
				case 3:
				System.out.println("T恤 ￥320.0  数量 "+amount+ "  合计  ￥"+amount*320.0);
				shouldPay += amount*320.0;
				break;
			}
			System.out.println("是否继续（y/n）?");
			conti = sc.nextLine();
		}
		System.out.println("************************************");
		System.out.println("折扣： 0.8");
		System.out.println("应付金额："+ shouldPay*0.8);
		System.out.println("************************************");
		System.out.println("请付款");
		double pay = sc.nextDouble();
		System.out.println("实付金额："+ pay);
		while(pay<=shouldPay*0.8){
			System.out.println("您输入的金额小于应付,请重新输入：");
			pay = (double)(sc.nextInt());
		}
		System.out.println("找钱："+ (pay-(0.8*shouldPay)));
	}
}
*/

/* 3
import java.util.Scanner;

public class Practice3_2{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ageUp = 0;
		int ageDown = 0;
		for(int i = 1;i<=10;i++){
			System.out.println("请输入第"+i+"位顾客的年龄：");
			int age = sc.nextInt();
			if(age<=30){
				ageDown++;
			}else{
				ageUp++;
			}
		}
		System.out.println("30岁以下的比例是："+10.0*ageDown+"%");
		System.out.println("30岁以上的比例是："+10.0*ageUp+"%");
	}
}
*/

/* 4
public class Practice3_2{
	
	public static void main(String[] args){
		int oddSum = 0;
		int evenSum = 0;
		int i = 1;
		while(i<=100){
			if(i%2==0){
				evenSum+=i;
			}else{
				oddSum+=i;
			}
			i++;
		}
		System.out.println("偶数和"+evenSum);
		System.out.println("奇数和"+oddSum);
		
		int oddSum = 0;
		int evenSum = 0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				evenSum+=i;
			}else{
				oddSum+=i;
			}
		}
		System.out.println("偶数和"+evenSum);
		System.out.println("奇数和"+oddSum);
	}
}
*/

/* 5
public class Practice3_2{
	
	public static void main(String[] args){
		int j = 0;
		String str = "";
		for (int i =1;i<=1000;i++){
			if(i%5==0){
				str = str +"\t" +i;
				j++;
				if (j==3){
					System.out.println(str);
					j = 0;
					str = "";
				}
			}
		}
	}
}
*/

/* 6
import java.util.Scanner;

public class Practice3_2{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入");
		int num = sc.nextInt();
		String str = "";
		while (num!=0){
			int i = num % 2;
			str = i + str;
			num = num/2;
		}
		
		System.out.println("二进制："+str);
	}
}
*/

/* 7
public class Practice3_2{
	
	public static void main(String[] args){
		int sum = 0;
		int loop = 1;
		for(int i =1;i<=10;i++){
			for(int j = 1;j<=i;j++){
				loop = loop * j; 
			}
			sum += loop;
			loop = 1;
		}
		System.out.println(sum);
	}
}
*/

/* 8
public class Practice3_2{
	
	public static void main(String[] args){
		int sum = 0;
		for(int i = 1;i<=10;i++){
			System.out.println("i="+i);
			sum+=i;
			if(sum>=20){
				break;
			}
		}
		System.out.println(sum);
	}
}
*/

/* 9
public class Practice3_2{
	
	public static void main(String[] args){
		/*平行四边形
		String str = "";
		for(int i = 1;i<=5;i++){
			for(int z = 1;z<=i;z++){
				str = str + " ";
			}
			for(int j = 1;j<=4;j++){
				str = str + " *";
			}
			System.out.println(str);
			str = "";
		}
		*/
		/* 等腰三角形
		String str = "";
		for(int i = 1;i<=5;i++){
			for(int j = 1;j<=5;j++){
				if(j<(6-i)){
					str = str + " ";
				}else{
					str = str + " *";
				}
			}
			System.out.println(str);
			str = "";
		}		
		*/
		/* 菱形
		String str = "";
		for(int i = 1;i<=5;i++){
			for(int j = 1;j<=5;j++){
				if(j<(6-i)){
					str = str + " ";
				}else{
					str = str + " *";
				}
			}
			System.out.println(str);
			str = "";
		}		
		for(int i = 1;i<=4;i++){
			for(int j = 1;j<=5;j++){
				if(j<=i){
					str = str + " ";
				}else{
					str = str + " *";
				}
			}
			System.out.println(str);
			str = "";
		}		
			
		
	}
}
*/

/* 10
import java.util.Scanner;

public class Practice3_2{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int i=1;i<=3;i++){
			for (int j =1;j<=4;j++){
				System.out.println("请输入"+i+"班第"+j+"位同学的成绩");
				int score = sc.nextInt();
				if(score<=85){
					continue;
				}
				count++;
			}
		}
		System.out.println("分数大于85的同学共"+count+"位");
	}
}
*/

/* 11
public class Practice3_2{
	
	public static void main(String[] args){
		for (int i=1;i<=9;i++){
			String str = ""; 
			for(int j=1;j<=i;j++){
				str = str + "\t"+j + "*" + i+ "=" + i*j;
			}
			System.out.println(str);
		}
	}
}
*/

public class Practice3_2{
	
	public static void main(String[] args){
		int num0 = 0;
		int num1 = 1;
		int n = 0;
		for(int i=1;i<=15;i++){
			System.out.println(num0);
			n = num0;
			num0 = num1;
			num1 = num1 + n;
		}
	}
}
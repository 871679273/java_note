/* 1
import java.util.Scanner;

public class practice3_1{
	
	public static void main(String[] args){
		
		System.out.println("��ӭ��½��ʿ��������Աϵͳ");
		System.out.println("��ӻ�Ա��Ϣ");
		System.out.println("�������Ա��<4λ����>��");
		//����Scanner����
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		System.out.println("�������Ա���գ���/��<����λ������ʾ>��:");
		String birth = sc.nextLine();
		System.out.println("���������:");
		String score = sc.nextLine();
		
		if(number.length()==4){
			System.out.println(number+"\t"+birth+"\t"+score);
		}else{
			System.out.println("¼����Ϣʧ�ܣ�������������λ��Ա��");
		}
	}
}
*/


/* 2
import java.util.Scanner;

public class practice3_1{
	
	public static void main(String[] args){
		
		System.out.println("��ӭ��½��ʿ�������齱ϵͳ");
		System.out.println("��������λ��Ա��");
		Scanner sc = new Scanner(System.in);
		String number0 = "1234";
		String number = sc.nextLine();
		if (number.equals(number0)){
			System.out.println("��ϲ�н�");
		}else{
			System.out.println(number + "��лл֧��");
		}
	}
}

*/

/* 3
import java.util.Scanner;

public class practice3_1{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û���");
		String userName = sc.nextLine();
		System.out.println("����������");
		String passWord = sc.nextLine();
		if (userName.equals("John") && passWord.equals("1234")){
			System.out.println("��ӭ����"+userName);
		}else{
			System.out.println("��¼ʧ��");
		}
		//(userName.equals("John") && passWord.equals("1234"))?(System.out.println("��ӭ����"+userName)):(System.out.println("��¼ʧ��"));
	}
}
*/

/* 4
import java.util.Scanner;

public class practice3_1{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����boy����girl");
		String sex = sc.nextLine();
		System.out.println("����");
		int age = sc.nextInt();
		
		if (age >= 7){
			System.out.println("��������");
		}else if (age >= 5 && sex.equals("boy")){
			System.out.println("��������");
		}else {
			System.out.println("��᲻������");
		}
	}
}
*/


/* 5
import java.util.Scanner;

public class practice3_1{
	
	public static void main(String[] args){
		//�������һ�����д��
		int deposit = (int)(51*Math.random());
		if (deposit >= 40){
			System.out.println("�򿭵�����");
		}else if (deposit >= 30){
			System.out.println("��������");
		}else if (deposit >= 20){
			System.out.println("��������");
		}else if (deposit >= 10){
			System.out.println("����");
		}else{
			System.out.println("�ݰ���");
		}
	}
}
*/

/* 6
import java.util.Scanner;

public class practice3_1{
	public static void main (String[] args){
		//�������һ��������0~10000
		int credit = (int)(10001*Math.random());
		if (credit < 2000){
			System.out.println("�����9��");
		}else if (credit >= 2000 && credit < 4000){
			System.out.println("�����8��");
		}else if (credit >= 4000 && credit < 8000){
			System.out.println("�����7��");
		}else{
			System.out.println("�����6��");
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
			System.out.println("��Ա����");
			if(money >= 200){
				System.out.println("��Ա������200Ԫ��7.5��");
			}else{
				System.out.println("��Ա�����8��");
			}
		}else{
			if (money >= 100){
				System.out.println("��ͨ�˿͹�����100Ԫ��9��");
			}else{
				System.out.println("���ι��ﲻ����");
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
			System.out.println("���ְֵĺ�");
			break;
			case 2:
			System.out.println("������ĺ�");
			break;
			case 3:
			System.out.println("��үү�ĺ�");
			break;
			case 4:
			System.out.println("�����̵ĺ�");
			break;
			default:
			System.out.println("�������");
		}
	}
}
*/


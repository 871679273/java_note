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
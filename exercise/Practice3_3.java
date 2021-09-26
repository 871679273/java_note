/* 1
public class Practice3_3{
	public static void main(String[] args){
		//char s[];
		//s = new char[26];
		char s[] = new char[26];
		for (int i = 0;i<s.length;i++){
			s[i]=(char)('A'+i);
			System.out.print(s[i]+" ");
		}			
	}

}
*/

/* 2
import java.util.Scanner;
public class Practice3_3{
	
	public static void main(String[] args){
		
		int arr[] = {8,4,2,1,23,344,1};
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		int sum = 0;
		for (int i=0;i<arr.length;i++){
			sum += arr[i];
		}	
		System.out.println("和为："+sum);
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 0;i<arr.length;i++){
			if(number==arr[i]){
				System.out.println("包含此数");
				break;
			}else if (i==(arr.length-1) && number!=arr[i]){
				System.out.println("不包含此数");
			}
		}
	} 
}
*/

public class Practice3_3{
	
	public static void main(String[] args){
		
		int arr[][] = {{1,2},{2,3,4,5},{5,6,7}};
		for (int i=0;i<arr.length;i++){
			for(int j =0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	} 
}
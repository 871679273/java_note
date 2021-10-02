import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数字");
        int num = sc.nextInt();
        try{
            if(num==1){
                System.out.println("java");
            }else if(num==2){
                System.out.println("python");
            }else{
                System.out.println("其他");
            }
        }catch(InputMismatchException e){
            e.printStackTrace();
        }finally{
            System.out.println("感谢选课");
        }

    }
}

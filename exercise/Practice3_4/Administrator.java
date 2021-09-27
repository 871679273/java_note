import java.util.Scanner;

public class Administrator {
    String loginName = "admin";
    String password = "123";

    public void introduce(){
        System.out.println(loginName);
        System.out.println(password);
    }

    public static void main(String[] args) {
        Administrator admin = new Administrator();
        System.out.println(admin.loginName);
        System.out.println(admin.password);
        admin.introduce();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入用户名称");
            String name = sc.nextLine();
            System.out.println("修改密码");
            String pwd = sc.nextLine();
            if(name.equals(admin.loginName) && pwd.equals(admin.password)){
                System.out.println("请重新输入密码");
                admin.password = sc.nextLine();
                System.out.println("修改成功");
                break;
            }else{
                System.out.println("密码错误，重新输入");
            }
        }
        admin.introduce();
    }
}

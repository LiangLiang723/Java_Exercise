package StringDemo;

import java.util.Scanner;

public class UserLoginDemo {
    public static void main(String[] args) {
        UserLogin user = new UserLogin();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            user.verificationCode();
            boolean verify = user.verify(username, password);
            if (verify) {
                break;
            }
            if (i == 2) {
                System.out.println("您的账户已被锁定");
            } else {
                System.out.println("您还有" + (2 - i) + "次机会");
            }
        }
    }
}

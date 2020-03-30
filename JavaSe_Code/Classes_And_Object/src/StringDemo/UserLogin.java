package StringDemo;

import java.util.Random;
import java.util.Scanner;

public class UserLogin {
    private String username = "690428592";
    private String password = "690428592";
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    public UserLogin() {

    }

    public boolean verify(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)) {
            System.out.println("登录成功");
            return true;
        } else {
            System.out.println("您输入的用户名或者密码有误");
            return false;
        }
    }

    public void verificationCode() {
        while (true) {
            int[] arr = new int[4];
            String s = "";
            for (int i = 0; i < arr.length; i++) {
                arr[i] = r.nextInt(10);
                s += arr[i];
            }
            System.out.println("请输入验证码：" + s);
            String code1 = sc.nextLine();
            if (code1.equals(s)) {
                break;
            } else {
                System.out.println("您输入的验证码有误");
            }
        }
    }
}

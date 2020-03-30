package Rabbit;

import java.util.Scanner;

public class Rabbit {
    public static void main(String[] args) {
        int number = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入过了几个月：");
        int month = sc.nextInt();
        number = Process(month);
        System.out.print("现在兔子的对数为：" + number);
    }

    public static int Process(int month) {
        int num1 = 1;
        int num2 = 1;
        int number = 0;
        for (int i = 1; i <= month; i++) {
            if (i < 3)
                number = 1;
            else {
                number = num1 + num2;
                num1 = num2;
                num2 = number;
            }
        }
        return number;
    }
}

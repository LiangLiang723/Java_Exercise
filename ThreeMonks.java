import java.util.Scanner;

class ThreeMonks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个和尚的身高；");
        int height1 = sc.nextInt();

        System.out.println("请输入第二个和尚的身高；");
        int height2 = sc.nextInt();

        System.out.println("请输入第三个和尚的身高；");
        int height3 = sc.nextInt();

        int higher = height1 > height2 ? height1 : height2;
        int max = higher > height3 ? higher : height3;

        if (height1 == max) {

            System.out.println("身高最高的是第一个和尚他的身高是；" + max + "cm");
        } else if (height2 == max) {

            System.out.println("身高最高的是第二个和尚他的身高是；" + max + "cm");
        } else if (height3 == max) {

            System.out.println("身高最高的是第三个和尚他的身高是；" + max + "cm");
        }

    }
}
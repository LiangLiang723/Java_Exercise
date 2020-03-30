import java.util.Scanner;

class ThreeMonksForSwitch {

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

        switch (max) {

            case height1:
                System.out.println("身高最高的是第一个和尚他的身高是；" + max + "cm");
                break;
            case height2:
                System.out.println("身高最高的是第二个和尚他的身高是；" + max + "cm");
                break;
            default:
                System.out.println("身高最高的是第三个和尚他的身高是；" + max + "cm");
        }
    }
}
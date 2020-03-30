import java.util.Random;
import java.util.Scanner; 

class GuseeTheNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int number = r.nextInt(101);
        
        System.out.println("请输出你所猜的数字：");

        while (true) {
        
            int guessNumber = sc.nextInt();
            if (guessNumber > number) {
                System.out.println("你输入的数字大啦，请重新输入：");
            } else if (guessNumber < number) {
                System.out.println("你输入的数字小啦，请重新输入：");
            } else {
                System.out.println("恭喜你输入正确！！");
                break;
            }

        }
    }
}
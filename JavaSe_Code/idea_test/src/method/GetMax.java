package method;
import java.util.Scanner;

public class GetMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number = getMax(number1,number2);
        System.out.println(number);
    }

    public static int getMax(int number1, int number2) {

        return number1 > number2 ? number1 : number2;
    }
}

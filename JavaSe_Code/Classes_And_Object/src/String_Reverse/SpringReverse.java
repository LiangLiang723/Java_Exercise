package String_Reverse;

import java.util.Scanner;

public class SpringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();

        System.out.println(stringReverse(arr));
    }

    public static String stringReverse(String arr) {
        String s = "";
        for (int j = arr.length()-1; j >= 0; j--) {
            s += arr.charAt(j);
        }
        return s;
    }
}

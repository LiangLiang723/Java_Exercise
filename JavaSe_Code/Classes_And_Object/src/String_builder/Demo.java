package String_builder;

import java.util.Scanner;

public class  Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder arr = new StringBuilder(sc.nextLine());
        arr.reverse();
        System.out.println(arr);
    }
}

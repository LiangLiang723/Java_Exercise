package Trxt1;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        String i = "";
        Scanner sc = new Scanner(System.in);
        while (!i.equals("break")) {
            System.out.println("请输入需要录入的数据，现在是第" + (array.size() + 1) + "位，如要退出请输入break");
            i = sc.nextLine();
            array.add(i);
        }
        array.remove("break");
        System.out.println("录入完成，总共录入" + array.size() + "位数据");
        for (int j = 0; j < array.size(); j++) {
            String s = array.get(j);
            System.out.println(s);
        }
    }
}

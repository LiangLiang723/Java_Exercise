package Finding_An_Array;

import java.util.Scanner;

public class FindingAnArray01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您要查找的数字：");
        int number = sc.nextInt();
        int returnVule = findingAnArray(number);
        if(returnVule == 77){
            System.out.println("没有找到您要的数字");
        } else{
            System.out.println("您输入的数字在数组的第"+(returnVule+1)+"位");
        }
    }

    public static int findingAnArray(int number) {
        int[] arr = {19, 28, 37, 46, 50};
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return i;
            }
        }
        return 77;
    }
}

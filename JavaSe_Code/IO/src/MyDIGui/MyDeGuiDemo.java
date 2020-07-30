package MyDIGui;

public class MyDeGuiDemo {
    public static void main(String[] args) {
        //求第20个月兔子的对数
        //每个月兔子对数为上两个月个数之和，1，1，2，3，5，8，13.......
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println(arr[19]);

     /*   for(int i : arr){
            System.out.println(i);
        }*/

        System.out.println(f(20));
    }


    public static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}

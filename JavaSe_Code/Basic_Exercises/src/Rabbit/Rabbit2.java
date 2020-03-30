package Rabbit;

public class Rabbit2 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        System.out.print("[");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("]");
    }
}

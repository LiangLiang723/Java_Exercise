package KeBianShuZu;

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
        System.out.println(sum(10,20,30,40,50));
        System.out.println(sum(10,20,30,40,50,60));
        System.out.println(sum(10,20,30,40,50,60,70));
        System.out.println(sum(10,20,30,40,50,60,70,80));
        System.out.println(sum(10,20,30,40,50,60,70,80,90));
        System.out.println(sum(10,20,30,40,50,60,70,80,90,100));

    }

    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
           sum += i;
        }
        return sum;
    }
}

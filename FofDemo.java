import java.util.Scanner;
class ForDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int j = 0;
        for (int  i = 0; i <= num; i++) {
            if(i%2==0){
                j += i;
            }
        }
        System.out.println(j);
    }

}
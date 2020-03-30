package Student;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Student sd1 = new Student();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int ages                                                                                                                                                  = sc.nextInt();
        sd1.setName(name);
        sd1.setAges(ages);
        sd1.show();
        sd1.study();
        System.out.println(sd1);
        Student sd2 = new Student(name,ages);
        sd2.show();
    }
}

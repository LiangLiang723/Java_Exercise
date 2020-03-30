package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        addStudent(array);
        addStudent(array);
        addStudent(array);
        for (int i = 0; i < array.size(); i++) {
            Student ss = array.get(i);
            System.out.println(ss.getName() + "," + ss.getAges());
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        String ages = sc.nextLine();
        s.setName(name);
        s.setAges(ages);
        array.add(s);
    }
}

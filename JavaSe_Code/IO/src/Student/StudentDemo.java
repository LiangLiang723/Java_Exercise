package Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentDemo {
    public static void main(String[] args) throws IOException {

        TreeSet<Student> treeSet = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = (s2.getChinese() + s2.getMath() + s2.getEnglish())-(s1.getChinese() + s1.getMath() + s1.getEnglish());
                int num1 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num1;
            }
        });



        int i = 1;
        while (i == 1) {

            Student s = new Student();
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入姓名：");
            s.setName(sc.nextLine());
            System.out.print("请输入语文成绩：");
            s.setChinese(sc.nextInt());
            System.out.print("请输入数学成绩：");
            s.setMath(sc.nextInt());
            System.out.print("请输入英语成绩：");
            s.setEnglish(sc.nextInt());


            treeSet.add(s);

            System.out.print("谁否继续，继续请按1，退出请按任意键：");
            i = sc.nextInt();
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\src\\Student\\学生成绩.txt"));

        for (Student student : treeSet) {
            bw.write(student.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}

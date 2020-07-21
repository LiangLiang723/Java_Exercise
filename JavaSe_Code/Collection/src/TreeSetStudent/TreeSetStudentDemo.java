package TreeSetStudent;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStudentDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getMathScores() - s1.getMathScores();
                int num1 = num == 0 ? s2.getChinesePerformance() - s1.getChinesePerformance() : num;
                int num2 = num1 == 0 ? s1.getName().compareTo(s2.getName()) : num1;
                return num2;
            }
        });

        Student s1 = new Student("林青霞", 20, 100);
        Student s2 = new Student("周杰伦", 80, 100);
        Student s3 = new Student("梁静茹", 90, 10);
        Student s4 = new Student("林俊杰", 80, 80);
        Student s5 = new Student("张学友", 100, 70);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student i : ts) {
            System.out.println(i.getName() + "," + i.getMathScores() + "," + i.getChinesePerformance());
        }

    }
}

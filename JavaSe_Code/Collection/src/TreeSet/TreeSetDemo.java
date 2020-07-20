package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        Student s1 = new Student("linqinxia", 30);
        Student s2 = new Student("wangzhaojun", 32);
        Student s3 = new Student("diaochan", 31);
        Student s4 = new Student("caocao", 28);
        Student s5 = new Student("zhugeliang", 30);
        Student s6 = new Student("zhanmanyu", 36);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for (Student i : ts) {
            System.out.println(i.getName() + "," + i.getAge());
        }
    }
}

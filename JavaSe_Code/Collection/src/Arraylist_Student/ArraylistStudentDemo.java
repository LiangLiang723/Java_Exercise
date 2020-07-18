package Arraylist_Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArraylistStudentDemo {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("周杰伦", 32);
        Student s3 = new Student("林志炫", 33);

        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> it = c.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "，" + s.getAge());
        }
    }
}

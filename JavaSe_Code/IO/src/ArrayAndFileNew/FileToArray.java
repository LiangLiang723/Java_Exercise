package ArrayAndFileNew;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IO\\src\\ArrayAndFileNew\\学生目录.txt"));

        ArrayList<Student> arrayList = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            String[] strArray = line.split("，");

            Student s = new Student(strArray[0], strArray[1], Integer.parseInt(strArray[2]), strArray[3]);

            arrayList.add(s);
        }
        br.close();

        for(Student s:arrayList){
            System.out.println(s.getNumber()+"，"+s.getName()+"，"+s.getAge()+"，"+s.getHome());
        }
    }
}

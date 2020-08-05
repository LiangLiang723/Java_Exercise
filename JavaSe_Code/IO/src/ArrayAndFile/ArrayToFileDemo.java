package ArrayAndFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayToFileDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\src\\ArrayAndFile\\学生目录.txt"));

        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("201741055076", "林青霞", "22", "福建");
        Student s2 = new Student("201741055077", "周杰伦", "22", "北京");
        Student s3 = new Student("201741055078", "林俊杰", "21", "广东");
        Student s4 = new Student("201741055079", "张学友", "23", "宁夏");
        Student s5 = new Student("201741055080", "刘德华", "24", "青海");
        Student s6 = new Student("201741055081", "林俊杰", "27", "天津");
        Student s7 = new Student("201741055082", "五月天", "25", "四川");
        Student s8 = new Student("201741055083", "梁静茹", "25", "安徽");
        Student s9 = new Student("201741055084", "郭富城", "21", "浙江");
        Student s10 = new Student("201741055085", "周星驰", "24", "江西");

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);
        array.add(s6);
        array.add(s7);
        array.add(s8);
        array.add(s9);
        array.add(s10);

        for(int i = 0;i< array.size();i++){
            bw.write(array.get(i).getNumber());
            bw.write("，");
            bw.write(array.get(i).getName());
            bw.write("，");
            bw.write(array.get(i).getAge());
            bw.write("，");
            bw.write(array.get(i).getHome());
            bw.flush();
            bw.newLine();
        }
        bw.close();
    }
}

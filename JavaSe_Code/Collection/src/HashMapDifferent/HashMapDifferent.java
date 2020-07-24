package HashMapDifferent;

import java.util.HashMap;
import java.util.Set;

public class HashMapDifferent {
    public static void main(String[] args) {
        HashMap<Student, String> hashMap = new HashMap<Student, String>();

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("周杰伦", 41);
        Student s3 = new Student("林俊杰", 37);
        Student s4 = new Student("张学友", 60);
        Student s5 = new Student("刘德华", 58);

        hashMap.put(s1, "台湾");
        hashMap.put(s2, "台湾");
        hashMap.put(s3, "新加坡");
        hashMap.put(s4, "香港");
        hashMap.put(s5, "福建");

        Set<Student> key = hashMap.keySet();

        for (Student hashMapKey : key) {

            String value = hashMap.get(hashMapKey);

            System.out.println(hashMapKey.getName()+","+hashMapKey.getAge()+","+value);
        }
    }
}

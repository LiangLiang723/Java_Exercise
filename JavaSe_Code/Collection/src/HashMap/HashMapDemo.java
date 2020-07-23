package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<String, Student>();

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("周杰伦", 41);
        Student s3 = new Student("张学友", 60);
        Student s4 = new Student("刘青山", 75);
        Student s5 = new Student("周星驰", 38);

        map.put("01", s1);
        map.put("02", s2);
        map.put("03", s3);
        map.put("04", s4);
        map.put("05", s5);

        Set<String> keySet = map.keySet();

        for (String key : keySet) {
            Student value = map.get(key);
            System.out.println(key+","+value.getName()+","+value.getAge());
        }

        System.out.println("---------------");

        Set<Map.Entry<String, Student>> entries = map.entrySet();

        for(Map.Entry<String, Student> me : entries){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key+","+value.getName()+","+value.getAge());
        }

//        System.out.println(map);
    }
}

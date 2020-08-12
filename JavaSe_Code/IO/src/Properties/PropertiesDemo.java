package Properties;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) {
        myStore();
    }

    private static void myStore() {
        Properties prop = new Properties();

        prop.put("201741055076", new Student("姚一亮", 22, "福建", 1085));
        prop.put("201741055077", new Student("刘青山", 24, "浙江", 1755));
        prop.put("201741055078", new Student("张床发", 20, "安徽", 3541));

        try (FileOutputStream fos = new FileOutputStream("IO\\src\\Properties\\Student.txt")) {
            prop.store(fos, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

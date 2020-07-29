package MyFile;

import java.io.File;
import java.io.IOException;

public class MyFileDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("IO\\java.txt");

        System.out.println(f1.createNewFile());

        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getName());
        System.out.println(f1.delete());
        System.out.println("------------");

        File f2 = new File("C:\\Users\\69042\\OneDrive\\Pictures\\桌面\\Java_Exercise\\JavaSe_Code");
        String[] strArray = f2.list();
        for(String str : strArray){
            System.out.println(str);
        }
        System.out.println("------------");

        File[] fileArray = f2.listFiles();
        for(File file:fileArray){
//            System.out.println(file);
//            System.out.println(file.getName());
            if (file.isFile()==false){
                System.out.println(file.getName());
            }
        }

    }
}

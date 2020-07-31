package FIleInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IO\\src\\FileOutputStream\\fos.txt");

        int by;
        while((by=fis.read())!=-1){
            System.out.print((char) by);
        }

        fis.close();
    }
}

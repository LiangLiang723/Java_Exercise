package FIleInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis  = new FileInputStream("IO\\src\\FileOutputStream\\fos.txt");
        FileOutputStream fos = new FileOutputStream("IO\\src\\FileInputStream\\fis.txt");

        byte[] by = new byte[2048];
        int len;

//        while((len = fis.read(by))!=-1);
        fis.read(by);
        fos.write(by);

        fis.close();
        fos.close();
    }
}


package FIleInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\69042\\OneDrive\\Pictures\\屏幕快照\\2020-07-26.png");

        FileOutputStream fos = new FileOutputStream("IO\\src\\FileInputStream\\2020-07-26.png");

        int by;
        while((by=fis.read())!=-1){
            fos.write(by);
        }


        fos.close();
        fis.close();

        FileInputStream fis1 = new FileInputStream("C:\\Users\\69042\\OneDrive\\Pictures\\屏幕快照\\2020-07-22.png");

        FileOutputStream fos1 = new FileOutputStream("IO\\src\\FileInputStream\\2020-07-22.png");

        byte[] b = new byte[1024];
        int len;
        while ((len=fis1.read(b))!=-1){
            fos1.write(b,0,len);
        }
        fos1.close();
        fis1.close();
    }
}

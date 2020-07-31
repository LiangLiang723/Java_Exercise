package FIleInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyZipDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\谷歌浏览器下载\\XMind ZEN 2020 v10.1.3.zip");

        FileOutputStream fos = new FileOutputStream("IO\\src\\FileInputStream\\XMind ZEN 2020 v10.1.3.zip");

/*        int by;
        while((by = fis.read())!=-1){
            fos.write(by);
        }*/

        byte[] bytes = new byte[2048];
        int len;
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}

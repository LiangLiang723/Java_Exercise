package FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("IO\\src\\FileOutputStream\\fos.txt");
        FileOutputStream fos = new FileOutputStream("IO\\src\\FileOutputStream\\fos.txt",true);
//        byte[] a ={97,98,99,100};
        String i = "我是你爸爸！";

        byte[] b = i.getBytes();

        fos.write(b);


        fos.close();//关闭此输出流并释放相关联的任何系统资源
    }
}

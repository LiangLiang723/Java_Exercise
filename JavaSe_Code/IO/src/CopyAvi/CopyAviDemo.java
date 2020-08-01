package CopyAvi;

import java.io.*;

public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\回忆相册\\香港之旅\\VID_20170831_150832.mp4");
        FileOutputStream fos = new FileOutputStream("IO\\src\\CopyAvi\\VID_20170831_150832.mp4");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //记录开始时间
        long startTime = System.currentTimeMillis();

        //method1(fis,fos);//共耗时：80121毫秒
        //method2(fis,fos);//共耗时：121毫秒
        //method3(bis,bos);//共耗时：414毫秒
        //method4(bis,bos);//共耗时：共耗时：40毫秒

        //记录结束时间
        long endTime = System.currentTimeMillis();
        //运行时间
        System.out.println("共耗时：" + (endTime - startTime) + "毫秒");

    }

    public static void method1(FileInputStream fis, FileOutputStream fos) throws IOException {
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();
    }

    public static void method2(FileInputStream fis, FileOutputStream fos) throws IOException {
        byte[] by = new byte[1024];
        int len;
        while ((len = fis.read(by)) != -1) {
            fos.write(by, 0, len);
        }
        fos.close();
        fis.close();
    }

    public static void method3(BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }
        bis.close();
        bos.close();
    }

    public static void method4(BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        byte[] by = new byte[1024];
        int len;
        while ((len = bis.read(by)) != -1) {
            bos.write(by, 0, len);
        }
        bis.close();
        bos.close();
    }
}

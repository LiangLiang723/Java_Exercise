package CopyAvi;

import java.io.*;

public class CopyMp4Demo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\王者荣耀精彩视频\\SVID_20200801_224130_1.mp4"));
        BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("E:\\王者荣耀精彩视频\\SVID_20200801_225302_1.mp4"));
        BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("E:\\王者荣耀精彩视频\\SVID_20200801_225320_1.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IO\\src\\CopyAvi\\精彩视频.mp4", true));

       /* 耗时：3713毫秒
        耗时：15毫秒
        耗时：83毫秒*/

        long startTime = System.currentTimeMillis();
        method(bis, bos);
        long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime) + "毫秒");

        long startTime1 = System.currentTimeMillis();
        method(bis1, bos);
        long endTime1 = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime1 - startTime1) + "毫秒");

        long startTime2 = System.currentTimeMillis();
        method(bis2, bos);
        long endTime2 = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime2 - startTime2) + "毫秒");

        bis.close();
        bis1.close();
        bis2.close();
        bos.close();

    }

    public static void method(BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        byte[] by = new byte[1024];
        int len;
        while ((len = bis.read(by)) != -1) {
            bos.write(by, 0, len);
        }
    }
}

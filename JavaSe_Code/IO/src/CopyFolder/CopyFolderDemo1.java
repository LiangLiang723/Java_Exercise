package CopyFolder;

import java.io.*;


public class CopyFolderDemo1 {
    public static void main(String[] args) {
        File srcFolder = new File("C:\\Users\\69042\\OneDrive\\Pictures\\桌面\\Java_Exercise");


        File destFolder = new File("C:\\Users\\69042\\OneDrive - jmu.edu.cn");

        if (!destFolder.exists()) {
            destFolder.mkdir();
        }

        copyFolder(srcFolder, destFolder);

    }

    public static void copyFolder(File srcFolder, File destFolder) {
        File destFolder1 = new File(destFolder, srcFolder.getName());
        if (srcFolder.isDirectory()) {
            if (!destFolder1.exists()) {
                destFolder1.mkdir();
            }

            File[] fileArray = srcFolder.listFiles();

            for (File file : fileArray) {
                copyFolder(file, destFolder1);
            }
        } else {
            copyFile(srcFolder, destFolder1);
        }
    }

    private static void copyFile(File srcFolder, File destFolder1) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFolder));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFolder1))) {

            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
/*
    File[] fileArray = srcFolder.listFiles();

        for (File file : fileArray) {
                File srcFolder1 = file;
                File destFolder1 = new File(destFolder.getAbsolutePath(), file.getName());
                if (file.isDirectory()) {
                if (!destFolder1.exists()) {
                destFolder1.mkdir();
                }
                copyFolder(file, destFolder1);
                } else if (file.isFile()) {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFolder1));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFolder1));

                byte[] bytes = new byte[1024];
                int len;
                while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes);
                }
                bis.close();
                bos.close();
                }
                }*/
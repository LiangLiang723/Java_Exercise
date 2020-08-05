package CopyFolder;

import java.io.*;

public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("C:\\Users\\69042\\OneDrive\\Pictures\\桌面\\Java_Exercise");

        String srcFolderName = srcFolder.getName();

        File destFolder = new File("C:\\Users\\69042\\OneDrive - jmu.edu.cn", srcFolderName);

        if (!destFolder.exists()) {
            destFolder.mkdir();
        }

        copyFolder(srcFolder, destFolder);

    }

    public static void copyFolder(File srcFolder, File destFolder) throws IOException {
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
        }

    }
}

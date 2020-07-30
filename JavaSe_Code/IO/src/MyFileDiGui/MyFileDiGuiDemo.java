package MyFileDiGui;

import java.io.File;

public class MyFileDiGuiDemo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\69042\\OneDrive\\Pictures\\桌面\\Java_Exercise\\JavaSe_Code");

        lookFile(f);
    }

    public static void lookFile(File f){
        File[] files = f.listFiles();
        System.out.println(f.getName()+"下的：");
        if(files !=null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    lookFile(file);
                } else {
                    System.out.println(file.getName());
                }
            }
        }
    }
}

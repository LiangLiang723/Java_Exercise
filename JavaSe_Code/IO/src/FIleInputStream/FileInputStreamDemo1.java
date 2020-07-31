package FIleInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis  = new FileInputStream("IO\\src\\FileOutputStream\\fos.txt");
        FileOutputStream fos = new FileOutputStream("IO\\src\\FileInputStream\\fis.txt",true);
     /*   int[] qu={};

        int intPut;
        int i = 0;
        while ((intPut=fis.read())!=-1){
            qu[i]=intPut;
            i++;
        }


        for(int j=0;j<qu.length;j++){
            fos.write(qu[i]);
        }*/

        int by;

        while((by=fis.read())!=-1){
            fos.write(by);
        }

        fis.close();
        fos.close();
    }
}

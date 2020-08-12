package TCPDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.3.104", 10086);

        OutputStream os = s.getOutputStream();
        os.write("hello,TCP,我来了!".getBytes());

        InputStream is = s.getInputStream();
        byte[] bytes =new byte[1024];
        int len =is.read(bytes);
/*        while((len = is.read(bytes))!=-1){
            String data =new String(bytes,0,len);
        }*/
        String data =new String(bytes,0,len);
        System.out.println("客户端："+data);

        s.close();
    }
}

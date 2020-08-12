package TCPDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(10086);

        //监听客户端链接，返回一个Socket对象
        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        byte[] bytes =new byte[1024];
        int len = is.read(bytes);
        String data = new String(bytes,0,len);
        System.out.println("服务器："+data);

        OutputStream os = s.getOutputStream();
        os.write("数据已经收到".getBytes());

        ss.close();
    }
}

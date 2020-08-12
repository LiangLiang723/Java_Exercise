package UDPDemo;

import java.io.IOException;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象
        DatagramSocket ds =new DatagramSocket();

        //创建数据，并把数据打包
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //构造用于发送长度的分组的数据报包 length指定主机上到指定的端口号。
        byte[] bytes = "Hello World!".getBytes();
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,InetAddress.getByName("192.168.3.104"),10086);

        //调用DatagramSocket对象发送数据
        ds.send(dp);

        //关闭发送端
        ds.close();
    }
}

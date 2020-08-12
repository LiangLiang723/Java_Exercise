package UDPDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象
        DatagramSocket ds = new DatagramSocket(10086);

        //创建一个数据包用于接受数据
        //DatagramPacket(byte[] buf, int length)
        //构造一个 DatagramPacket用于接收长度的数据包 length 。
        byte[] bytes =new byte[1024];
        DatagramPacket dp =new DatagramPacket(bytes,bytes.length);

        ds.receive(dp);

        //解析数据包，并把数据再控制台输出
//        byte[] data = dp.getData();
//        int len = dp.getLength();
//        String dataString = new String(data,0,len);
//        System.out.println("数据是:"+dataString);
        System.out.println("数据是:"+new String(dp.getData(),0, dp.getLength()));

        ds.close();
    }
}

package InetAddressDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //InetAddress address =InetAddress.getByName("DESKTOP-JA1PQSP");
        InetAddress address =InetAddress.getByName("192.168.3.104");

        String name = address.getHostName();

        String ip = address.getHostAddress();

        System.out.println("主机名："+name);
        System.out.println("ip地址："+ip);
    }
}

package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getLocalHost();
        System.out.println(address);

        InetAddress address1=InetAddress.getByName("www.geeksforgeeks.org"); //remove https://...
        //System.out.println(address1);
        Stream.of(address1).forEach(a-> System.out.println(a));//if website has multiple values then we can use stream

    }
}

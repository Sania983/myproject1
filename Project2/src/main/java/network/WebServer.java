package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(5000);
            System.out.println("secure running on 5000 port");
            System.out.println("server waiting for connection");
            Socket accept=serverSocket.accept();

            DataOutputStream dataOutputStream=new DataOutputStream(accept.getOutputStream());

            System.out.println("connected client address: "+accept.getInetAddress());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

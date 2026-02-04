package network;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class WebClient {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("localhost",5000);
            System.out.println("client running");

            BufferedReader bufferedReader=new BufferedReader( new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

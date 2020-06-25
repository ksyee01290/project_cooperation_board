package java_socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args){
        try{
            Socket c_socket = new Socket("127.0.0.1",8888);
            InputStream input_data = c_socket.getInputStream();

            byte[] receiveBuffer = new byte[100];
            input_data.read(receiveBuffer);

            System.out.println(new String(receiveBuffer));

            c_socket.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
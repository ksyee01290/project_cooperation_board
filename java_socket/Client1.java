package java_socket;
import java.io.DataInputStream;
import java.net.Socket;

public class Client1{

    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 10002);
            System.out.println("접속 성공!");
        } catch(Exception e){

        }
    }
}

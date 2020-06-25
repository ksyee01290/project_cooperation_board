package java_socket;

import java.io.DataInputStream;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        try{
            System.out.println("접속을 기다립니다.");
            ServerSocket serverSocket = new ServerSocket(10002);
            AcceptThread acceptThread = new AcceptThread(serverSocket);
    
            new Thread(acceptThread).start();
    
            System.out.println("내가서버다.");
    
        }catch(Exception e){
    
        }
    }

}
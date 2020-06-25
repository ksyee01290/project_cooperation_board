package java_socket;
import java.net.Socket;
import java.net.ServerSocket;

public class AcceptThread implements Runnable {
    ServerSocket serverSocket;
    Socket client;

    public AcceptThread(ServerSocket serverSocket){
        this.serverSocket = serverSocket;
    }
    @Override
    public void run(){
        while(true){
            try{
                client = serverSocket.accept();
                System.out.println("connected client"+client);
            }catch(Exception e){

            }
        }
    }

}
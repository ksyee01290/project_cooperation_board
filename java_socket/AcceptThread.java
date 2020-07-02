package java_socket;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

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
                new Receiver(client).start();
                System.out.println("connected client"+client);
                
            }catch(Exception e){

            }
        }
    }

}
class Receiver extends Thread{
    Socket socket;
    DataInputStream in;
    DataOutputStream out;

    Receiver(Socket socket){
        this.socket = socket;
        try{
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
        }catch(IOException e){}
    }

    public void run(){
        while(in!=null){
         
            try{
                int source = in.readInt();
                System.out.println(source);

                out.writeInt(source+1);

            }catch(IOException e){}
        }
    }
}
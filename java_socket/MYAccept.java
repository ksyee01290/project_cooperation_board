package java_socket;
import java.net.Socket;
import java.net.ServerSocket;

public class MYAccept {
    public static void main(String[] args) {
        try{
            System.out.println("서버 스타트 ... 클라이언트의 접속을 기다립니다.");
            ServerSocket serverSocket = new ServerSocket(10002);

            Socket cli = serverSocket.accept();
            System.out.println("클라이언트 접속"+cli);

        }catch(Exception e){

        }
    }
}
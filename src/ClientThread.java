// Craig Kimball 4/13/23
// COMP430 Project 2

import java.io.IOException;
import java.io.PrintStream;
import java.net.*;

public class ClientThread extends Thread{
    Socket socket;

    public ClientThread (Socket socket){
        this.socket = socket;
    }

    public void run(){
        handleConnection(socket);
        System.out.println("Made it to run");
    }

    public void handleConnection(Socket socket){
        try{
            PrintStream stream = new PrintStream(socket.getOutputStream());
            stream.println("Made it to handleConnection");
            stream.close();
            socket.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}

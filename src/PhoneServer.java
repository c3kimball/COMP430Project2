// Craig Kimball 4/13/23
// COMP430 Project 2

import java.util.*;
import java.io.*;
import java.net.*;


public class PhoneServer {
    // The port number on which the server will be listening
    private static int port = 2014;
    // The server socket.
    private static ServerSocket listener = null;
    // The client socket.
    private static Socket clientSocket = null;

    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(port);
        System.out.println("Server started.");
        System.out.println("Waiting for clients...");

        Socket clientSocket = server.accept();
        System.out.println("Connected a client");
        ClientThread client = new ClientThread(clientSocket);
        client.start();

    }
}

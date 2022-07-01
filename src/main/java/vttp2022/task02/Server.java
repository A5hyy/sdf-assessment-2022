package vttp2022.task02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.random.RandomGenerator;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Random r = new Random();
        int n = r.nextInt();
        
        // n stores the random integer in defcimal form
        String Hexadecimal = Integer.toHexString(n);
        
        // toHexString(n) converts n to hexadecimal form
        System.out.println("Random Hexadecimal Byte: "
                           + Hexadecimal);

        ServerSocket ss = new ServerSocket(80);
        System.out.println("ServerSocket awaiting connections...");
        Socket socket = ss.accept(); 
        System.out.println("Connection from " + socket );
        System.out.println(Hexadecimal);

        
        InputStream inputStream = socket.getInputStream();
        
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        List<Message> listOfMessages = (List<Message>) objectInputStream.readObject();
        System.out.println("Received [" + listOfMessages.size() + "] messages from: " + socket);
    
        // updated pom but still has an error, compilable however
        //listOfMessages.forEach((msg)-> System.out.println(msg.getText()));

        System.out.println(listOfMessages);
    
                
        System.out.println("Closing sockets.");
        ss.close();
        socket.close();
    }
}


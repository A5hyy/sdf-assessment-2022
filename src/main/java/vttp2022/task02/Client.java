package vttp2022.task02;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("task02.chuklee.com", 80);
        System.out.println("Connected....");

        
        OutputStream outputStream = socket.getOutputStream();    
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        List<Message> messages = new ArrayList<>();
        messages.add(new Message("335e8d26"));
        messages.add(new Message("Muhammad Ashraf"));
        messages.add(new Message("ashyalsher@gmail.com"));
        messages.add(new Message(""));

        System.out.println("Sending messages to the ServerSocket");
        objectOutputStream.writeObject(messages);

        System.out.println("Closing socket and terminating program.");
        socket.close();
    }
}
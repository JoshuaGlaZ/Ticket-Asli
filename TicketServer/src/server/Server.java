/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Server implements Runnable{
    String chatClient, chatServer = "";
    Socket incoming;
    ServerSocket s;
    Thread t;
    ArrayList<HandleSocket> clients = new ArrayList<>();
    
    public Server() {
        try {
            s = new ServerSocket(6002);
            if (t == null) {
                t = new Thread(this, "Ticketing System");
                t.start();
            }
        } catch (Exception e) {
            System.out.println("Error di Server: " + e);
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                incoming = s.accept();
                HandleSocket hs = new HandleSocket(this, incoming);
                hs.start();
                clients.add(hs);
            }
        } catch (Exception e) {
            System.out.println("Error di Run " + e);
        }
    }
    
    public String giveRespond(String msg) {
        // LOGIN~username~password
        if (msg.contains("LOGIN~")) {
            String message[] = msg.split("~");
            if(checkUser(message[1], message[2])){
                return "SUCCESS";
            } else {
                return "FAIL~USERNAME:"+message[1]+"~PASSWORD"+message[2];
            }
        // REGISTER~username~password~email
        } else if (msg.contains("REGISTER~")) {
            String message[] = msg.split("~");
            insertUser(message[1], message[2], message[3]);
            return "SUCCESS";
        } else if (msg.contains("ACARA~")) {
            
        } else if (msg.contains("PARKIR~")) {
            
        } 
        return "COMMAND NOT RECOGNIZE";
    }
    
    public void broadcast(String message)
    {
        for (HandleSocket _client : clients) {
            _client.sendMessage(message);
        }
    }

    private static Boolean checkUser(java.lang.String username, java.lang.String password) {
        server.TicketWebService_Service service = new server.TicketWebService_Service();
        server.TicketWebService port = service.getTicketWebServicePort();
        return port.checkUser(username, password);
    }

    private static void insertUser(java.lang.String username, java.lang.String password, java.lang.String email) {
        server.TicketWebService_Service service = new server.TicketWebService_Service();
        server.TicketWebService port = service.getTicketWebServicePort();
        port.insertUser(username, password, email);
    }
}

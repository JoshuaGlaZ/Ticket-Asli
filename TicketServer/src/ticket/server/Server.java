/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticket.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import ticket.model.Account;
import ticket.model.HandleSocket;

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
    
    Account account;
    
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Server server = new Server();
    }
    
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
    
    public void registerAccount(HandleSocket _hsclient, String msg) {
        System.out.println(msg);
        String msgSplit[] = msg.split("~");
        String username = msgSplit[1];
        String password = msgSplit[2];
        String email = msgSplit[3];
        
        account = new Account(username, password, email);
        String result = account.insertData();
        for (HandleSocket hs : clients){
            if(hs==_hsclient){
                hs.sendMessage(result);
            }
        }
    }
    
    public void loginAccount(HandleSocket _hsclient, String msg) {
        String msgSplit[] = msg.split("~");
        String username = msgSplit[1];
        String password = msgSplit[2];
        
        String result;
        account = new Account(username, password);
        ArrayList<Object> listAccount = account.checkUser();
        if(!listAccount.isEmpty()){
            result = "SUCCESS";
            account = (Account)listAccount.get(0);
        } else {
            result = "Tidak ada akun dengan username dan password yang terdaftar";
        }
        
        for (HandleSocket hs : clients){
            if(hs==_hsclient){
                hs.sendMessage(result);
                if(result.equals("SUCCESS")){
                    hs.sendMessage(String.valueOf(account.getId()));
                }
            }
        }
    }
}

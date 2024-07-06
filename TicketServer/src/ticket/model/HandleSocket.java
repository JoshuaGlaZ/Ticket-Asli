/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticket.model;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import ticket.server.Server;

/**
 *
 * @author TC4B
 */
public class HandleSocket extends Thread{
    Server parent;
    Socket client;
    DataOutputStream out;
    BufferedReader in;
    
    public HandleSocket(Server _parent, Socket _client) {
        try {
            this.parent = _parent;
            this.client = _client;
            out = new DataOutputStream(client.getOutputStream());
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        } catch (IOException ex) {
            System.out.println("Error constructor hs " + ex);
        }
    }

    public void sendMessage(String msg) {
        try {
            out.writeBytes(msg + "\n");
        } catch (Exception e) {
            System.out.println("Error sendMessage "+e);
        }
    }
    
    public void retrieveMessage()
    {
        try {
            String message = in.readLine();
            System.out.println(message);
            if(message.contains("REGISTER~")){
                //Register
                parent.registerAccount(this, message);
            } else {
                //Login
                parent.loginAccount(this, message);
            }
        } catch (IOException ex) {
            Logger.getLogger(HandleSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void run(){
        while(true) {
            retrieveMessage();
        }
    }
}

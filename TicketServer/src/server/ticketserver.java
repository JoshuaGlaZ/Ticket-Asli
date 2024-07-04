/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class TicketServer implements Runnable {

    String chatClient, chatServer = "";
    Socket incoming;
    ServerSocket s;
    Thread t;
    ArrayList<HandleSocket> clients = new ArrayList<>();

    public TicketServer() {
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
            System.out.println("Error in TicketServer Run " + e);
        }
    }

    public void giveRespond(String msg) {
        // LOGIN~username~password
        if (msg.contains("RESERVELOT~")) {
            String message[] = msg.split("~");
            if (reserveNewLot(message[1], message[2], message[3], message[4], message[5], message[6], message[7])) {
                return "SUCCESS;
            } else {
                return false;
            }
            // REGISTER~username~password~email
//        } else if (msg.contains("REGISTER~")) {
//            String message[] = msg.split("~");
//            insertUser(message[1], message[2], message[3]);
//            return "SUCCESS";
//        } else if (msg.contains("ACARA~")) {
//
//        } else if (msg.contains("PARKIR~")) {
//
        }
        return "COMMAND NOT RECOGNIZE";
    }

    private static void reserveNewLot(int parkingLotId, int userId, server.Date startDate, server.Date endDate, int lotNumber, int harga, String jenisTiket) {
        server.TicketWebService_Service service = new server.TicketWebService_Service();
        server.TicketWebService port = service.getTicketWebServicePort();
        port.reserveNewLot(parkingLotId, userId, startDate, endDate, lotNumber, harga, jenisTiket);
    }
    
}

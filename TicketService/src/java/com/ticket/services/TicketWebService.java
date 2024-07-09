/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.ticket.services;

import com.ticket.model.Account;
import com.ticket.model.ParkingLots;
import com.ticket.model.ParkingReservation;
import java.sql.Date;
import java.util.ArrayList;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement
@XmlSeeAlso({ParkingLots.class, ParkingReservation.class})
/**
 *
 * @author LENOVO
 */
@WebService(serviceName = "TicketWebService")
public class TicketWebService {
    ParkingLots temParkingLots = new ParkingLots();
    Account a;
    ParkingReservation pr;
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "viewListUser")
    public ArrayList<Object> viewListUser() {
        a = new Account();
        return a.viewListData();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "reserveNewLot")
    public void reserveNewLot(@WebParam(name = "parking_lot_id") int parking_lot_id, @WebParam(name = "user_id") int user_id, @WebParam(name = "start_date") Date start_date, @WebParam(name = "end_date") Date end_date, @WebParam(name = "lot_number") int lot_number, @WebParam(name = "harga") int harga, @WebParam(name = "jenis_tiket") String jenis_tiket) {
        pr = new ParkingReservation(parking_lot_id, user_id, start_date, end_date, lot_number, harga, jenis_tiket);
        pr.insertData();
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "isiComboVenue")
    public ArrayList<String> isiComboVenue() {
        //TODO write your implementation code here:
        ArrayList<String> listTemParkingLots = temParkingLots.viewListDataString();
        return listTemParkingLots;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "isiListLots")
    public ArrayList<String> isiListLots(@WebParam(name = "venue_name") String venue_name) {
        //TODO write your implementation code here:
        ArrayList<String> listTemParkingLots = temParkingLots.checkAvaibleLots(venue_name);
        return listTemParkingLots;
    }

}

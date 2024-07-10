/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.ticket.services;

import com.ticket.model.ParkingLots;
import com.ticket.model.ParkingReservation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
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
    @WebMethod(operationName = "reserveNewLot")
    public void reserveNewLot(@WebParam(name = "parking_lot_id") int parking_lot_id, @WebParam(name = "user_id") int user_id, @WebParam(name = "reservation_date") String reservation_date, @WebParam(name = "lot_number") int lot_number, @WebParam(name = "harga") int harga, @WebParam(name = "jenis_tiket") String jenis_tiket) {
        pr = new ParkingReservation(parking_lot_id, user_id, reservation_date, lot_number, harga, jenis_tiket);
        pr.insertData();
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "isiComboVenue")
    public ArrayList<String> isiComboVenue() {
        //TODO write your implementation code here:
        ArrayList<String> listTemParkingLots = temParkingLots.viewListDataVenueName();
        return listTemParkingLots;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "isiComboLocation")
    public ArrayList<String> isiComboLocation(@WebParam(name = "venue_name") String venue_name) {
        //TODO write your implementation code here:
        ArrayList<String> listTemParkingLots = temParkingLots.viewListDataLocation(venue_name);
        return listTemParkingLots;
    }
    
    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "isiDateCheckIn")
    public String isiDateCheckIn(@WebParam(name = "venue_name") String venue_name, @WebParam(name = "location") String location) {
        //TODO write your implementation code here:
        String dateRange = temParkingLots.viewDataDate(venue_name, location);
        return dateRange;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "isiListLots")
    public ArrayList<String> isiListLots(@WebParam(name = "venue_name") String venue_name, @WebParam(name = "location") String location, @WebParam(name = "reserve_date") String reserve_date) {
        //TODO write your implementation code here:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        LocalDate dateTime = LocalDate.parse(reserve_date, formatter);
        ArrayList<String> listTemParkingLots = temParkingLots.checkAvaibleLots(venue_name, location, dateTime);
        return listTemParkingLots;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getIdParkingLots")
    public Integer getIdParkingLots(@WebParam(name = "venue_name") String venue_name, @WebParam(name = "location") String location) {
        //TODO write your implementation code here:
        int id = temParkingLots.getParkingLotsId(venue_name, location);
        return id;
    }
}

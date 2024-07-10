/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author louis
 */
public class EventTickets extends MyModel {
    
    private int id;
    private int event_id;
    private int user_id;
    private String reservation_date;
    private int harga;
    private String jenis_ticket;
    
    public EventTickets() {
        this.id = 0;
        this.event_id = 0;
        this.user_id = 0;
        this.reservation_date = null;
        this.harga = 0;
        this.jenis_ticket = null;
    }

    public EventTickets(int id, int event_id, int user_id, String reservation_date, int harga, String jenis_ticket) {
        this.id = id;
        this.event_id = event_id;
        this.user_id = user_id;
        this.reservation_date = reservation_date;
        this.harga = harga;
        this.jenis_ticket = jenis_ticket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getReservation_date() {
        return reservation_date;
    }

    public void setReservation_date(String reservation_date) {
        this.reservation_date = reservation_date;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getJenis_ticket() {
        return jenis_ticket;
    }

    public void setJenis_ticket(String jenis_ticket) {
        this.jenis_ticket = jenis_ticket;
    }
    
    
    

    @Override
    public String insertData() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = MyModel.conn.prepareStatement(
                        "INSERT INTO eventtickets(event_id, user_id, reservation_date, harga, jenis_tiket) VALUES (?, ?, ?, ?, ?)"
                );
                sql.setInt(1, this.event_id);
                sql.setInt(2, this.user_id);
                sql.setString(3, this.reservation_date);
                sql.setInt(4, this.harga);
                sql.setString(5, this.jenis_ticket);
                sql.executeUpdate();
                sql.close();
            }
        } catch (SQLException e) {
            System.out.println("Error in insertData: " + e);
        }
        return null;
    }

    @Override
    public void updateData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Object> viewListData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

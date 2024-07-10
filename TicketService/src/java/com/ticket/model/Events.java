/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author louis
 */
public class Events extends MyModel{
    
     public int id;
    public String name;
    public String Description;
    public LocalDate start_date;
    public LocalDate end_date;
    public int available_tickets;
    public String location;
    public Timestamp created_at;
    
    
    public Events(int id, String name, String Description, LocalDate start_date, LocalDate end_date, int available_tickets, String location, Timestamp created_at) {
        this.id = id;
        this.name = name;
        this.Description = Description;
        this.start_date = start_date;
        this.end_date = end_date;
        this.available_tickets = available_tickets;
        this.location = location;
        this.created_at = created_at;
    }
    
    public Events() {
        this.id = 0;
        this.name = "";
        this.Description = "";
        this.start_date = null;
        this.end_date = null;
        this.available_tickets = 0;
        this.location = null;
        this.created_at = null;
    }
   

    @Override
    public String insertData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

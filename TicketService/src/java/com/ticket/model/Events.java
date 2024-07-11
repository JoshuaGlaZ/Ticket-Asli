/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    public String start_date;
    public String end_date;
    public int available_tickets;
    public String location;
    public Timestamp created_at;
    
    
    public Events(int id, String name, String Description, String start_date, String end_date, int available_tickets, String location, Timestamp created_at) {
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
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public int getAvailable_tickets() {
        return available_tickets;
    }

    public void setAvailable_tickets(int available_tickets) {
        this.available_tickets = available_tickets;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
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
        ArrayList<Object> collections = new ArrayList<Object>();
        try {
            if(!MyModel.conn.isClosed()){
                PreparedStatement sql = (PreparedStatement)MyModel.conn.prepareStatement(
                        "select * from events");
                this.result= sql.executeQuery();
                
                while(this.result.next()){
                    Events e = new Events(
                        this.result.getInt("id"),
                        this.result.getString("name"),
                        this.result.getString("description"),
                        this.result.getString("start_date"),
                        this.result.getString("end_date"),
                        this.result.getInt("available_ticket"),
                        this.result.getString("location"),
                        this.result.getTimestamp("created_at"));
                    collections.add(e);
                }
                sql.close();
            }
        } catch (SQLException e) {
            System.out.println("Error in viewListData: " + e.getMessage());
        }
        return collections;
    }

    public ArrayList<String> viewListDataEvent() {
        ArrayList<String> collections = new ArrayList<String>();
        try {
            if(!MyModel.conn.isClosed()){
                PreparedStatement sql = (PreparedStatement)MyModel.conn.prepareStatement(
                        "select * from events");
                this.result= sql.executeQuery();
                
                while(this.result.next()){
                    Events e = new Events(
                        this.result.getInt("id"),
                        this.result.getString("name"),
                        this.result.getString("description"),
                        this.result.getString("start_date"),
                        this.result.getString("end_date"),
                        this.result.getInt("available_ticket"),
                        this.result.getString("location"),
                        this.result.getTimestamp("created_at"));
                    collections.add(e.getId() + "~" + e.getName() + "~"  
                            + e.getDescription() + "~" + e.getStart_date() + "~" 
                            + e.getEnd_date() + "~" + e.getAvailable_tickets() + "~" 
                            + e.getLocation() + "~" + e.getCreated_at());
                }
                sql.close();
            }
        } catch (SQLException e) {
            System.out.println("Error in viewListData: " + e.getMessage());
        }
        return collections;
    }
    
    
}

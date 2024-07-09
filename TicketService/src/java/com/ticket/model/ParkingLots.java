package com.ticket.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * ParkingLots model class
 */
public class ParkingLots extends MyModel {

    private int id;
    private String venue_name;
    private String location;
    private int available_lots;
    private Timestamp created_at;

    public ParkingLots() {
        this.id = 0;
        this.venue_name = null;
        this.location = null;
        this.available_lots = 0;
        this.created_at = null;
    }

    // Getter and Setter methods...
    public ParkingLots(String _venue_name, String _location, int _available_lots, Timestamp _created_at) {
        this.venue_name = _venue_name;
        this.location = _location;
        this.available_lots = _available_lots;
        this.created_at = _created_at;
    }

    public ParkingLots(int id, String venue_name, String location, int available_lots) {
        this.id = id;
        this.venue_name = venue_name;
        this.location = location;
        this.available_lots = available_lots;
    }

    @Override
    public String insertData() {
        return null;
    }

    @Override
    public void updateData() {
    }

    @Override
    public void deleteData() {
    }

    @Override
    public ArrayList<Object> viewListData() {
        ArrayList<Object> collections = new ArrayList<Object>();
        try {
            if(!MyModel.conn.isClosed()){
                PreparedStatement sql = (PreparedStatement)MyModel.conn.prepareStatement(
                        "select * from parkinglots");
                this.result= sql.executeQuery();
            }
            while(this.result.next()){
                ParkingLots temParkingLots = new ParkingLots(this.result.getInt("id"),
                    this.result.getString("venue_name"),
                    this.result.getString("location"),
                    this.result.getInt("available_lots"));
                collections.add(temParkingLots);
            }
        } catch (SQLException e) {
            System.out.println("Error in viewListData: " + e.getMessage());
        }
        return collections;
    }
    
    public ArrayList<String> viewListDataString() {
        ArrayList<String> collections = new ArrayList<String>();
        try {
            if(!MyModel.conn.isClosed()){
                PreparedStatement sql = (PreparedStatement)MyModel.conn.prepareStatement(
                        "select * from parkinglots");
                this.result= sql.executeQuery();
            }
            while(this.result.next()){
                collections.add(this.result.getString("venue_name"));
            }
        } catch (SQLException e) {
            System.out.println("Error in viewListDataString: " + e.getMessage());
        }
        return collections;
    }
    
    public ArrayList<String> checkAvaibleLots(String venue_name) {
        ArrayList<String> collections = new ArrayList<String>();
        ArrayList<Integer> listOccupiedLots = new ArrayList<Integer>();
        ParkingReservation preserve = new ParkingReservation();
        try {
            if(!MyModel.conn.isClosed()){
                PreparedStatement sql = (PreparedStatement)MyModel.conn.prepareStatement(
                        "select * from parkinglots where venue_name=? limit 1");
                sql.setString(1, venue_name);
                this.result= sql.executeQuery();
            }
            while(this.result.next()){
                listOccupiedLots = preserve.checkOccupiedLots(this.result.getInt("id"));
                int available_lots = this.result.getInt("available_lots");
                for (int i = 1; i < available_lots+1; i++) {
                    if(listOccupiedLots.size()!=0){
                        for (int occupiedLots : listOccupiedLots) {
                            if(occupiedLots!=i){
                                collections.add(String.valueOf(i));
                            }
                        }
                    } else {
                        collections.add(String.valueOf(i));
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error in checkLots: " + e.getMessage());
        }
        return collections;
    }
}

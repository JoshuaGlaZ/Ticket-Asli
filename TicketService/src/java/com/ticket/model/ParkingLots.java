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

    @Override
    public void insertData() {
//        try (PreparedStatement sql = MyModel.conn.prepareStatement("INSERT INTO myvehicle(number_plate, brand, vehicle_class, color) VALUES(?, ?, ?, ?)")) {
//            sql.setString(1, this.number_plate);
//            sql.setString(2, this.brand);
//            sql.setInt(3, this.vehicle_class);
//            sql.setString(4, this.color);
//            sql.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println("Error in insertData: " + e.getMessage());
//        }
    }

    @Override
    public void updateData() {
//        try (PreparedStatement sql = MyModel.conn.prepareStatement("UPDATE myvehicle SET number_plate = ?, brand = ?, vehicle_class = ?, color = ?, updated_at = ? WHERE id = ?")) {
//            sql.setString(1, this.number_plate);
//            sql.setString(2, this.brand);
//            sql.setInt(3, this.vehicle_class);
//            sql.setString(4, this.color);
//            sql.setTimestamp(5, this.updated_at);
//            sql.setInt(6, this.id);
//            sql.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println("Error in updateData: " + e.getMessage());
//        }
    }

    @Override
    public void deleteData() {
//        try (PreparedStatement sql = MyModel.conn.prepareStatement("DELETE FROM myvehicle WHERE id = ?")) {
//            sql.setInt(1, this.id);
//            sql.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println("Error in deleteData: " + e.getMessage());
//        }
    }

    @Override
    public ArrayList<Object> viewListData() {
        ArrayList<Object> collections = new ArrayList<>();
//        try (Statement statement = MyModel.conn.createStatement(); ResultSet result = statement.executeQuery("SELECT * FROM myvehicle")) {
//            while (result.next()) {
//                ParkingLots vec = new ParkingLots(
//                        result.getInt("id"),
//                        result.getString("number_plate"),
//                        result.getString("brand"),
//                        result.getInt("vehicle_class"),
//                        result.getString("color"),
//                        result.getTimestamp("created_at"),
//                        result.getTimestamp("updated_at")
//                );
//                collections.add(vec);
//            }
//        } catch (SQLException e) {
//            System.out.println("Error in viewListData: " + e.getMessage());
//        }
        return collections;
    }
}

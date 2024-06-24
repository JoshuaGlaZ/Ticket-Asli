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
public class ParkingReservation extends MyModel {

    private int id;
    private int parking_lot_id;
    private int user_id;
    private Timestamp created_at;
    private int lot_number;
    private int harga;
    private String jenis_tiket;

    public ParkingReservation() {
        this.id = 0;
        this.parking_lot_id = 0;
        this.user_id = 0;
        this.created_at = null;
        this.lot_number = 0;
        this.harga = 0;
        this.jenis_tiket = null;
    }

    // Getter and Setter methods...
    public ParkingReservation(int _parking_lot_id, int _user_id, Timestamp _created_at, int _lot_number, int _harga, String _jenis_tiket) {
        this.parking_lot_id = _parking_lot_id;
        this.user_id = _user_id;
        this.created_at = _created_at;
        this.lot_number = _lot_number;
        this.harga = _harga;
        this.jenis_tiket = _jenis_tiket;
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

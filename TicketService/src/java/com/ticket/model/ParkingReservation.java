package com.ticket.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.ArrayList;

/**
 * ParkingLots model class
 */
public class ParkingReservation extends MyModel {

    private int id;
    private int parking_lot_id;
    private int user_id;
    private Date start_date;
    private Date end_date;
    private int lot_number;
    private int harga;
    private String jenis_tiket;

    public ParkingReservation() {
        this.id = 0;
        this.parking_lot_id = 0;
        this.user_id = 0;
        this.start_date = null;
        this.end_date = null;
        this.lot_number = 0;
        this.harga = 0;
        this.jenis_tiket = null;
    }

    // Getter and Setter methods...
    public ParkingReservation(int _parking_lot_id, int _user_id, Date _start_date, Date _end_date, int _lot_number, int _harga, String _jenis_tiket) {
        this.parking_lot_id = _parking_lot_id;
        this.user_id = _user_id;
        this.start_date = _start_date;
        this.end_date = _end_date;
        this.lot_number = _lot_number;
        this.harga = _harga;
        this.jenis_tiket = _jenis_tiket;
    }

    @Override
    public String insertData() {
//        try {
//            if (!MyModel.conn.isClosed()) {
//                PreparedStatement sql = MyModel.conn.prepareStatement(
//                        "INSERT INTO parkingreservations(parking_lot_id, user_id, start_date, end_date, lot_number, harga, jenis_tiket) VALUES (?, ?, ?, ?, ?, ?)"
//                );
//                sql.setInt(1, this.parking_lot_id);
//                sql.setInt(2, this.user_id);
//                sql.setDate(3, this.start_date);
//                sql.setDate(4, this.end_date);
//                sql.setInt(5, this.lot_number);
//                sql.setInt(6, this.harga);
//                sql.setString(7, this.jenis_tiket);
//                sql.executeUpdate();
//                sql.close();
//            }
//        } catch (SQLException e) {
//            System.out.println("Error in insertData: " + e);
//        }
        return null;
    }

    @Override
    public void updateData() {
//        try {
//            if (!MyModel.conn.isClosed()) {
//                PreparedStatement sql = MyModel.conn.prepareStatement(
//                        "UPDATE parkingreservations SET parking_lot_id = ?, user_id = ?, start_date = ?, end_date = ?, lot_number = ?, harga = ?, jenis_tiket = ? WHERE id = ?"
//                );
//                sql.setInt(1, this.parking_lot_id);
//                sql.setInt(2, this.user_id);
//                sql.setDate(3, this.start_date);
//                sql.setDate(4, this.end_date);
//                sql.setInt(5, this.lot_number);
//                sql.setInt(6, this.harga);
//                sql.setString(7, this.jenis_tiket);
//                sql.setInt(8, this.id);
//                sql.executeUpdate();
//                sql.close();
//            }
//        } catch (SQLException e) {
//            System.out.println("Error in updateData: " + e);
//        }
    }

    @Override
    public void deleteData() {
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = MyModel.conn.prepareStatement(
                        "DELETE FROM parkingreservations WHERE id = ?"
                );
                sql.setInt(1, this.id);
                sql.executeUpdate();
                sql.close();
            }
        } catch (SQLException e) {
            System.out.println("Error in deleteData: " + e);
        }
    }

    @Override
    public ArrayList<Object> viewListData() {
        ArrayList<Object> collections = new ArrayList<>();
        try {
            this.statement = (Statement) MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("SELECT * FROM parkingreservations;");
            while (this.result.next()) {
                ParkingReservation pr = new ParkingReservation(
                        result.getInt("parking_lot_id"),
                        result.getInt("user_id"),
                        result.getDate("start_date"),
                        result.getDate("end_date"),
                        result.getInt("lot_number"),
                        result.getInt("harga"),
                        result.getString("jenis_tiket")
                );
                collections.add(pr);
            }
            result.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error in viewListData: " + e);
        }
        return collections;
    }
}

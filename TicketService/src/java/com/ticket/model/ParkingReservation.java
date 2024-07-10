package com.ticket.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

/**
 * ParkingLots model class
 */
public class ParkingReservation extends MyModel {
    private int id;
    private int parking_lot_id;
    private int user_id;
    private String reservation_date;
    private int lot_number;
    private int harga;
    private String jenis_tiket;

    public ParkingReservation() {
        this.id = 0;
        this.parking_lot_id = 0;
        this.user_id = 0;
        this.reservation_date = null;
        this.lot_number = 0;
        this.harga = 0;
        this.jenis_tiket = null;
    }

    // Getter and Setter methods...
    public ParkingReservation(int _parking_lot_id, int _user_id, String _reservation_date, int _lot_number, int _harga, String _jenis_tiket) {
        this.parking_lot_id = _parking_lot_id;
        this.user_id = _user_id;
        this.reservation_date = _reservation_date;
        this.lot_number = _lot_number;
        this.harga = _harga;
        this.jenis_tiket = _jenis_tiket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParking_lot_id() {
        return parking_lot_id;
    }

    public void setParking_lot_id(int parking_lot_id) {
        this.parking_lot_id = parking_lot_id;
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

    public int getLot_number() {
        return lot_number;
    }

    public void setLot_number(int lot_number) {
        this.lot_number = lot_number;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getJenis_tiket() {
        return jenis_tiket;
    }

    public void setJenis_tiket(String jenis_tiket) {
        this.jenis_tiket = jenis_tiket;
    }
    
    @Override
    public String insertData() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = MyModel.conn.prepareStatement(
                        "INSERT INTO parkingreservations(parking_lot_id, user_id, reservation_date, lot_number, harga, jenis_tiket) VALUES (?, ?, ?, ?, ?, ?)"
                );
                sql.setInt(1, this.parking_lot_id);
                sql.setInt(2, this.user_id);
                sql.setString(3, this.reservation_date);
                sql.setInt(4, this.lot_number);
                sql.setInt(5, this.harga);
                sql.setString(6, this.jenis_tiket);
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
//        try {
//            if (!MyModel.conn.isClosed()) {
//                PreparedStatement sql = MyModel.conn.prepareStatement(
//                        "DELETE FROM parkingreservations WHERE id = ?"
//                );
//                sql.setInt(1, this.id);
//                sql.executeUpdate();
//                sql.close();
//            }
//        } catch (SQLException e) {
//            System.out.println("Error in deleteData: " + e);
//        }
    }

    @Override
    public ArrayList<Object> viewListData() {
//        ArrayList<Object> collections = new ArrayList<>();
//        try {
//            this.statement = (Statement) MyModel.conn.createStatement();
//            this.result = this.statement.executeQuery("SELECT * FROM parkingreservations;");
//            while (this.result.next()) {
//                ParkingReservation pr = new ParkingReservation(
//                        result.getInt("parking_lot_id"),
//                        result.getInt("user_id"),
//                        result.getDate("start_date"),
//                        result.getDate("end_date"),
//                        result.getInt("lot_number"),
//                        result.getInt("harga"),
//                        result.getString("jenis_tiket")
//                );
//                collections.add(pr);
//            }
//            result.close();
//            statement.close();
//        } catch (SQLException e) {
//            System.out.println("Error in viewListData: " + e);
//        }
//        return collections;
        return null;
    }
    
    public ArrayList<Integer> checkOccupiedLots(String name, String location, LocalDate date_) {
       ArrayList<Integer> occupiedLots = new ArrayList<>();
       SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        try {
            if(!MyModel.conn.isClosed()){
                PreparedStatement sql = (PreparedStatement)MyModel.conn.prepareStatement(
                        "SELECT * FROM parkingreservations pr JOIN parkinglots pl ON pr.parking_lot_id = pl.id "
                                + " WHERE pl.venue_name = ? AND pl.location = ?;");
                sql.setString(1, name);
                sql.setString(2, location);
                ResultSet reservations = sql.executeQuery();
                while(reservations.next()){
                    int availLot = reservations.getInt("available_lots");
                    int reserveLot = reservations.getInt("lot_number");
                    LocalDate startDate  = reservations.getDate("start_date").toLocalDate();
                    LocalDate endDate = reservations.getDate("end_date").toLocalDate();
                    LocalDate reserveDate = reservations.getDate("reservation_date").toLocalDate();
                    LocalDate currDate = startDate;
                    while (!currDate.isAfter(endDate)) {
                        if (reserveDate.equals(date_)) {
                            for (int i = 1; i <= availLot; i++) {
                                if (currDate.equals(date_) && i == reserveLot) {
                                    occupiedLots.add(i);
                                }
                            }
                        }
                        currDate = currDate.plusDays(1);
                    }
                }
                sql.close();
            }
        } catch (SQLException e) {
            System.out.println("Error in checkOccupiedLots: " + e.getMessage());
        }
        return occupiedLots;
    }
}

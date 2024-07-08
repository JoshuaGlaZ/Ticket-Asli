/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public abstract class MyModel {

    protected static Connection conn;
    protected Statement statement;
    protected ResultSet result;

    public MyModel() {
        this.conn = this._getConnection();
        this.statement = null;
        this.result = null;
    }

    private Connection _getConnection() {
        if (MyModel.conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//                return DriverManager.getConnection("jdbc:mysql://kresnayangasli.my.id:47780/tiket_asli", "dp_uas", "dp*1234567890");
                return DriverManager.getConnection("jdbc:mysql://localhost/ticket-asli?autoReconnect=true&useSSL=false", "root", "foxrama123");
            } catch (Exception e) {
                System.out.println("Error di getConnection: " + e.getMessage());
            }
        }
        return MyModel.conn;
    }

    public abstract String insertData();

    public abstract void updateData();

    public abstract void deleteData();

    public abstract ArrayList<Object> viewListData();

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara.model;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author chris
 */
public abstract class MyModel {

    protected static Connection conn;
    protected Statement statement;
    protected ResultSet result;

    public MyModel() {
        this.conn = this._getconnection();
        this.statement = null;
        this.result = null;
    }

    private Connection _getconnection() {
        if (MyModel.conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                return DriverManager.getConnection("jdbc:mysql://kresnayangasli.my.id/tiket_asli", "dp_uas", "dp*1234567890"); //belum ada databasenya
            } catch (Exception e) {
                System.out.println("Error di getConnection : " + e);
            }
        }
        return MyModel.conn;
    }

    public abstract void insertData();
    public abstract void updateData();
    public abstract void deleteData();
    public abstract ArrayList<Object> viewListData();

}

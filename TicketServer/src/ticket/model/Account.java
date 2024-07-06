/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticket.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Account extends MyModel {
    private int id;
    private String username;
    private String password;
    private String email; 
    private Timestamp created_at;
    
    public Account() {
        this.id = 0;
        this.username = null;
        this.password = null;
        this.email = null;
        this.created_at = null;
    }

    public Account(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }    

    public Account(String username, String password, String email) {
        this.id = 0;
        this.username = username;
        this.password = password;
        this.email = email;
        this.created_at = null;
    }    

    public Account(String username, String password) {
        this.id = 0;
        this.username = username;
        this.password = password;
        this.email = null;
        this.created_at = null;
    }    
            
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
       
    public ArrayList<Object> checkUser() {
        ArrayList<Object> collections = new ArrayList<Object>();
        try {
            if(!MyModel.conn.isClosed()){
                PreparedStatement sql = (PreparedStatement)MyModel.conn.prepareStatement(
                        "select * from users where username = ? and password = md5(?) limit 1");
                sql.setString(1, this.username);
                sql.setString(2, this.password);
                
                this.result= sql.executeQuery();
            }
            while(this.result.next()){
                Account tempAccount = new Account(this.result.getInt("id"),
                    this.result.getString("username"),
                    this.result.getString("password"),
                    this.result.getString("email"));
                collections.add(tempAccount);
            }
        } catch (SQLException e) {
            System.out.println("Error in checkUser account: " + e);
        }
        return collections;
    }

    @Override
    public String insertData() {
        try {
            if (!MyModel.conn.isClosed()) {
                try (PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement(
                        "INSERT INTO users(username, password, email) VALUES (?, md5(?), ?)")) {
                    sql.setString(1, this.username);
                    sql.setString(2, this.password);
                    sql.setString(3, this.email);
                    sql.executeUpdate();
                }
            }
        } catch (SQLException e) {
            return("Error in insertData account: " + e);
        }
        return "SUCCESS";
    }

    public ArrayList<Object> viewListData() {
        ArrayList<Object> collections = new ArrayList<Object>();
        try {
            if(!MyModel.conn.isClosed()){
                PreparedStatement sql = (PreparedStatement)MyModel.conn.prepareStatement(
                        "select * from users");
                this.result= sql.executeQuery();
            }
            while(this.result.next()){
                Account tempAccount = new Account(this.result.getInt("id"),
                    this.result.getString("username"),
                    this.result.getString("password"),
                    this.result.getString("email"));
                collections.add(tempAccount);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return collections;
    }    

    @Override
    public void updateData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

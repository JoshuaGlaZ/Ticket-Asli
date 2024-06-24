/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.model;

import java.sql.PreparedStatement;
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

    public Account(int id, String username, String password, String email, Timestamp created_at) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.created_at = created_at;
    }    

    public Account(String username, String password, String email) {
        this.id = 0;
        this.username = username;
        this.password = password;
        this.email = email;
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
   
    public boolean checkEmail() {
        for (Object object : viewListData()) {
            Account a = (Account)object;
            if (a.getUsername().equals(this.getUsername())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void insertData() {
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement(
                        "INSERT INTO account(username, password, email) "
                                + "VALUES (?, ?, ?)");
                sql.setString(1, this.username);
                sql.setString(2, this.password);
                sql.setString(3, this.email);
                sql.executeUpdate();
                sql.close();
            }
        } catch (Exception e) {
            System.out.println("Error di insertData account: " + e);
        }
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
        ArrayList<Object> collections = new ArrayList<>();
        try {
            this.statement = (Statement) MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("SELECT * FROM account;");
            while (this.result.next()) {
                Account a = new Account(
                        this.result.getInt("id"),
                        this.result.getString("username"),
                        this.result.getString("password"),
                        this.result.getString("email"),
                        this.result.getTimestamp("created_at")
                );
                collections.add(a);
            }
        } catch (Exception e) {
            System.out.println("Error di viewListData: " + e);
        }
            
        return collections;
    }    
}

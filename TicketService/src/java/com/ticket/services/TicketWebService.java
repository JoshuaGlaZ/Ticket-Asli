/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.ticket.services;

import com.ticket.model.Account;
import java.util.ArrayList;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author LENOVO
 */
@WebService(serviceName = "TicketWebService")
public class TicketWebService {
    
    Account a;
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "checkUser")
    public Boolean checkUser(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        a = new Account(username, password);
        return a.checkUser();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "viewListUser")
    public ArrayList<Object> viewListUser() {
        a = new Account();
        return a.viewListData();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertUser")
    @Oneway
    public void insertUser(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "email") String email) {
        a = new Account(username, password, email);
        a.insertData();
    }
}

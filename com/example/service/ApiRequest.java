package com.example.service;

/**
 * Created by sgaikwad on 10/15/2018.
 */
public class ApiRequest {
    String itemName, userName, bookingId;

    public String getItemName(){
        return itemName;
    }

    public String setItemName(String itemName){
        this.itemName = itemName;
        return itemName;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getBookingId(){
        return bookingId;
    }

    public void setBookingId(String bookingId){
        this.bookingId = bookingId;
    }
}


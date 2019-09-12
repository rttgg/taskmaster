package com.gebrehiwot.taskmaster.Models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@DynamoDBDocument
public class History {
    String date;
    String action;

    public History(){}

    public History(String date, String action){
        this.date = date;
        this.action = action;
    }


    public String getDate() {
        return date;
    }

    public String getAction() {
        return action;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAction(String action) {
        this.action = action;
    }
}

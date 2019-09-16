package com.gebrehiwot.taskmaster.Models;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.ArrayList;


@DynamoDBTable(tableName = "taskmaster")
public class Task {
    private String id;
    private String title;
    private String description;
    private String status;
    private String assignee;
    private ArrayList<History> history;
    private String pic;

    public Task(){}

    public Task( String title, String description, String assignee){
//        this.id = id;
        this.title = title;
        this.description = description;
        this.status = "available";
        this.assignee = assignee;
        this.history = new ArrayList<>();
        this.pic = "";
    }




    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @DynamoDBAttribute
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @DynamoDBAttribute
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @DynamoDBAttribute
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @DynamoDBAttribute
    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }


    @DynamoDBAttribute
    public ArrayList<History> getHistory() {
        return this.history;
    }

    public void setHistory(ArrayList<History> history) {
        this.history = history;
    }

    public void addHistory(History h){
        history.add(h);
    }

    @DynamoDBAttribute
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}

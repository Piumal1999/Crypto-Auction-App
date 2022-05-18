package com.cryptobid.cryptobid.models;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Bid {

    @SerializedName("id")
    private int id;

    @SerializedName("amount")
    private float amount;

    @SerializedName("time")
    private Date time;

    @SerializedName("bidBy")
    private User bidBy;

    public Bid() {
    }

    public Bid(int id, float amount, Date time, User bidBy) {
        this.id = id;
        this.amount = amount;
        this.time = time;
        this.bidBy = bidBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public User getBidBy() {
        return bidBy;
    }

    public void setBidBy(User bidBy) {
        this.bidBy = bidBy;
    }
}

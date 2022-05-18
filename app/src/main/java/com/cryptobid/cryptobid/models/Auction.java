package com.cryptobid.cryptobid.models;

import com.cryptobid.cryptobid.utils.AuctionStatus;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Auction {

    @SerializedName("id")
    private int id;

    @SerializedName("startTime")
    private Date startTime;

    @SerializedName("endTime")
    private Date endTime;

    @SerializedName("initialValue")
    private float initialValue;

    @SerializedName("auctionStatus")
    private AuctionStatus auctionStatus;

    @SerializedName("cryptocurrency")
    private Cryptocurrency cryptocurrency;

    public Auction() {
    }

    public Auction(int id, Date startTime, Date endTime, int initialValue, AuctionStatus auctionStatus, Cryptocurrency cryptocurrency) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.initialValue = initialValue;
        this.auctionStatus = auctionStatus;
        this.cryptocurrency = cryptocurrency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public float getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(float initialValue) {
        this.initialValue = initialValue;
    }

    public AuctionStatus getAuctionStatus() {
        return auctionStatus;
    }

    public void setAuctionStatus(AuctionStatus auctionStatus) {
        this.auctionStatus = auctionStatus;
    }

    public Cryptocurrency getCryptocurrency() {
        return cryptocurrency;
    }

    public void setCryptocurrency(Cryptocurrency cryptocurrency) {
        this.cryptocurrency = cryptocurrency;
    }
}

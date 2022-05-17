package com.cryptobid.cryptobid.models;

import com.google.gson.annotations.SerializedName;

public class Cryptocurrency {

    @SerializedName("id")
    private int id;

    @SerializedName("symbol")
    private String symbol;

    @SerializedName("name")
    private String name;

    @SerializedName("cryptoRank")
    private int cryptoRank;

    public Cryptocurrency(int id, String symbol, String name, int cryptoRank) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.cryptoRank = cryptoRank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCryptoRank() {
        return cryptoRank;
    }

    public void setCryptoRank(int cryptoRank) {
        this.cryptoRank = cryptoRank;
    }
}

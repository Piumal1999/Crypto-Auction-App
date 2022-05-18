package com.cryptobid.cryptobid.network;

import com.cryptobid.cryptobid.models.Auction;
import com.cryptobid.cryptobid.models.Bid;
import com.cryptobid.cryptobid.models.Cryptocurrency;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AuctionService {

    @GET("/api/auctions")
    Call<List<Auction>> listAllAuctions();

    @GET("/api/auctions/{id}")
    Call<Auction> getAuctionById(int id);

    @GET("/api/auctions/{id}/bids")
    Call<List<Bid>> getAuctionBids(int id);

}

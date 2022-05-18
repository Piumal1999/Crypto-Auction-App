package com.cryptobid.cryptobid.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.cryptobid.cryptobid.R;
import com.cryptobid.cryptobid.adapters.AuctionAdapter;
import com.cryptobid.cryptobid.adapters.CryptocurrencyAdapter;
import com.cryptobid.cryptobid.models.Auction;
import com.cryptobid.cryptobid.models.Cryptocurrency;
import com.cryptobid.cryptobid.network.AuctionService;
import com.cryptobid.cryptobid.network.CryptocurrencyService;
import com.cryptobid.cryptobid.network.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserAuctionActivity extends AppCompatActivity {

    private RecyclerView rvAuctions;
    private List<Auction> auctionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_auctions);
        init();
        loadAuctions();
    }

    private void loadAuctions() {
//        cryptocurrencies.add(new Cryptocurrency(1, "BTC", "Bitcoin", 1));
//        cryptocurrencies.add(new Cryptocurrency(2, "ETH", "Ethereum", 2));
//        cryptocurrencies.add(new Cryptocurrency(3, "XRP", "Ripple", 3));
        AuctionService auctionService = RetrofitClient.getRetrofitClient().create(AuctionService.class);
        Call<List<Auction>> call = auctionService.listAllAuctions();
        call.enqueue(new Callback<List<Auction>>() {
            @Override
            public void onResponse(@NonNull Call<List<Auction>> call, @NonNull Response<List<Auction>> response) {
                Log.d("log", "onResponse: " + response.code());
                assert response.body() != null : "Response Body Empty";
                auctionsList.clear();
                auctionsList.addAll(response.body());
                setData();
            }

            @Override
            public void onFailure(@NonNull Call<List<Auction>> call, @NonNull Throwable t) {
                Log.d("log", "onFailure: " + t.getLocalizedMessage());
            }
        });
    }

    private void setData() {
        rvAuctions.setLayoutManager(new LinearLayoutManager(this));
        rvAuctions.setAdapter(new AuctionAdapter(this, auctionsList));
    }

    private void init() {
        auctionsList = new ArrayList<>();
        rvAuctions = findViewById(R.id.auctionsList);
    }
}
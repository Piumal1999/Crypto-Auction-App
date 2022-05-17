package com.cryptobid.cryptobid.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.cryptobid.cryptobid.R;
import com.cryptobid.cryptobid.adapters.CryptocurrencyAdapter;
import com.cryptobid.cryptobid.models.Cryptocurrency;
import com.cryptobid.cryptobid.network.CryptocurrencyService;
import com.cryptobid.cryptobid.network.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCryptocurrencies;
    private List<Cryptocurrency> cryptocurrencies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        loadCryptocurrencies();
    }

    private void loadCryptocurrencies() {
//        cryptocurrencies.add(new Cryptocurrency(1, "BTC", "Bitcoin", 1));
//        cryptocurrencies.add(new Cryptocurrency(2, "ETH", "Ethereum", 2));
//        cryptocurrencies.add(new Cryptocurrency(3, "XRP", "Ripple", 3));
        CryptocurrencyService cryptocurrencyService = RetrofitClient.getRetrofitClient().create(CryptocurrencyService.class);
        Call<List<Cryptocurrency>> call = cryptocurrencyService.listCryptocurrencies();
        call.enqueue(new Callback<List<Cryptocurrency>>() {
            @Override
            public void onResponse(@NonNull Call<List<Cryptocurrency>> call, @NonNull Response<List<Cryptocurrency>> response) {
                Log.d("log", "onResponse: " + response.code());
                assert response.body() != null : "Response Body Empty";
                cryptocurrencies.clear();
                cryptocurrencies.addAll(response.body());
                setData();
            }

            @Override
            public void onFailure(@NonNull Call<List<Cryptocurrency>> call, @NonNull Throwable t) {
                Log.d("log", "onFailure: " + t.getLocalizedMessage());
            }
        });
    }

    private void setData() {
        rvCryptocurrencies.setLayoutManager(new LinearLayoutManager(this));
        rvCryptocurrencies.setAdapter(new CryptocurrencyAdapter(this, cryptocurrencies));
    }

    private void init() {
        cryptocurrencies = new ArrayList<>();
        rvCryptocurrencies = findViewById(R.id.cryptoList);
    }
}
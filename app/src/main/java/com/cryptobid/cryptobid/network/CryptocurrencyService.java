package com.cryptobid.cryptobid.network;

import com.cryptobid.cryptobid.models.Cryptocurrency;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptocurrencyService {

    @GET("/cryptocurrency")
    Call<List<Cryptocurrency>> listCryptocurrencies();


}

package com.cryptobid.cryptobid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cryptobid.cryptobid.R;
import com.cryptobid.cryptobid.models.Cryptocurrency;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CryptocurrencyAdapter extends RecyclerView.Adapter<CryptocurrencyViewHolder> {
    private final Context context;
    private final List<Cryptocurrency> cryptocurrencies;

    public CryptocurrencyAdapter(Context context, List<Cryptocurrency> cryptocurrencies) {
        this.context = context;
        this.cryptocurrencies = cryptocurrencies;
    }

    @NotNull
    @Override
    public CryptocurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.crypto_item, parent, false);
        return new CryptocurrencyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CryptocurrencyViewHolder holder, int position) {
        Cryptocurrency cryptocurrency = cryptocurrencies.get(position);
        holder.setCryptoName(cryptocurrency.getName() + " (" + cryptocurrency.getSymbol() + ")");
    }

    @Override
    public int getItemCount() {
        return cryptocurrencies == null ? 0 : cryptocurrencies.size();
    }
}
package com.cryptobid.cryptobid.adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cryptobid.cryptobid.R;

public class CryptocurrencyViewHolder extends RecyclerView.ViewHolder {
    private final TextView txtCryptoName;

    public CryptocurrencyViewHolder(@NonNull View itemView) {
        super(itemView);
        txtCryptoName = itemView.findViewById(R.id.txt_crypto_name);
    }

    public void setCryptoName(String cryptoName) {
        this.txtCryptoName.setText(cryptoName);
    }
}


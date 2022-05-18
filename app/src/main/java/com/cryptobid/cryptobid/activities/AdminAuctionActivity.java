package com.cryptobid.cryptobid.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.cryptobid.cryptobid.R;

public class AdminAuctionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_auction);

        Button startAuctionBtn = findViewById(R.id.btn_start_auction);
        startAuctionBtn.setOnClickListener(v -> startActivity(
                new Intent(AdminAuctionActivity.this, AdminCryptoActivity.class)
        ));
    }
}
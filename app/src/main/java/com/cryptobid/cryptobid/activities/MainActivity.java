package com.cryptobid.cryptobid.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.cryptobid.cryptobid.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView adminCard = findViewById(R.id.admin_card);
        adminCard.setOnClickListener(v -> startActivity(
                new Intent(MainActivity.this, AdminCryptoActivity.class)
        ));

        CardView userCard = findViewById(R.id.user_card);
        userCard.setOnClickListener(v -> startActivity(
                new Intent(MainActivity.this, UserAuctionActivity.class)
        ));
    }
}
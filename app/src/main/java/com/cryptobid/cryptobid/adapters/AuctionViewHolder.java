package com.cryptobid.cryptobid.adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cryptobid.cryptobid.R;

public class AuctionViewHolder extends RecyclerView.ViewHolder {
    private final TextView txtAuctionName;
//    private final TextView txtAuctionId;
//    private final TextView txtAuctionInitialValue;

    public AuctionViewHolder(@NonNull View itemView) {
        super(itemView);
        txtAuctionName = itemView.findViewById(R.id.txt_auction_name);
//        txtAuctionId = itemView.findViewById(R.id.txt_auction_id);
//        txtAuctionInitialValue = itemView.findViewById(R.id.txt_auction_value);

    }

    public void setAuctionName(String auctionName) {
        txtAuctionName.setText(auctionName);
    }

//    public void setAuctionId(String auctionId) {
//        txtAuctionId.setText(auctionId);
//    }
//
//    public void setAuctionInitialValue(String auctionInitialValue) {
//        txtAuctionInitialValue.setText(auctionInitialValue);
//    }

}


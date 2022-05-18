package com.cryptobid.cryptobid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cryptobid.cryptobid.R;
import com.cryptobid.cryptobid.models.Auction;
import com.cryptobid.cryptobid.models.Cryptocurrency;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AuctionAdapter extends RecyclerView.Adapter<AuctionViewHolder> {
    private final Context context;
    private final List<Auction> auctionsList;

    public AuctionAdapter(Context context, List<Auction> auctionList) {
        this.context = context;
        this.auctionsList = auctionList;
    }

    @NotNull
    @Override
    public AuctionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_auction_item, parent, false);
        return new AuctionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AuctionViewHolder holder, int position) {
        Auction auction = auctionsList.get(position);
        holder.setAuctionName(auction.getCryptocurrency().getName() + " | #" + auction.getId() + " | $" + auction.getInitialValue());
    }

    @Override
    public int getItemCount() {
        return auctionsList == null ? 0 : auctionsList.size();
    }
}
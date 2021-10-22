package com.example.newsforu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    ArrayList<ApiClass> apiClassArrayList;

    public Adapter(Context context, ArrayList<ApiClass> apiClassArrayList) {
        this.context = context;
        this.apiClassArrayList = apiClassArrayList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, final int position) {
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,webView.class);
                intent.putExtra("url", apiClassArrayList.get(position).getUrl());
                context.startActivity(intent);
            }
        });
        holder.tvTime.setText("Published At: " + apiClassArrayList.get(position).getPublishedAt());
        holder.tvAuthor.setText(apiClassArrayList.get(position).getAuthor());
        holder.tvHeading.setText(apiClassArrayList.get(position).getTitle());
        holder.tvContent.setText(apiClassArrayList.get(position).getDescription());
        Glide.with(context).load(apiClassArrayList.get(position).getUrlToImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {

        return apiClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvHeading, tvContent, tvAuthor, tvTime;
        CardView cardView;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvHeading = itemView.findViewById(R.id.mainHeading);
            tvContent = itemView.findViewById(R.id.contentView);
            tvAuthor = itemView.findViewById(R.id.authorView);
            tvTime = itemView.findViewById(R.id.timeView);
            cardView = itemView.findViewById(R.id.cardView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}

package com.example.news_app;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    TextView text_title,text_source;
    ImageView img_Headlines;
    CardView cardView;
    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        text_title=itemView.findViewById(R.id.title);
        text_source=itemView.findViewById(R.id.source);
        img_Headlines=itemView.findViewById(R.id.headlineImage);
        cardView=itemView.findViewById(R.id.card);
    }
}

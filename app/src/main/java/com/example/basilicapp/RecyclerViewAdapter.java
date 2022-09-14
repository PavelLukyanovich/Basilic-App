package com.example.basilicapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder>{
    private ArrayList itemArrayList;
    Context context;

    public RecyclerViewAdapter(ArrayList<RecyclerViewItem> itemArrayList, Context context) {
        this.itemArrayList = itemArrayList;
        this.context = context;

    }

    class RecyclerViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView imageView;
        public TextView nameTextView;
        public TextView descriptionTextView;
        public TextView shortDescriptionTextView;

        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            imageView = itemView.findViewById(R.id.itemImageView);
            nameTextView = itemView.findViewById(R.id.nameItemTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextInfo);
            shortDescriptionTextView = itemView.findViewById(R.id.shortDescriptionItemTextView);
        }

        @Override
        public void onClick(View v) {
            int position = getAbsoluteAdapterPosition();

            RecyclerViewItem recyclerViewItem = (RecyclerViewItem) itemArrayList.get(position);

            Intent intent = new Intent(context, ActivityInfo.class);
            intent.putExtra("name", recyclerViewItem.getNameTextView());
            intent.putExtra("description", recyclerViewItem.getDescriptionTextView());
            intent.putExtra("image", recyclerViewItem.getImageViewResource());

            context.startActivity(intent);
            }
        }

        @NonNull
        @Override
        public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,
                    parent, false);
            RecyclerViewViewHolder recyclerViewViewHolder = new RecyclerViewViewHolder(view);
            return recyclerViewViewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
            RecyclerViewItem recyclerViewItem = (RecyclerViewItem) itemArrayList.get(position);

            holder.imageView.setImageResource(recyclerViewItem.getImageViewResource());
            holder.nameTextView.setText(recyclerViewItem.getNameTextView());
            holder.shortDescriptionTextView.setText(recyclerViewItem.getShortDescriptionTextView());

        }
        @Override
        public int getItemCount() {
            return itemArrayList.size();
        }

}

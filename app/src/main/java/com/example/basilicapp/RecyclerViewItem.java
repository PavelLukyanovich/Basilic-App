package com.example.basilicapp;

import android.widget.ImageView;
import android.widget.TextView;


public class RecyclerViewItem {
    private int imageViewResource;
    private String nameTextView;
    private String descriptionTextView;
    private String shortDescriptionTextView;



    public RecyclerViewItem(int imageView, String textView, String textView1, String textView2) {
        this.imageViewResource = imageView;
        this.nameTextView = textView;
        this.descriptionTextView = textView1;
        this.shortDescriptionTextView = textView2;
    }
    public String getShortDescriptionTextView() {
        return shortDescriptionTextView;
    }

    public int getImageViewResource() {
        return imageViewResource;
    }

    public String getNameTextView() {
        return nameTextView;
    }

    public String getDescriptionTextView() {
        return descriptionTextView;
    }
}

package com.example.basilicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewChooseIndicator;
    ArrayList<RecyclerViewItem> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewChooseIndicator = findViewById(R.id.chooseImageView);
            imageViewChooseIndicator.setScaleY(0.6f);
            imageViewChooseIndicator.setScaleX(0.6f);
            imageViewChooseIndicator.animate().scaleY(1.0f).scaleX(1.0f).setDuration(2000);
        }

    public void runMenActivity(View view) {

        Intent intent =new Intent(this, ActivityMen.class);

        startActivity(intent);
    }

    public void runWomenActivity(View view) {
        Intent intent =new Intent(this, ActivityWomen.class);
        startActivity(intent);
    }

    public void runChildrenActivity(View view) {
        Intent intent =new Intent(this, ActivityChildren.class);
        startActivity(intent);
    }
}
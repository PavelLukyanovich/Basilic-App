package com.example.basilicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewChooseIndicator;


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
        Intent intent =new Intent(this, ActivityMen);
    }
}
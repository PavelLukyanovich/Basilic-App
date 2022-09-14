package com.example.basilicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityInfo extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        imageView = findViewById(R.id.imageInfo);
        textView = findViewById(R.id.nameTextInfo);
        textView1 = findViewById(R.id.descriptionTextInfo);
        Intent intent = getIntent();

        if(intent != null) {
            imageView.setImageResource(intent.getIntExtra("image", 234));
            textView.setText(intent.getStringExtra("name"));
            textView1.setText(intent.getStringExtra("description"));
        }
    }
}
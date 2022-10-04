package com.example.basilicapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityInfo extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextView textView1;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == androidx.appcompat.R.id.activity_chooser_view_content) {
            NavUtils.navigateUpFromSameTask(this);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ActionBar actionBar = this.getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


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
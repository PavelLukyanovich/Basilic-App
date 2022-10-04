package com.example.basilicapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.item_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_settings) {
            Intent openSettings = new Intent(this, Settings.class);
            startActivity(openSettings);
            return true;
        }
        if (id == R.id.action_about) {
            Intent openAbout = new Intent(this, About.class);
            startActivity(openAbout);
            return true;
        }
        if (id == R.id.action_donate) {
            Intent openDonate = new Intent(this, Donate.class);
            startActivity(openDonate);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
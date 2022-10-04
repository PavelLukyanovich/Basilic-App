package com.example.basilicapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ActivityWomen extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<RecyclerViewItem> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men);

        ActionBar actionBar = this.getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        recyclerView = findViewById(R.id.menRecyclerView);


        arrayList = new ArrayList<RecyclerViewItem>();
        arrayList.add(new RecyclerViewItem(R.drawable.bouquet7, Utils.NAME_7, Utils.DESCRIPTION_7, "Для коллеги"));
        arrayList.add(new RecyclerViewItem(R.drawable.bouquet8, Utils.NAME_8, Utils.DESCRIPTION_8, "Для подруги"));
        arrayList.add(new RecyclerViewItem(R.drawable.bouquet9, Utils.NAME_9, Utils.DESCRIPTION_9, "Для мамы"));


        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(arrayList, this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
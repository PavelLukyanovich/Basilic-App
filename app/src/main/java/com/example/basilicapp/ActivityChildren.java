package com.example.basilicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ActivityChildren extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<RecyclerViewItem> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men);

        recyclerView = findViewById(R.id.menRecyclerView);


        arrayList = new ArrayList<RecyclerViewItem>();
        arrayList.add(new RecyclerViewItem(R.drawable.bouquet10, Utils.NAME_10, Utils.DESCRIPTION_10, "Для девочки"));



        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(arrayList, this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
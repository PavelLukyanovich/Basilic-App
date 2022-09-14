package com.example.basilicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ActivityMen extends AppCompatActivity {
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



        arrayList = new ArrayList<RecyclerViewItem>();
        arrayList.add(new RecyclerViewItem(R.drawable.bouquet1, Utils.NAME_1, Utils.DESCRIPTION_1, "Для коллеги"));
        arrayList.add(new RecyclerViewItem(R.drawable.bouquet2, Utils.NAME_2, Utils.DESCRIPTION_2, "Для друга"));
        arrayList.add(new RecyclerViewItem(R.drawable.bouquet3, Utils.NAME_3, Utils.DESCRIPTION_3, "Подойдет для вечера пятницы"));
        arrayList.add(new RecyclerViewItem(R.drawable.bouquet4, Utils.NAME_4, Utils.DESCRIPTION_4, "Для любимого мужа"));
        arrayList.add(new RecyclerViewItem(R.drawable.bouquet5, Utils.NAME_5, Utils.DESCRIPTION_5, "Если хочется есть"));
        arrayList.add(new RecyclerViewItem(R.drawable.bouquet6, Utils.NAME_6, Utils.DESCRIPTION_6, "Для папы"));


        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(arrayList, this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);


    }
}
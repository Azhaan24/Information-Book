package com.project.informationbook.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.informationbook.adapters.AdapterClass;
import com.project.informationbook.ModelClass;
import com.project.informationbook.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ModelClass> arrayList;
    private AdapterClass adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        //fata.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        //recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        ModelClass modelClass1 = new ModelClass("The Countries","flagslogo");
        ModelClass modelClass2 = new ModelClass("The Museums","museumlogo");
        ModelClass modelClass3 = new ModelClass("The World Leaders","worldleaderslogo");
        ModelClass modelClass4 = new ModelClass("The Seven Wonders","wonderslogo");

        arrayList = new ArrayList<>();

        arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        arrayList.add(modelClass4);

        adapter=new AdapterClass(arrayList,this);
        recyclerView.setAdapter(adapter);

    }
}
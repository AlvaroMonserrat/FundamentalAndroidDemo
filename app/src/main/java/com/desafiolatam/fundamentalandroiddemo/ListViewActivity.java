package com.desafiolatam.fundamentalandroiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listItems = findViewById(R.id.listView);
        ArrayList<String> results = new ArrayList<>();
        results.add("Text1");
        results.add("Text2");
        results.add("Text3");
        results.add("Text4");
        results.add("Text5");
        results.add("Text6");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, results);
        listItems.setAdapter(adapter);
    }
}
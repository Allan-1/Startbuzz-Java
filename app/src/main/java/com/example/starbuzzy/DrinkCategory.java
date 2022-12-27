package com.example.starbuzzy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);
        ArrayAdapter<DrinkModel> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, DrinkModel.drink);
        ListView listView = (ListView) findViewById(R.id.drink_category);
        listView.setAdapter(arrayAdapter);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(DrinkCategory.this, DrinkItem.class);
                intent.putExtra(DrinkItem.Drink_Extra, (int) id);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}
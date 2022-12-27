package com.example.starbuzzy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkItem extends AppCompatActivity {

    public static String Drink_Extra = "Drink_Item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_item);
        int drinkId = (Integer) getIntent().getExtras().get(Drink_Extra);
        DrinkModel drink = DrinkModel.drink[drinkId];

        TextView title = (TextView) findViewById(R.id.title);
        title.setText(drink.getTitle());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageResource(drink.getImageResourceId());
        image.setContentDescription(drink.getTitle());
    }
}
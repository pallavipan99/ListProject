package com.example.listproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
     List<Apples>apples;
    TextView date;
    TextView price;

    Apples ambrosia = new Apples(R.drawable.ambrosia, "Ambrosia", "1987", 4.97);
    Apples fuji = new Apples(R.drawable.fuji, "Fuji", "1930",3.47);
    Apples goldenDel = new Apples(R.drawable.goldendelicious, "Golden Delicious", "1912", 3.94);
    Apples grannySmith = new Apples(R.drawable.grannysmith, "Granny Smith", "1868", 4.47);
    Apples redDel = new Apples(R.drawable.reddelicious, "Red Delicious", "1872", 4.97);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        date = findViewById(R.id.textView2);
        price = findViewById(R.id.textView3);
        apples = new ArrayList<>();

        apples.add(ambrosia);
        apples.add(fuji);
        apples.add(goldenDel);
        apples.add(grannySmith);
        apples.add(redDel);


   CustomAdapter adapter = new CustomAdapter(this, R.layout.custom_adapter, apples);
        listView.setAdapter((ListAdapter) adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                date.setText(apples.get(position).getDate());
               // price.setText(apples.get(position).getPrice().toString());


            }
        });

    }
}
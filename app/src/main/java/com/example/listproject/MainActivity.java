package com.example.listproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
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
    TextView landDate;
    TextView landPrice;
    TextView context;
    String setDate;
    double setPrice;
    Button delete;
    final static String DATE_KEY = "h";

    Apples ambrosia = new Apples(R.drawable.ambrosia, "Ambrosia", "1987", 4.97 , "The apple is mostly red and has hints of yellow on it's surface. It is not the most tastiest types of apples, but it is still tasty. This apple tastes a little sweet." );
    Apples fuji = new Apples(R.drawable.fuji, "Fuji", "1930",3.47 , "The apple is both red and yellow. It looks like there are stripes of the colors on the skin of the apple. The apple when bitten is not sweet at all and breaks into pieces immediately, once in your mouth. This apple does not taste really good."  );
    Apples goldenDel = new Apples(R.drawable.goldendelicious, "Golden Delicious", "1912", 3.94 , "The apple is golden with tiny dark specks on its skin. The taste of it is sweet. It is the second tastiest apple in this list. It is sweeter than the red apple but is less sweet than the green apple. It tastes better than any other apples that are the color red." );
    Apples grannySmith = new Apples(R.drawable.grannysmith, "Granny Smith", "1868", 4.47 , "The apple is green. It tastes sweet. It is the tastiest apple in the list and it is sweeter then the rest of the apples." );
    Apples redDel = new Apples(R.drawable.reddelicious, "Red Delicious", "1872", 4.97 , "The apple is red and the skin is shiny. The apple tastes sweet, but has a mild flavor. It is kind of hard when biting into the apple." );
    Apples honeyCrisp = new Apples (R.drawable.honeycrisp, "Honeycrisp", "1974", 4.50,"The apple tastes good. When biting into the apple there is a satisfying crunch that is there. The apple is red and tastes a little sweet");
    Apples shizuka = new Apples (R.drawable.szchnick, "shizuka", "1949", 2.25, "The apple tastes very sweet and is the color green. Compared to the Honeycrisp apple it has a lighter skin that is easier to bit into.");
   @Override
 protected void onSaveInstanceState(@NonNull Bundle outState) {
      super.onSaveInstanceState(outState);
       outState.putString(DATE_KEY,setDate);
    //   outState.putInt(DATE_KEY,landPrice);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
       setDate = savedInstanceState.getString(DATE_KEY);

      //.setText("Counter "+counter);
    }


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
                setDate = (apples.get(position).getDate());
               // setPrice = (apples.get(position).getPrice());
                date.setText(setDate);
               // price.setText(setPrice);

               // landDate.setText(apples.get(position).getDate());
               // landDate.setText(apples.get(position).getDate());


              //  if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
                //    landDate.setText(setDate);
               //     landPrice.setText(setPrice);
                //  context.setText(apples.get(position).getContext());
                 // landDate.setText(apples.get(position).getDate());
               //     landPrice.setText(String.valueOf(apples.get(position).getPrice()));

             //   }
               //  if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
              //     date.setText((CharSequence) landDate);
               ///    price.setText((CharSequence) landPrice);
                  //   context.setText(apples.get(position).getContext());
                  ///   landDate.setText(apples.get(position).getDate());
               // }


            }
        });

    }
}
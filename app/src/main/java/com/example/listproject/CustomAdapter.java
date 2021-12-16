package com.example.listproject;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Apples>
{
    Context mainActivityContext;
    List<Apples> apples;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<Apples> objects){
        super(context, resource, objects);
        mainActivityContext = context;
        apples = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Button button;
        TextView textView;
        ImageView imageView;



        LayoutInflater layoutInflator = (LayoutInflater) mainActivityContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflator.inflate(R.layout.custom_adapter, null);
        button =  v.findViewById(R.id.button);
        textView = v.findViewById(R.id.textView);
        imageView = v.findViewById(R.id.imageView);
      ListView listView = v.findViewById(R.id.listView);



        textView.setText(apples.get(position).getName());
        imageView.setImageResource(apples.get(position).getImage());
        button.setText("Delete");

        return v;


    }

}


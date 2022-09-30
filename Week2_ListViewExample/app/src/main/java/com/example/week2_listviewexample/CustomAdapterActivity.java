package com.example.week2_listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    final List<Animal> animals= new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);
        animals.add(new Animal("ant", R.mipmap.ant));
        animals.add(new Animal("bear", R.mipmap.bear));
        animals.add(new Animal("bird", R.mipmap.bird));
        animals.add(new Animal("cat", R.mipmap.cat));
        animals.add(new Animal("dog", R.mipmap.dog));

        final ListView listView= (ListView) findViewById(R.id.listView);
        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        listView.setAdapter(adapter);
    }
}
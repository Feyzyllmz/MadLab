package com.example.week_rep2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Movie movie = (Movie)getIntent().getSerializableExtra("movie");
        FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
        DetailsFragment df = DetailsFragment.newInstance(movie);
        fts.add(R.id.container,df);
        fts.commit();
    }
}
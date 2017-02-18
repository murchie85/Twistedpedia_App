package com.example.android.twistedpedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TwistedActivity extends AppCompatActivity {

    public static final String LOG_TAG = TwistedActivity.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // creates in a list of TwistedObjects
        ArrayList<Twisted> jokes = new ArrayList<>();
        jokes.add(new Twisted("21.01.2017","DanTheman","20","To all you beautiful girls out there Happy Valentines day... To all you fat birds chins up, its Pancake day next week...\n"));


        // Find a reference to the {@link ListView} in the layout
        ListView twistedListView = (ListView) findViewById(R.id.list);

        // Create a new {adaptor that takes a list of earthquakes as input
        TwistedAdaptor adapter = new TwistedAdaptor(this, jokes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        twistedListView.setAdapter(adapter);

    }





}

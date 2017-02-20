package com.example.android.twistedpedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View.OnClickListener;




import java.util.ArrayList;

public class TwistedActivity extends AppCompatActivity {

    public static final String LOG_TAG = TwistedActivity.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_main);


        // creates in a list of TwistedObjects
        // this will eventually just be the best jokes of this month.
        ArrayList<Twisted> jokes = new ArrayList<>();
        jokes.add(new Twisted("21.01.2017","Murchie85","120","To all you beautiful girls out there Happy Valentines day... To all you fat birds chins up, its Pancake day next week...\n"));
        jokes.add(new Twisted("24.01.2017","DantheMan","130","Apparently, 1 in 10 people live next door to a pedophile. \n" +
                "Not me though, I live next door to a really sexy 10 year-old girl.\n"));
        jokes.add(new Twisted("24.01.2017","Lyds","110","Apparently, 1 in 10 people live next door to a pedophile. \n" +
                "Not me though, I live next door to a really sexy 10 year-old girl.\n"));
        jokes.add(new Twisted("24.01.2017","Allan","150","Apparently, 1 in 10 people live next door to a pedophile. \n" +
                "Not me though, I live next door to a really sexy 10 year-old girl.\n"));
        jokes.add(new Twisted("29.01.2017","Andy","150","Apparently, 1 in 10 people live next door to a pedophile. \n" +
                "Not me though, I live next door to a really sexy 10 year-old girl.\n"));
        jokes.add(new Twisted("01.02.2017","John","150","Apparently, 1 in 10 people live next door to a pedophile. \n" +
                "Not me though, I live next door to a really sexy 10 year-old girl.\n"));


        // Find a reference to the {@link ListView} in the layout
        ListView twistedListView = (ListView) findViewById(R.id.list);

        // Create a new {adaptor that takes a list of earthquakes as input
        TwistedAdaptor adapter = new TwistedAdaptor(this, jokes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        twistedListView.setAdapter(adapter);

        //-----------------------ON CLICK LISTENER FAMILY ----------------------------------//

        // Find the View that shows the family category
        TextView family = (TextView) findViewById(R.id.allTime);

        // Set a click listener on that View
        family.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent alltimeIntent = new Intent(TwistedActivity.this, TwistedAllTime.class);

                // Start the new activity
                startActivity(alltimeIntent);
            }
        });





    }





}

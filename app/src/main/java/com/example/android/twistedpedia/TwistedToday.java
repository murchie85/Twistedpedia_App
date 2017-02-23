package com.example.android.twistedpedia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by adammcmurchie on 19/02/2017.
 */

public class TwistedToday extends AppCompatActivity{
    public static final String LOG_TAG = TwistedActivity.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new AllTimeFragment())
                .commit();

    }

}

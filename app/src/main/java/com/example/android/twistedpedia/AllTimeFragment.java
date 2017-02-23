package com.example.android.twistedpedia;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AllTimeFragment extends Fragment {


    public AllTimeFragment() {
        // Required empty public constructor
    }

    public static final String LOG_TAG = TwistedActivity.class.getName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // creates in a list of TwistedObjects
        // this will eventually just be the best jokes of all time
        ArrayList<Twisted> jokes = new ArrayList<>();
        jokes.add(new Twisted("21.01.2017","Murchie85","0","To all you beautiful girls out there Happy Valentines day... To all you fat birds chins up, its Pancake day next week...\n"));
        jokes.add(new Twisted("24.01.2017","DantheMan","30","Apparently, 1 in 10 people live next door to a pedophile. \n" +
                "Not me though, I live next door to a really sexy 10 year-old girl.\n"));
        jokes.add(new Twisted("24.01.2017","Lyds","10","Apparently, 1 in 10 people live next door to a pedophile. \n" +
                "Not me though, I live next door to a really sexy 10 year-old girl.\n"));
        jokes.add(new Twisted("24.01.2017","Allan","50","Apparently, 1 in 10 people live next door to a pedophile. \n" +
                "Not me though, I live next door to a really sexy 10 year-old girl.\n"));
        jokes.add(new Twisted("29.01.2017","Andy","50","Apparently, 1 in 10 people live next door to a pedophile. \n" +
                "Not me though, I live next door to a really sexy 10 year-old girl.\n"));
        jokes.add(new Twisted("01.02.2017","John","50","Apparently, 1 in 10 people live next door to a pedophile. \n" +
                "Not me though, I live next door to a really sexy 10 year-old girl.\n"));


        // Find a reference to the {@link ListView} in the layout
        ListView twistedListView = (ListView) rootView.findViewById(R.id.list);

        // Create a new {adaptor that takes a list of earthquakes as input
        TwistedAdaptor adapter = new TwistedAdaptor(getActivity(), jokes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        twistedListView.setAdapter(adapter);

        return rootView;
    }

}

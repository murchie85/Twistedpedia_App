package com.example.android.twistedpedia;


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
public class TodayFragment extends Fragment {


    public TodayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);



        // creates in a list of TwistedObjects
        // this will eventually just be the best jokes today.
        ArrayList<Twisted> jokes = new ArrayList<>();
        jokes.add(new Twisted("21.01.2017","Bob","12","Due to the sad state of my sex life, \n" +
                "I have decided to convert to Islam.\n" +
                "My new name is Seldom Bin Laid.\n"));
        jokes.add(new Twisted("24.01.2017","Cuntoid99","30","Apparently, 1 in 10 people live next door to a pedophile. \n" +
                "Not me though, I live next door to a really sexy 10 year-old girl.\n"));
        jokes.add(new Twisted("24.01.2017","Lydtheflid","10","Just brought a bag of oxygen with a crisp in it. \n"));
        jokes.add(new Twisted("24.01.2017","Allan","50","I'm going to start a business in India but have my call centre in Scotland. \n" +
                "Let's see how them cunts like it\n"));
        jokes.add(new Twisted("29.01.2017","Andy","20","They say a woman's work is never done...\n" +
                "\n" +
                "Which is probably why they get paid less.\n"));
        jokes.add(new Twisted("01.02.2017","John","60","Apparently, 1 in 10 people live next door to a pedophile. \n" +
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

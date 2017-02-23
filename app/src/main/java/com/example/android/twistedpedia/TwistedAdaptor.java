package com.example.android.twistedpedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


/**
 * Created by adammcmurchie on 22/01/2017.
 */

public class TwistedAdaptor extends ArrayAdapter<Twisted> {

    //CONSTRUCT NEW EARTHQUAKE ADAPTER


    public TwistedAdaptor(Context context, List<Twisted> jokes) {
        super(context, 0, jokes);
    }

    // returns item view - displays earthquake info

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // check if existing listview (CALLED convertview) to reuse
        //otherwise if convertview = null then inflate listitem layout

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(       // inflate ze badboy
                    R.layout.twisted_list_item, parent, false);
        }

        // find earthquake at given position in list of earthquakes
        Twisted currentTwisted = getItem(position);

        //find Textview ID with ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.Date);
        // display magnitude of current in that Textview
        dateView.setText(currentTwisted.getDate());

        // find Textview with user
        TextView userView = (TextView) listItemView.findViewById(R.id.User);
        // display location of current in that Textview
        userView.setText(currentTwisted.getUser());

        // find textview with date ID in that textview location
        TextView scoreView = (TextView) listItemView.findViewById(R.id.Score);
        // display date of current in that textview
        scoreView.setText(currentTwisted.getScore());

        // find textview with date ID in that textview location
        TextView jokeView = (TextView) listItemView.findViewById(R.id.Joke);
        // display date of current in that textview
        jokeView.setText(currentTwisted.getJoke());

        // once we have the info, we return the view to the caller
        return listItemView;


    }
}
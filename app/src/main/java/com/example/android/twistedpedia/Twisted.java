package com.example.android.twistedpedia;

/**
 * Created by adammcmurchie on 17/02/2017.
 */
//joke class
public class Twisted {

    //joke Date
    private String mDate;
    //joke Poster
    private String mUser;
    // jokescore
    private String mScore;
    //joke
    private String mJoke;


    // CONSTRUCT A NEW JOKE

    public Twisted(String date, String user, String score, String joke){

        mDate = date;
        mUser = user;
        mScore = score;
        mJoke = joke;
    }

    // RETURNS constructed variables

    public  String  getmDate(){return mDate;}
    public  String getmUser(){return  mUser;}
    public  String getmScore(){return  mScore;}
    public  String getmJoke(){return mJoke;}

}





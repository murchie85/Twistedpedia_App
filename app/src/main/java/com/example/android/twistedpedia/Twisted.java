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

    public  String  getDate(){return mDate;}
    public  String getUser(){return  mUser;}
    public  String getScore(){return  mScore;}
    public  String getJoke(){return mJoke;}

}





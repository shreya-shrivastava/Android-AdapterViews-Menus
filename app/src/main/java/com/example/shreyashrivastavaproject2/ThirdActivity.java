package com.example.shreyashrivastavaproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class ThirdActivity extends AppCompatActivity {
    String date, duration, director, star, rating1, rating2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView mDate = (TextView) findViewById(R.id.date);
        TextView mDuration = (TextView) findViewById(R.id.duration);
        TextView mDirector = (TextView) findViewById(R.id.director);
        TextView mStar = (TextView) findViewById(R.id.star);
        TextView mRating1 = (TextView) findViewById(R.id.imdb);
        TextView mRating2 = (TextView) findViewById(R.id.rtr);
        final Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            date = mBundle.getString("date");
            duration = mBundle.getString("duration");
            director = mBundle.getString("director");
            star = mBundle.getString("star");
            rating1 = mBundle.getString("rating1");
            rating2 = mBundle.getString("rating2");

            mDate.setText(date);
            mDuration.setText(duration);
            mDirector.setText(director);
            mStar.setText(star);
            mRating1.setText(rating1);
            mRating2.setText(rating2);


        }
    }
}
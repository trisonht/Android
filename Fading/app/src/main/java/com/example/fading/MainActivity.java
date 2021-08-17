package com.example.fading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Animations
        ImageView barImageView = findViewById(R.id.bartImageView);
        barImageView.setX(-1000);
        barImageView.animate().translationXBy(1000).rotation(360*10).setDuration(1000*10);
    }

    // Fade
    boolean barIsShowing = true;

    public void fade(View view) {
        Log.i("Info", "Imageview tapped");
        ImageView bartImageView = findViewById(R.id.bartImageView);
        ImageView homeImageView = findViewById(R.id.homeImageView);
        if(barIsShowing) {
            barIsShowing = false;
            bartImageView.animate().alpha(0).setDuration(2000);
            homeImageView.animate().alpha(1).setDuration(2000);
        } else {
            barIsShowing = true;
            bartImageView.animate().alpha(1).setDuration(2000);
            homeImageView.animate().alpha(0).setDuration(2000);
        }
    }
}
















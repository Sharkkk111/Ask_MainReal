package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson_1_3_1 extends AppCompatActivity {
    // Declaring buttons and SharedPreferences object
    Button home;
    Button back;
    Button quizme;
    SharedPreferences sp;
    /*
    Set content view to lesson 1_3_1
    set on click listeners for each button
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Initialize SharedPreferences
        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        // Initialize answer preferences
        editor.putBoolean("answer1", false);
        editor.putBoolean("answer2", false);
        editor.commit();

       // Set content view to lesson1_3_1

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson1_3_1);

        // Set up videoView
        Log.d("Hi", "setContentView(R.layout.lesson_1)");
        VideoView videoView = (VideoView) findViewById(R.id.videoView1_3_1);  //casting to VideoView is not Strictly required above API level 26
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.cash_or_credit_how_to_choose_between_the_two_better_nbc_news); //set the path of the video that we need to use in our VideoView
        videoView.start();  //start() method of the VideoView class will start the video to play
        Log.d("Shaurya", "android.resource:// + getPackageName() + R.raw.how_do_credit_cards_work");
        MediaController mediaController = new MediaController(this);
        //link mediaController to videoView
        mediaController.setAnchorView(videoView);
        //allow mediaController to control our videoView
        videoView.setMediaController(mediaController);
        videoView.start();
//got the video view from https://www.c-sharpcorner.com/article/adding-video-to-an-android-application/

        // set up button using id in xml code for the home button
        home = findViewById(R.id.home);
       /*
        set the onClick listener for the home button
         Navigate to HomePage activity
         */
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_3_1.this, HomePage.class );
                startActivity(intent);
            }
        });

        // set up button using id in xml code for the go back button
        back = findViewById(R.id.back);
       /*
        set the onClick listener for the go back button
         Navigate to MainActivityThree activity
         */
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_3_1.this,MainActivityThree.class );
                startActivity(intent);
            }
        });

        // set up button using id in xml code for quiz me button
        quizme = findViewById(R.id.quizme);
        /*
        set the onClick listener for the quiz me button
        Navigate to Quiz_1_3_1 class
        */
        quizme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_3_1.this,Quiz_1_3_1.class);
                startActivity(intent);
            }
        });

    }
}
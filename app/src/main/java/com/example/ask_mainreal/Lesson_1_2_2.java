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

public class Lesson_1_2_2 extends AppCompatActivity {
    // Declaring buttons and SharedPreferences object

    Button home;
    Button back;
    Button quizme;
    SharedPreferences sp;
    /*
    Set content view to lesson 1_2_2
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
        editor.putBoolean("answer3", false);
        editor.putBoolean("answer4", false);
        editor.putBoolean("answer5", false);
        editor.commit();

        //Set content view to lesson1_2_2
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson1_2_2);

        // Set up videoVieW
        Log.d("Hi", "setContentView(R.layout.lesson_1)");
        VideoView videoView = (VideoView) findViewById(R.id.videoView1_2_2);  //casting to VideoView is not Strictly required above API level 26
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.credit_card_debit_card_explained_in_under_two_minutes); //set the path of the video that we need to use in our VideoView
        videoView.start();  //start() method of the VideoView class will start the video to play
        Log.d("Shaurya", "android.resource:// + getPackageName() + R.raw.how_do_credit_cards_work");
        MediaController mediaController = new MediaController(this);
        //link mediaController to videoView
        mediaController.setAnchorView(videoView);
        //allow mediaController to control our videoView
        videoView.setMediaController(mediaController);
        videoView.start();
//got the video view from https://www.c-sharpcorner.com/article/adding-video-to-an-android-application/
//got the video view from https://www.c-sharpcorner.com/article/adding-video-to-an-android-application/

        // set up button using id in xml code
        home = findViewById(R.id.home);
        /*
        set the onClickListener for the home button
         Navigate to HomePage class
        */
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_2_2.this, HomePage.class );
                startActivity(intent);
            }
        });

        // set up button using id in xml code
        back = findViewById(R.id.back);
        /*
        set the onClickListener for the go back button
        Navigate to MainActivityThree class
        */
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_2_2.this,MainActivityThree.class );
                startActivity(intent);
            }
        });

        // set up button using id in xml code
        quizme = findViewById(R.id.quizme);
        /*
        set the onClickListener for the quiz me button
        Navigate to Quiz_1_2_2 class
        */
        quizme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_2_2.this, Quiz_1_2_2.class );
                startActivity(intent);
            }
        });

    }
}
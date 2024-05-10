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

public class Lesson_1_2_1 extends AppCompatActivity {
    // Declaring buttons and SharedPreferences object
    Button home;
    Button back;
    Button quizme;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Initialize SharedPreferences
        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        // Initialize answer preferences
        editor.putBoolean("answer1", false);
        editor.putBoolean("answer2", false);
        editor.commit();
        /*
        Set content view to lesson1_2_1
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson1_2_1);

        // Set up videoView
        Log.d("Hi", "setContentView(R.layout.lesson_1)");
        VideoView videoView = (VideoView) findViewById(R.id.videoView1_2_1);  //casting to VideoView is not Strictly required above API level 26
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.what_is_a_debit_card_and_how_does_it_work_); //set the path of the video that we need to use in our VideoView
        videoView.start();  //start() method of the VideoView class will start the video to play
        Log.d("Shaurya", "android.resource:// + getPackageName() + R.raw.how_do_credit_cards_work");
        MediaController mediaController = new MediaController(this);
        //link mediaController to videoView
        mediaController.setAnchorView(videoView);
        //allow mediaController to control our videoView
        videoView.setMediaController(mediaController);
        videoView.start();
//got the video view from https://www.c-sharpcorner.com/article/adding-video-to-an-android-application/

        // Get references to button ids in xml code and set their onClickListeners
        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_2_1.this, HomePage.class );
                startActivity(intent);
            }
        });
        // Get references to button ids in xml code and set their onClickListeners
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            /*
             Navigate to MainActivityThree activity
             */
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_2_1.this,MainActivityThree.class );
                startActivity(intent);
            }
        });
        // Get references to button ids in xml code and set their onClickListeners
        quizme = findViewById(R.id.quizme);
        quizme.setOnClickListener(new View.OnClickListener(){
            /*
             Navigate to Quiz_1_2_1 activity
             */
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_2_1.this, Quiz_1_2_1.class );
                startActivity(intent);
            }
        });
    }
}
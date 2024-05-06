package com.example.ask_mainreal;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class LessonOneCredit extends AppCompatActivity {

    Button home;
    Button back;
    Button quizme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences sp = getApplicationContext().getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean("answer1", false);
        editor.putBoolean("answer2", false);
        editor.commit();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson1_1_1);

        Log.d("Hi", "setContentView(R.layout.lesson_1)");
        VideoView videoView = (VideoView) findViewById(R.id.videoView);  //casting to VideoView is not Strictly required above API level 26
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.how_do_credit_cards_work); //set the path of the video that we need to use in our VideoView
        videoView.start();  //start() method of the VideoView class will start the video to play
        Log.d("Shaurya", "android.resource:// + getPackageName() + R.raw.how_do_credit_cards_work");

        MediaController mediaController = new MediaController(this);
        //link mediaController to videoView
        mediaController.setAnchorView(videoView);
        //allow mediaController to control our videoView
        videoView.setMediaController(mediaController);
        videoView.start();
//got the video view from https://www.c-sharpcorner.com/article/adding-video-to-an-android-application/
        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LessonOneCredit.this, HomePage.class );
                startActivity(intent);
            }
        });

        back = findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LessonOneCredit.this,MainActivityThree.class );
                startActivity(intent);
            }
        });

        quizme = findViewById(R.id.quizme_button);
        quizme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LessonOneCredit.this, QuizOneCredit.class );
                startActivity(intent);

            }
        });
    }
}
package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson_1_4_2 extends AppCompatActivity {

    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson1_4_2);
        button1 = findViewById(R.id.home);

        VideoView videoView01 = (VideoView) findViewById(R.id.videoView1_4_2);
        videoView01.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.credit_score_by_wall_street_survivor); //set the path of the video that we need to use in our VideoView
        videoView01.start();  //start() method of the VideoView class will start the video to play
        Log.d("Shaurya", "android.resource:// + getPackageName() + R.raw.how_do_credit_cards_work");

//got the video view from https://www.c-sharpcorner.com/article/adding-video-to-an-android-application/



        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_4_2.this, HomePage.class );
                startActivity(intent);
            }
        });
    }
}
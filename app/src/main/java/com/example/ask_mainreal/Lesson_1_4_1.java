package com.example.ask_mainreal;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson_1_4_1 extends AppCompatActivity {

    Button home;
    Button back;
    Button quizme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson1_4_1);

        VideoView videoView01 = (VideoView) findViewById(R.id.videoView1_4_1);  //casting to VideoView is not Strictly required above API level 26
        videoView01.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.what_is_a_credit_score_kal_penn_explains_mashable); //set the path of the video that we need to use in our VideoView
        videoView01.start();  //start() method of the VideoView class will start the video to play
        Log.d("Shaurya", "android.resource:// + getPackageName() + R.raw.how_do_credit_cards_work");

//got the video view from https://www.c-sharpcorner.com/article/adding-video-to-an-android-application/
       home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_4_1.this, HomePage.class );
                startActivity(intent);
            }
        });
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_4_1.this,MainActivityThree.class );
                startActivity(intent);
            }
        });


        quizme = findViewById(R.id.quizme);
        quizme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_4_1.this,Quiz_1_4_1.class);
                startActivity(intent);
            }
        });

    }
}
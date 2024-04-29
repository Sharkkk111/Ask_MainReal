package com.example.ask_mainreal;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson_1_2_1 extends AppCompatActivity {

    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson1_2_1);


        Log.d("Hi", "setContentView(R.layout.lesson_1)");
        VideoView videoView = (VideoView) findViewById(R.id.videoView1_2_1);  //casting to VideoView is not Strictly required above API level 26
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.what_is_a_debit_card_and_how_does_it_work_); //set the path of the video that we need to use in our VideoView
        videoView.start();  //start() method of the VideoView class will start the video to play
        Log.d("Shaurya", "android.resource:// + getPackageName() + R.raw.how_do_credit_cards_work");
//got the video view from https://www.c-sharpcorner.com/article/adding-video-to-an-android-application/

        button1 = findViewById(R.id.home);

//got the video view from https://www.c-sharpcorner.com/article/adding-video-to-an-android-application/
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_2_1.this, HomePage.class );
                startActivity(intent);
            }
        });
    }
}
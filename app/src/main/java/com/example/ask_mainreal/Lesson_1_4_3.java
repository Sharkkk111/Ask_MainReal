package com.example.ask_mainreal;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson_1_4_3 extends AppCompatActivity {

    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson1_4_3);
        button1 = findViewById(R.id.home);

        VideoView videoView01 = (VideoView) findViewById(R.id.videoView1_4_3);  //casting to VideoView is not Strictly required above API level 26
        videoView01.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.how_to_build_credit_and_improve_your_credit_score); //set the path of the video that we need to use in our VideoView
        videoView01.start();  //start() method of the VideoView class will start the video to play
        Log.d("Shaurya", "android.resource:// + getPackageName() + R.raw.how_do_credit_cards_work");


        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_4_3.this, HomePage.class );
                startActivity(intent);
            }
        });
    }
}
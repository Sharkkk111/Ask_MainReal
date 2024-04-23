package com.example.ask_mainreal;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class LessonTwoCredit extends AppCompatActivity {

    Button home;
    Button back;
    Button quizme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson1_1_2);
        Log.d("Hi", "setContentView(R.layout.lesson_1)");
        VideoView videoView = (VideoView) findViewById(R.id.videoView1_1_2);  //casting to VideoView is not Strictly required above API level 26
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.what_is_cash_back_on_a_credit_card_discover_card_smarts); //set the path of the video that we need to use in our VideoView
        videoView.start();  //start() method of the VideoView class will start the video to play
        Log.d("Shaurya", "android.resource:// + getPackageName() + R.what_is_cash _back_on_a_credit_card_ discover_card_smarts");
        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LessonTwoCredit.this, HomePage.class );
                startActivity(intent);
            }
        });

        back = findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LessonTwoCredit.this,MainActivityThree.class );
                startActivity(intent);
            }
        });

        quizme = findViewById(R.id.quizme);
        quizme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LessonTwoCredit.this, QuizOneCredit.class );
                startActivity(intent);

            }
        });
    }
}
package com.example.ask_mainreal;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson_1_2_1 extends AppCompatActivity {

    Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson1_2_1);
        home = findViewById(R.id.home);

//got the video view from https://www.c-sharpcorner.com/article/adding-video-to-an-android-application/
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_2_1.this, HomePage.class );
                startActivity(intent);
            }
        });
    }
}
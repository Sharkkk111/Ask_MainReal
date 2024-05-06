package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson_1_4_3 extends AppCompatActivity {
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
        setContentView(R.layout.lesson1_4_3);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_4_3.this, HomePage.class);
                startActivity(intent);
            }
        });
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_4_3.this,MainActivityThree.class);
                startActivity(intent);
            }
        });


        quizme = findViewById(R.id.quizme);
        quizme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Lesson_1_4_3.this,Quiz_1_4_3.class);
                startActivity(intent);
            }
        });

    }
}
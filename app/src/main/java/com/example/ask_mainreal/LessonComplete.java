package com.example.ask_mainreal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LessonComplete extends AppCompatActivity {

    Button home;
    Button next_lesson;
    @SuppressLint("ApplySharedPref")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sp = getApplicationContext().getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean("answer1", false);
        editor.putBoolean("answer2", false);
        editor.commit();
        setContentView(R.layout.lesson_complete);

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LessonComplete.this, HomePage.class );
                startActivity(intent);}
        });
        next_lesson = findViewById(R.id.next_lesson);
        next_lesson.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int lesson = sp.getInt("creditLesson", 0);
                if(lesson ==0){
                    Intent intent = new Intent(LessonComplete.this,LessonOneCredit.class);
                    startActivity(intent);}
                else if(lesson==1){
                    Intent intent = new Intent(LessonComplete.this,LessonTwoCredit.class);
                    startActivity(intent);}
            }
        });
    }
}

package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {
    Button credit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("Preferences", Context.MODE_PRIVATE);

        credit=findViewById(R.id.credit1);
        credit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int lesson = sp.getInt("creditLesson", 0);
                if(lesson ==0){
                    Intent intent = new Intent(HomePage.this,LessonOneCredit.class);
                    startActivity(intent);}
                else if(lesson==1){
                    Intent intent = new Intent(HomePage.this,LessonTwoCredit.class);
                    startActivity(intent);}
            }

        });}

    public static class Lesson_1_2_3 {
    }
}
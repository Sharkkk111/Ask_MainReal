package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_1_2_2 extends AppCompatActivity {

    Button home;
    Button credit2;
    Button credit3;
    Button credit4;
    Button credit5;
    Button debit2;
    Button debit3;
    Button debit4;
    Button debit5;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1_2_2);

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_2.this, HomePage.class );
                startActivity(intent);
            }
        });

        credit2 = findViewById(R.id.credit2);
        credit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("answer2", true);
                editor.commit();
                if (sp.getBoolean("answer1", false)&&sp.getBoolean("answer3", false)&&sp.getBoolean("answer4", false)&&sp.getBoolean("answer5", false)) {
                    editor.putInt("debitLesson", 2);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_2_2.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });
        debit2 = findViewById(R.id.debit2);
        debit2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_2.this, Lesson_1_2_2.class );
                startActivity(intent);
            }
        });

        credit3 = findViewById(R.id.credit3);
        credit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("answer3", true);
                editor.commit();
                if (sp.getBoolean("answer2", false)&&sp.getBoolean("answer1", false)&&sp.getBoolean("answer4", false)&&sp.getBoolean("answer5", false)) {
                    editor.putInt("debitLesson", 2);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_2_2.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });
        debit3 = findViewById(R.id.debit3);
        debit3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_2.this, Lesson_1_2_2.class );
                startActivity(intent);
            }
        });

        debit4 = findViewById(R.id.debit4);
        debit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("answer4", true);
                editor.commit();
                if (sp.getBoolean("answer2", false)&&sp.getBoolean("answer3", false)&&sp.getBoolean("answer1", false)&&sp.getBoolean("answer5", false)) {
                    editor.putInt("debitLesson", 2);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_2_2.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });
        credit4 = findViewById(R.id.credit4);
        credit4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_2.this, Lesson_1_2_2.class );
                startActivity(intent);
            }
        });

        credit5 = findViewById(R.id.credit5);
        credit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("answer5", true);
                editor.commit();
                if (sp.getBoolean("answer2", false)&&sp.getBoolean("answer3", false)&&sp.getBoolean("answer4", false)&&sp.getBoolean("answer1", false)) {
                    editor.putInt("debitLesson", 2);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_2_2.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });

        debit5 = findViewById(R.id.debit5);
        debit5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_2.this, Lesson_1_2_2.class );
                startActivity(intent);
            }
        });



    }
}
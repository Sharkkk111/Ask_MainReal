package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_1_2_3 extends AppCompatActivity {

    Button home;
    Button true1;
    Button false1;
    Button true2;
    Button false2;
    Button true3;
    Button false3;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1_2_3);
        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_3.this, HomePage.class );
                startActivity(intent);
            }
        });
        true1 = findViewById(R.id.true1);
        true1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_3.this, Lesson_1_2_3.class );
                startActivity(intent);
            }
        });
        false1 = findViewById(R.id.false1);
        false1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("answer1", true);
                editor.commit();
                if (sp.getBoolean("answer2", false)&&sp.getBoolean("answer3", false)) {
                    editor.putInt("debitLesson", 3);
                    editor.putBoolean("debit", true);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_2_3.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });

        false2 = findViewById(R.id.false2);
        false2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_3.this, Lesson_1_2_3.class );
                startActivity(intent);
            }
        });
        true2 = findViewById(R.id.true2);
        true2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("answer2", true);
                editor.commit();
                if (sp.getBoolean("answer1", false)&&sp.getBoolean("answer3", false)) {
                    editor.putInt("debitLesson", 3);
                    editor.putBoolean("debit", true);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_2_3.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });

        true3 = findViewById(R.id.true3);
        true3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_3.this, Lesson_1_2_3.class );
                startActivity(intent);
            }
        });
        false3 = findViewById(R.id.false3);
        false3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("answer1", true);
                editor.commit();
                if (sp.getBoolean("answer2", false)&&sp.getBoolean("answer3", false)) {
                    editor.putInt("debitLesson", 3);
                    editor.putBoolean("debit", true);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_2_3.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });
    }
}
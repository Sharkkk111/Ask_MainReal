package com.example.ask_mainreal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_1_4_1 extends AppCompatActivity {

    Button a;
    Button b;
    Button c;
    Button d;
    Button submit;
    EditText ShortAnswer;
    SharedPreferences sp;
    String ShortAnswerStr;
    Button home;    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1_4_1);
        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_4_1.this, HomePage.class );
                startActivity(intent);

            }
        });ShortAnswer = findViewById(R.id.editText);
        submit = findViewById(R.id.enter);

        submit.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("ApplySharedPref")
            @Override
            public void onClick(View view){
                ShortAnswerStr = ShortAnswer.getText().toString();

                if(ShortAnswerStr.equals("correct answer")){
                    editor.putBoolean("answer1", true);
                    if (sp.getBoolean("answer2", false)) {
                        editor.putInt("creditLesson", 1);
                        editor.commit();
                        Intent intent = new Intent(Quiz_1_4_1.this, LessonComplete.class);
                        startActivity(intent);}
                }
                else{
                    Intent intent = new Intent(Quiz_1_4_1.this, Lesson_1_4_1.class );
                    startActivity(intent);
                }
                editor.apply();
            }
        });
        a = findViewById(R.id.a);
        a.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_4_1.this, Lesson_1_4_1.class);
                startActivity(intent);
            }
        });
        b = findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_4_1.this, Lesson_1_4_1.class );
                startActivity(intent);
            }
        });
        d = findViewById(R.id.d);
        d.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_4_1.this, Lesson_1_4_1.class);
                startActivity(intent);
            }
        });
        c = findViewById(R.id.c);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("answer2", true);
                editor.commit();
                if (sp.getBoolean("answer1", false)) {
                    editor.putInt("creditLesson", 1);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_4_1.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });
    }}
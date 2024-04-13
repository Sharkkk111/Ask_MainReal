package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
public class QuizOneCredit extends AppCompatActivity{
    Button a;
    Button b;
    Button c;
    Button d;
    Button choice;
    Button submit;
    EditText ShortAnswer;
    SharedPreferences sp;
    String ShortAnswerStr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1_1_1);

        ShortAnswer = findViewById(R.id.editText);
        submit = findViewById(R.id.enter);

        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        sp = getSharedPreferences("MyUserPreferences", Context.MODE_PRIVATE);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ShortAnswerStr = ShortAnswer.getText().toString();

                SharedPreferences.Editor editor = sp.edit();
                if(ShortAnswerStr.equals("correct answer")){
                    editor.putBoolean("answer1", true);}

                editor.apply();
            }
        });
        a = findViewById(R.id.a);
        a.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(QuizOneCredit.this, LessonOneCredit.class );
                startActivity(intent);
            }
        });
        c = findViewById(R.id.c);
        c.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(QuizOneCredit.this, LessonOneCredit.class );
                startActivity(intent);
            }
        });
        d = findViewById(R.id.d);
        d.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(QuizOneCredit.this, LessonOneCredit.class );
                startActivity(intent);
            }
        });
        b = findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                SharedPreferences.Editor editor = sp.edit();
                editor.putBoolean("answer2", true);
                editor.apply();
            }
        });
        if(sp.getBoolean("answer1",false)&&sp.getBoolean("answer2",false)){
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt("creditLesson", 1);
            editor.apply();
            Intent intent = new Intent(QuizOneCredit.this, LessonComplete.class );
            startActivity(intent);
        }



    }
        }
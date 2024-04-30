package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_1_3_1 extends AppCompatActivity {

    Button home;
    Button a;
    Button b;
    Button c;
    Button d;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1_3_1);
        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_3_1.this, HomePage.class );
                startActivity(intent);
            }
        });

        a = findViewById(R.id.a);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("answer1", true);
                editor.commit();
                if (sp.getBoolean("answer2", false)) {
                    editor.putBoolean("cash", true);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_3_1.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });
        b = findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("answer2", true);
                editor.commit();
                if (sp.getBoolean("answer1", false)) {
                    editor.putBoolean("cash", true);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_3_1.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });
        c = findViewById(R.id.c);
        c.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_3_1.this, Lesson_1_3_1.class );
                startActivity(intent);
            }
        });

        d = findViewById(R.id.d);
        d.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_3_1.this, Lesson_1_3_1.class );
                startActivity(intent);
            }
        });
    }
}
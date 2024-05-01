package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_1_4_3 extends AppCompatActivity {

    Button home;
    Button true1;
    Button false1;
    SharedPreferences sp;
    Button a;
    Button b;
    Button c;
    Button d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1_4_3);
        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_4_3.this, HomePage.class );
                startActivity(intent);
            }
        });
        false1 = findViewById(R.id.false1);
        false1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_4_3.this, Lesson_1_4_3.class );
                startActivity(intent);
            }
        });
        true1 = findViewById(R.id.true1);
        true1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("answer1", true);
                editor.commit();
                if (sp.getBoolean("answer2", false)) {
                    editor.putInt("creditScoreLesson", 3);
                    editor.putBoolean("creditScore", true);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_4_3.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });
            a = findViewById(R.id.a);
        a.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent intent = new Intent(Quiz_1_4_3.this, Lesson_1_4_3.class );
                    startActivity(intent);
                }
            });
            b = findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent intent = new Intent(Quiz_1_4_3.this, Lesson_1_4_3.class  );
                    startActivity(intent);
                }
            });
            c = findViewById(R.id.c);
        c.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent intent = new Intent(Quiz_1_4_3.this, Lesson_1_4_3.class );
                    startActivity(intent);
                }
            });
            d = findViewById(R.id.d);
        d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editor.putBoolean("answer2", true);
                    editor.commit();
                    if (sp.getBoolean("answer1", false)) {
                        editor.putInt("creditScoreLesson", 2);
                        editor.commit();
                        Intent intent = new Intent(Quiz_1_4_3.this, LessonComplete.class);
                        startActivity(intent);
                    }
                }
            });
    }
}
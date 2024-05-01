package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_1_4_2 extends AppCompatActivity {

    Button home;
    Button true;
    Button false;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1_4_2);
        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                Intent intent = new Intent(Quiz_1_4_2.this, HomePage.class );
                startActivity(intent);
            }
        });
        false = findViewById(R.id.false2);
        false.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_3.this, Lesson_1_2_3.class );
                startActivity(intent);
            }
        });
        true = findViewById(R.id.true2);
        true2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("answer2", true);
                editor.commit();
                if (sp.getBoolean("answer1", false)&&sp.getBoolean("answer3", false)) {
                    editor.putInt("debitlesson", 3);
                    editor.putBoolean("debit", true);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_2_3.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });
    }
}
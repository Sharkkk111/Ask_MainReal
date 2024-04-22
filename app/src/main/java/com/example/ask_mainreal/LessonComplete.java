package com.example.ask_mainreal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ask_mainreal.HomePage;
import com.example.ask_mainreal.MainActivityThree;
import com.example.ask_mainreal.R;

public class LessonComplete extends AppCompatActivity {

    Button home;
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
                startActivity(intent);
            }
        });
    }
}

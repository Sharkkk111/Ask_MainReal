package com.example.ask_mainreal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ask_mainreal.HomePage;
import com.example.ask_mainreal.MainActivityThree;
import com.example.ask_mainreal.R;

public class LessonComplete extends AppCompatActivity {

    Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

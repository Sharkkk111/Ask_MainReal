package com.example.ask_mainreal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LessonTwoCredit extends AppCompatActivity {

    Button home;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson1_1_2);

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LessonTwoCredit.this, HomePage.class );
                startActivity(intent);
            }
        });

        back = findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LessonTwoCredit.this,MainActivityThree.class );
                startActivity(intent);
            }
        });
    }
}
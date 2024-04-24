package com.example.ask_mainreal;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_1_4_3 extends AppCompatActivity {

    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1_4_3);
        button1 = findViewById(R.id.home);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_4_3.this, HomePage.class );
                startActivity(intent);
            }
        });
    }
}
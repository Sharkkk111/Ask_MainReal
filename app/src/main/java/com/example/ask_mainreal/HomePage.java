package com.example.ask_mainreal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    Button credit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

    credit1=findViewById(R.id.credit1);
        credit1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(HomePage.this,LessonOneCredit.class);
            startActivity(intent);
        }
    });
}}
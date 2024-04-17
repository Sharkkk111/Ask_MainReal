package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityThree extends AppCompatActivity {
    Button credit1;
    Button credit2;
    Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("Preferences", Context.MODE_PRIVATE);


        credit1=findViewById(R.id.credit1);
        credit1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            if(sp.getInt("credit",0) ==0){
                Intent intent = new Intent(MainActivityThree.this,LessonOneCredit.class);
                startActivity(intent);}
            if(sp.getInt("credit",0)==1){
                Intent intent = new Intent(MainActivityThree.this,LessonTwoCredit.class);
                startActivity(intent);}
        }
    });
        credit2=findViewById(R.id.credit2);
        credit2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(sp.getInt("credit",0) ==0){
                    Intent intent = new Intent(MainActivityThree.this,LessonOneCredit.class);
                    startActivity(intent);}
                if(sp.getInt("credit",0)==1){
                    Intent intent = new Intent(MainActivityThree.this,LessonTwoCredit.class);
                    startActivity(intent);}
            }
        });

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivityThree.this, HomePage.class );
                startActivity(intent);
            }
        });

}}

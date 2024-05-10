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
    Button debit1;
    Button debit2;
    Button cash1;
    Button cash2;
    Button credit_score1;
    Button credit_score2;
    Button home;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivityThree.this, HomePage.class );
                startActivity(intent);
            }
        });

        credit1=findViewById(R.id.credit1);
        credit1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int lesson = sp.getInt("creditLesson", 0);
                if(!sp.getBoolean("credit", false)){
                    if(lesson ==0){
                        Intent intent = new Intent(MainActivityThree.this,LessonOneCredit.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(MainActivityThree.this,LessonTwoCredit.class);
                        startActivity(intent);}
                }

            }
        });

        credit2=findViewById(R.id.credit2);
        credit2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int lesson = sp.getInt("creditLesson", 0);
                if(!sp.getBoolean("credit", false)){
                    if(lesson ==0){
                        Intent intent = new Intent(MainActivityThree.this,LessonOneCredit.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(MainActivityThree.this,LessonTwoCredit.class);
                        startActivity(intent);}
                }

            }
        });

        debit1=findViewById(R.id.debit1);
        debit1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int lesson = sp.getInt("debitLesson", 0);
                if(!sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                    if(lesson ==0){
                        Intent intent = new Intent(MainActivityThree.this,Lesson_1_2_1.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(MainActivityThree.this,Lesson_1_2_2.class);
                        startActivity(intent);}
                    else{
                        Intent intent = new Intent(MainActivityThree.this, Lesson_1_2_3.class);
                        startActivity(intent);}
                }
            }
        });

        debit2=findViewById(R.id.debit2);
        debit2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int lesson = sp.getInt("debitLesson", 0);
                if(!sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                    if(lesson ==0){
                        Intent intent = new Intent(MainActivityThree.this,Lesson_1_2_1.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(MainActivityThree.this,Lesson_1_2_2.class);
                        startActivity(intent);}
                    else if(lesson==2){
                        Intent intent = new Intent(MainActivityThree.this,Lesson_1_2_3.class);
                        startActivity(intent);}
                }
            }
        });

        cash1=findViewById(R.id.cash1);
        cash1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(!sp.getBoolean("cash", false) && sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                    Intent intent = new Intent(MainActivityThree.this,Lesson_1_3_1.class);
                    startActivity(intent);}
            }
        });

        cash2=findViewById(R.id.cash2);
        cash2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(!sp.getBoolean("cash", false) && sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                    Intent intent = new Intent(MainActivityThree.this,Lesson_1_3_1.class);
                    startActivity(intent);}
            }
        });

        credit_score1=findViewById(R.id.credit_score1);
        credit_score1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(!sp.getBoolean("creditScore", false) &&sp.getBoolean("cash", false) && sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                int lesson = sp.getInt("creditScoreLesson", 0);
                if(lesson ==0){
                    Intent intent = new Intent(MainActivityThree.this, Lesson_1_4_1.class);
                    startActivity(intent);}
                else if(lesson==1){
                    Intent intent = new Intent(MainActivityThree.this, Lesson_1_4_2.class);
                    startActivity(intent);}
                else if(lesson==2){
                    Intent intent = new Intent(MainActivityThree.this, Lesson_1_4_3.class);
                    startActivity(intent);}}
            }
        });

        credit_score2=findViewById(R.id.credit_score2);
        credit_score2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(!sp.getBoolean("creditScore", false) &&sp.getBoolean("cash", false) && sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                int lesson = sp.getInt("creditScoreLesson", 0);
                if(lesson ==0){
                    Intent intent = new Intent(MainActivityThree.this, Lesson_1_4_1.class);
                    startActivity(intent);}
                else if(lesson==1){
                    Intent intent = new Intent(MainActivityThree.this, Lesson_1_4_2.class);
                    startActivity(intent);}
                else if(lesson==2){
                    Intent intent = new Intent(MainActivityThree.this, Lesson_1_4_3.class);
                    startActivity(intent);}}
            }
        });

}}

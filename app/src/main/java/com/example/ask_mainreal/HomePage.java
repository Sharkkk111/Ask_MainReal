package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {
    Button credit;
    Button debit;
    Button cash;
    Button credit_score;
    SharedPreferences sp;
    /*
    This opens th
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

         sp = getApplicationContext().getSharedPreferences("Preferences", Context.MODE_PRIVATE);

        credit=findViewById(R.id.credit1);
        credit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int lesson = sp.getInt("creditLesson", 0);
                if(!sp.getBoolean("credit", false)){
                    if(lesson ==0){
                        Intent intent = new Intent(HomePage.this,LessonOneCredit.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(HomePage.this,LessonTwoCredit.class);
                        startActivity(intent);}
                }

            }
        });
        debit=findViewById(R.id.debit);
        debit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int lesson = sp.getInt("debitLesson", 0);
                if(!sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                    if(lesson ==0){
                        Intent intent = new Intent(HomePage.this,Lesson_1_2_1.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(HomePage.this,Lesson_1_2_2.class);
                        startActivity(intent);}
                    else if(lesson==2){
                        Intent intent = new Intent(HomePage.this,Lesson_1_2_3.class);
                        startActivity(intent);}
                }
            }
        });
        cash=findViewById(R.id.cash);
        cash.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(!sp.getBoolean("cash", false) && sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                        Intent intent = new Intent(HomePage.this,Lesson_1_3_1.class);
                        startActivity(intent);}
            }
        });

        credit_score=findViewById(R.id.credit_score);
        credit_score.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(!sp.getBoolean("creditScore", false) &&sp.getBoolean("cash", false) && sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                int lesson = sp.getInt("creditScore", 0);
                if(lesson ==0){
                    Intent intent = new Intent(HomePage.this, Lesson_1_4_1.class);
                    startActivity(intent);}
                else if(lesson==1){
                    Intent intent = new Intent(HomePage.this, LessonTwoCredit.class);
                    startActivity(intent);}
                else if(lesson==2){
                    Intent intent = new Intent(HomePage.this, LessonTwoCredit.class);
                    startActivity(intent);}}
            }
        });



    }
}
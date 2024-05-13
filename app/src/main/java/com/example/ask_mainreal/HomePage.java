package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {
    // Declaring buttons and SharedPreferences object
    Button credit;
    Button debit;
    Button cash;
    Button credit_score;
    SharedPreferences sp;
    /*
    This opens the Home page of our app.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //set content view
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        // Initializing SharedPreferences object
        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);

        // Initializing credit button and setting OnClickListener
        credit=findViewById(R.id.credit1);
        /*
        This checks if the user has completed all the credit lessons and if not what lesson they are on
        if they are on a lesson it will open that lesson
        if not the button does nothing
         */
        credit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Getting the credit lesson status from SharedPreferences
                int lesson = sp.getInt("creditLesson", 0);
                // Checking if credit lesson is not completed
                if(!sp.getBoolean("credit", false)){
                    // Starting a new activity based on lesson status
                    if(lesson ==0){
                        Intent intent = new Intent(HomePage.this,LessonOneCredit.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(HomePage.this,LessonTwoCredit.class);
                        startActivity(intent);}
                }

            }
        });

        // Initializing debit button and setting OnClickListener
        debit=findViewById(R.id.debit);
        /*
        This checks if the user has completed all the debit lessons and if not what lesson they are on
        if they are on a lesson it will open that lesson
        if not the button does nothing
         */
        debit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Getting the lesson status from SharedPreferences
                int lesson = sp.getInt("debitLesson", 0);
                // Checking if debit lesson is not completed and credit lesson is completed
                if(!sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                    // Starting a new activity based on lesson status
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

        // Initializing cash button and setting OnClickListener
        cash=findViewById(R.id.cash);
        /*
        This checks if the user has completed all the cash lessons and if not what lesson they are on
        if they are on a lesson it will open that lesson
        if not the button does nothing
         */
        cash.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Checking if cash lesson is not completed and debit and credit lessons are completed
                if(!sp.getBoolean("cash", false) && sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                        Intent intent = new Intent(HomePage.this,Lesson_1_3_1.class);
                        startActivity(intent);}
            }
        });

        // Initializing credit_score button and setting OnClickListener
        credit_score=findViewById(R.id.credit_score);
        /*
        This checks if the user has completed all the credit score lessons and if not what lesson they are on
        if they are on a lesson it will open that lesson
        if not the button does nothing
         */
        credit_score.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Checking if credit score lesson is not completed and other lessons are completed
                if(!sp.getBoolean("creditScore", false) &&sp.getBoolean("cash", false) && sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                    // Getting the lesson status from SharedPreferences
                    int lesson = sp.getInt("creditScore", 0);
                    // Starting a new activity based on lesson status
                    if(lesson ==0){
                        Intent intent = new Intent(HomePage.this, Lesson_1_4_1.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(HomePage.this, Lesson_1_4_2.class);
                        startActivity(intent);}
                    else if(lesson==2){
                        Intent intent = new Intent(HomePage.this, Lesson_1_4_3.class);
                        startActivity(intent);}}
            }
        });



    }
}
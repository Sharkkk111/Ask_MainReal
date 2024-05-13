package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityThree extends AppCompatActivity {
    // Declaring buttons and SharedPreferences object
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
    /*
    Set content view to activity_main2.xm
    set on click listeners for each button
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //set content view
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Initializing SharedPreferences object
        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);

        // set up button using id in xml code
        home = findViewById(R.id.home);
        /*
        set the onClickListener for the home button
         Navigate to HomePage class
         */
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivityThree.this, HomePage.class );
                startActivity(intent);
            }
        });

        // set up button using id in xml code
        credit1=findViewById(R.id.credit1);
         /*
        This checks if the user has completed all the credit lessons and if not what lesson they are on
        if they are on a lesson it will open that lesson
        if not the button does nothing
         */
        credit1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Getting the credit lesson status from SharedPreferences
                int lesson = sp.getInt("creditLesson", 0);
                // Checking if credit lesson is not completed
                if(!sp.getBoolean("credit", false)){
                    // Starting a new activity based on lesson status
                    if(lesson ==0){
                        Intent intent = new Intent(MainActivityThree.this,LessonOneCredit.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(MainActivityThree.this,LessonTwoCredit.class);
                        startActivity(intent);}
                }

            }
        });

        // set up button using id in xml code
        credit2=findViewById(R.id.credit2);
         /*
        This checks if the user has completed all the credit lessons and if not what lesson they are on
        if they are on a lesson it will open that lesson
        if not the button does nothing
         */
        credit2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Getting the credit lesson status from SharedPreferences
                int lesson = sp.getInt("creditLesson", 0);
                // Checking if credit lesson is not completed
                if(!sp.getBoolean("credit", false)){
                    // Starting a new activity based on lesson status
                    if(lesson ==0){
                        Intent intent = new Intent(MainActivityThree.this,LessonOneCredit.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(MainActivityThree.this,LessonTwoCredit.class);
                        startActivity(intent);}
                }

            }
        });

        // set up button using id in xml code
        debit1=findViewById(R.id.debit1);
        /*
        This checks if the user has completed all the debit lessons and if not what lesson they are on
        if they are on a lesson it will open that lesson
        if not the button does nothing
         */
        debit1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Getting the lesson status from SharedPreferences
                int lesson = sp.getInt("debitLesson", 0);
                // Checking if debit lesson is not completed and credit lesson is completed
                if(!sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                    // Starting a new activity based on lesson status
                    if(lesson ==0){
                        Intent intent = new Intent(MainActivityThree.this,Lesson_1_2_1.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(MainActivityThree.this,Lesson_1_2_2.class);
                        startActivity(intent);}
                    else if(lesson == 2){
                        Intent intent = new Intent(MainActivityThree.this, Lesson_1_2_3.class);
                        startActivity(intent);}
                }
            }
        });

        // set up button using id in xml code
        debit2=findViewById(R.id.debit2);
        /*
        This checks if the user has completed all the debit lessons and if not what lesson they are on
        if they are on a lesson it will open that lesson
        if not the button does nothing
         */
        debit2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Getting the lesson status from SharedPreferences
                int lesson = sp.getInt("debitLesson", 0);
                // Checking if debit lesson is not completed and credit lesson is completed
                if(!sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                    // Starting a new activity based on lesson status
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

        // set up button using id in xml code
        cash1=findViewById(R.id.cash1);
        /*
        This checks if the user has completed all the cash lessons and if not what lesson they are on
        if they are on a lesson it will open that lesson
        if not the button does nothing
         */
        cash1.setOnClickListener(new View.OnClickListener(){
            // Checking if cash lesson is not completed and debit and credit lessons are completed
            @Override
            public void onClick(View view){
                if(!sp.getBoolean("cash", false) && sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                    Intent intent = new Intent(MainActivityThree.this,Lesson_1_3_1.class);
                    startActivity(intent);}
            }
        });

        // set up button using id in xml code
        cash2=findViewById(R.id.cash2);
        /*
        This checks if the user has completed all the cash lessons and if not what lesson they are on
        if they are on a lesson it will open that lesson
        if not the button does nothing
         */
        cash2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Checking if cash lesson is not completed and debit and credit lessons are completed
                if(!sp.getBoolean("cash", false) && sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                    Intent intent = new Intent(MainActivityThree.this,Lesson_1_3_1.class);
                    startActivity(intent);}
            }
        });

        // set up button using id in xml code
        credit_score1=findViewById(R.id.credit_score1);
         /*
        This checks if the user has completed all the credit score lessons and if not what lesson they are on
        if they are on a lesson it will open that lesson
        if not the button does nothing
         */
        credit_score1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Checking if credit score lesson is not completed and other lessons are completed
                if(!sp.getBoolean("creditScore", false) &&sp.getBoolean("cash", false) && sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                    // Getting the lesson status from SharedPreferences
                    int lesson = sp.getInt("creditScoreLesson", 0);
                    // Starting a new activity based on lesson status
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

        // set up button using id in xml code
        credit_score2=findViewById(R.id.credit_score2);
         /*
        This checks if the user has completed all the credit score lessons and if not what lesson they are on
        if they are on a lesson it will open that lesson
        if not the button does nothing
         */
        credit_score2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Checking if credit score lesson is not completed and other lessons are completed
                if(!sp.getBoolean("creditScore", false) &&sp.getBoolean("cash", false) && sp.getBoolean("debit", false) && sp.getBoolean("credit", false)){
                    // Getting the lesson status from SharedPreferences
                    int lesson = sp.getInt("creditScoreLesson", 0);
                    // Starting a new activity based on lesson status
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

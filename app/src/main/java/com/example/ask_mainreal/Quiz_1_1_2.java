package com.example.ask_mainreal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
public class Quiz_1_1_2 extends AppCompatActivity{
    // declaring UI elements shared preferences and strings to temporarily store user input
    Button submitCashback;
    EditText CashbackShortAnswer;
    String Cashback;
    Button submitLimits;
    EditText LimitsShortAnswer;
    String Limits;
    Button submitRewards;
    EditText RewardsShortAnswer;
    String Rewards;
    Button home;
    SharedPreferences sp;
    /*
   Set content view to quiz1_1_2
   compare users input for each question to correct answers
        if equal move user to lesson complete page
        if not equal return to lesson page
   */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Initialize SharedPreferences
        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        //set content view
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1_1_2);

        // initialize button using id in xml code
        home = findViewById(R.id.home);
        /*
        set the onClickListener for the home button
         Navigate to HomePage class
         */
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_1_2.this, HomePage.class );
                startActivity(intent);
            }
        });

        // Short answer text field initialization using id from xml code
        CashbackShortAnswer = findViewById(R.id.cashback);
        // initialize button using id in xml code
        submitCashback = findViewById(R.id.cashback_enter);

         /*
        set on click lister for the submit answer button under the cashback short answer
        when button is clicked it puts the user short answer edit text into a string and checks if it is equal to the actual answer
            if it is equal and all other answers are true it sends the user to the lesson complete page
            if it is equal but not all other questions have been answered it updates preferences
            if not it sends the user back to the lesson page
         */
        submitCashback.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                //set to string
                Cashback = CashbackShortAnswer.getText().toString();
                Cashback = Cashback.toLowerCase();

                //checks if answer is correct
                if(Cashback.equals("credit perk")||Cashback.equals("a credit perk")){
                    //update preferences
                    editor.putBoolean("answer1", true);
                    //checks if all questions are answered correct
                    if (sp.getBoolean("answer2", false) && sp.getBoolean("answer3", false)) {
                        //update preferences
                        editor.putInt("creditLesson", 2);
                        editor.putBoolean("credit", true);
                        editor.commit();
                        //send to lesson complete page
                        Intent intent = new Intent(Quiz_1_1_2.this, LessonComplete.class);
                        startActivity(intent);}
                }
                else{
                    // send to lesson page
                    Intent intent = new Intent(Quiz_1_1_2.this, LessonTwoCredit.class );
                    startActivity(intent);
                }
                editor.apply();
            }
        });

        // Short answer text field initialization using id from xml code
        LimitsShortAnswer = findViewById(R.id.limits);
        // initialize button using id in xml code
        submitLimits = findViewById(R.id.limits_enter);

        /*
        set on click lister for the submit answer button under the limits short answer
        when button is clicked it puts the user short answer edit text into a string and checks if it is equal to the actual answer
            if it is equal and all other answers are true it sends the user to the lesson complete page
            if it is equal but not all other questions have been answered it updates preferences
            if not it sends the user back to the lesson page
         */
        submitLimits.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //set to string
                Limits = LimitsShortAnswer.getText().toString();
                Limits = Limits.toLowerCase();

                //checks if answer is correct
                if(Limits.equals("limits")||Limits.equals("a limit")||Limits.equals("caps")||Limits.equals("a cap")){
                    //update preferences
                    editor.putBoolean("answer2", true);
                    //checks if all questions are answered correct
                    if (sp.getBoolean("answer1", false) && sp.getBoolean("answer3", false)) {
                        //update preferences
                        editor.putInt("creditLesson", 2);
                        editor.putBoolean("credit", true);
                        editor.commit();
                        //send to lesson complete page
                        Intent intent = new Intent(Quiz_1_1_2.this, LessonComplete.class);
                        startActivity(intent);}
                }
                else{
                    // send to lesson page
                    Intent intent = new Intent(Quiz_1_1_2.this, LessonTwoCredit.class );
                    startActivity(intent);
                }
                editor.apply();
            }
        });

        // Short answer text field initialization using id from xml code
        RewardsShortAnswer = findViewById(R.id.rewards);
        // initialize button using id in xml code
        submitRewards = findViewById(R.id.rewards_enter);
        /*
        set on click lister for the submit answer button under the rewards enter answer
        when button is clicked it puts the user short answer edit text into a string and checks if it is equal to the actual answer
            if it is equal and all other answers are true it sends the user to the lesson complete page
            if it is equal but not all other questions have been answered it updates preferences
            if not it sends the user back to the lesson page
         */
        submitRewards.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //set to string
                Rewards = RewardsShortAnswer.getText().toString();
                Rewards = Rewards.toLowerCase();

                //checks if answer is correct
                if(Rewards.equals("read terms")||Rewards.equals("read the terms")){
                    //update preferences
                    editor.putBoolean("answer3", true);
                    //checks if all questions are answered
                    if (sp.getBoolean("answer1", false) && sp.getBoolean("answer2", false)) {
                        //update preferences
                        editor.putInt("creditLesson", 2);
                        editor.putBoolean("credit", true);
                        editor.commit();
                        //send to lesson complete page
                        Intent intent = new Intent(Quiz_1_1_2.this, LessonComplete.class);
                        startActivity(intent);}
                }
                else{
                    // send to lesson page
                    Intent intent = new Intent(Quiz_1_1_2.this, LessonTwoCredit.class );
                    startActivity(intent);
                }
                editor.apply();
            }
        });


    }}
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1_1_2);

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_1_2.this, HomePage.class );
                startActivity(intent);
            }
        });
        CashbackShortAnswer = findViewById(R.id.cashback);
        submitCashback = findViewById(R.id.cashback_enter);

        submitCashback.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("ApplySharedPref")
            @Override
            public void onClick(View view){
                Cashback = CashbackShortAnswer.getText().toString();

                if(Cashback.equals("correct answer")){
                    editor.putBoolean("answer1", true);
                    if (sp.getBoolean("answer2", false) && sp.getBoolean("answer3", false)) {
                        editor.putInt("creditLesson", 2);
                        editor.putBoolean("credit", true);
                        editor.commit();
                        Intent intent = new Intent(Quiz_1_1_2.this, LessonComplete.class);
                        startActivity(intent);}
                }
                else{
                    Intent intent = new Intent(Quiz_1_1_2.this, LessonTwoCredit.class );
                    startActivity(intent);
                }
                editor.apply();
            }
        });

        LimitsShortAnswer = findViewById(R.id.limits);
        submitLimits = findViewById(R.id.limits_enter);

        submitLimits.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("ApplySharedPref")
            @Override
            public void onClick(View view){
                Limits = LimitsShortAnswer.getText().toString();

                if(Limits.equals("sample")){
                    editor.putBoolean("answer2", true);
                    if (sp.getBoolean("answer1", false) && sp.getBoolean("answer3", false)) {
                        editor.putInt("creditLesson", 2);
                        editor.putBoolean("credit", true);
                        editor.commit();
                        Intent intent = new Intent(Quiz_1_1_2.this, LessonComplete.class);
                        startActivity(intent);}
                }
                else{
                    Intent intent = new Intent(Quiz_1_1_2.this, LessonTwoCredit.class );
                    startActivity(intent);
                }
                editor.apply();
            }
        });

        RewardsShortAnswer = findViewById(R.id.rewards);
        submitRewards = findViewById(R.id.rewards_enter);
        submitRewards.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("ApplySharedPref")
            @Override
            public void onClick(View view){
                Rewards = RewardsShortAnswer.getText().toString();

                if(Rewards.equals("example")){
                    editor.putBoolean("answer3", true);
                    if (sp.getBoolean("answer1", false) && sp.getBoolean("answer2", false)) {
                        editor.putInt("creditLesson", 2);
                        editor.putBoolean("credit", true);
                        editor.commit();
                        Intent intent = new Intent(Quiz_1_1_2.this, LessonComplete.class);
                        startActivity(intent);}
                }
                else{
                    Intent intent = new Intent(Quiz_1_1_2.this, LessonTwoCredit.class );
                    startActivity(intent);
                }
                editor.apply();
            }
        });


    }}
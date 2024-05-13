package com.example.ask_mainreal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LessonComplete extends AppCompatActivity {
    // Declaring buttons and SharedPreferences object
    Button home;
    Button next_lesson;
    Button explore;
    Button back;
    SharedPreferences sp;
    @Override
    /*
     Set content view to  lesson_complete page
     set on click listeners for each button
     */
    protected void onCreate(Bundle savedInstanceState) {
        // Initialize SharedPreferences
        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        //set content view
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_complete);

        // set up button using id in xml code
        home = findViewById(R.id.home);
        /*
        set the onClickListener for the home button
         Navigate to HomePage class
         */
        home.setOnClickListener(new View.OnClickListener(){
            /*
            This activates when the home button is clicked and starts the HomePage java class which opens the apps home page.
             */
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LessonComplete.this, HomePage.class );
                startActivity(intent);}
        });

        // set up button using id in xml code
        explore = findViewById(R.id.explore);
        /*
        set the onClickListener for the explore other topics button
        This activates when the explore other topics button is clicked
         then starts the Module explorer java class, labeled Test, which opens the apps starting page with the list of available modules.
         */
        explore.setOnClickListener(new View.OnClickListener(){
        @Override
            public void onClick(View view){
                Intent intent = new Intent(LessonComplete.this, Test.class );
                startActivity(intent);}
        });

        // set up button using id in xml code
        next_lesson = findViewById(R.id.next_lesson);
        next_lesson.setOnClickListener(new View.OnClickListener(){
            /*
            This activates when the start next lesson button is clicked
            It checks shared preferences for the booleans representing each lesson
            when it finds the first false boolean it checks what the specific lesson integer is and opens the corresponding lesson page.
             */
            @Override
            public void onClick(View view){
                // Getting the credit lesson boolean from SharedPreferences and checking if false
                if (!sp.getBoolean("credit", false)){
                    // Getting the credit lesson status from SharedPreferences
                    int lesson = sp.getInt("creditLesson", 0);
                    // Starting a new activity based on lesson status
                    if(lesson ==0){
                        Intent intent = new Intent(LessonComplete.this, LessonOneCredit.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(LessonComplete.this, LessonTwoCredit.class);
                        startActivity(intent);}}
                // Getting the debit lesson boolean from SharedPreferences and checking if false
                else if (!sp.getBoolean("debit", false)){
                    // Getting the dedit lesson status from SharedPreferences
                    int lesson = sp.getInt("debitLesson", 0);
                    // Starting a new activity based on lesson status
                    if(lesson ==0){
                        Intent intent = new Intent(LessonComplete.this, Lesson_1_2_1.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(LessonComplete.this, Lesson_1_2_2.class);
                        startActivity(intent);}
                    else if(lesson ==2){
                        Intent intent = new Intent(LessonComplete.this, Lesson_1_2_3.class);
                        startActivity(intent);}}
                // Getting the cash lesson boolean from SharedPreferences and checking if false
                else if (!sp.getBoolean("cash", false)){
                        Intent intent = new Intent(LessonComplete.this,Lesson_1_3_1.class);
                        startActivity(intent);}
                // Getting the credit score lesson boolean from SharedPreferences and checking if false
                else if (!sp.getBoolean("creditScore", false)){
                    // Getting the credit score lesson status from SharedPreferences
                    int lesson = sp.getInt("creditScoreLesson", 0);
                    // Starting a new activity based on lesson status
                    if(lesson ==0){
                        Intent intent = new Intent(LessonComplete.this, Lesson_1_4_1.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(LessonComplete.this, Lesson_1_4_2.class);
                        startActivity(intent);}
                    else if(lesson==2){
                        Intent intent = new Intent(LessonComplete.this, Lesson_1_4_3.class);
                        startActivity(intent);}
                    else{
                        Intent intent = new Intent(LessonComplete.this, ModuleComplete.class);
                        startActivity(intent);
                    }
                }
            }
        });

        // set up button using id in xml code
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            /*
            This activates when the start next lesson button is clicked
            It checks shared preferences for the booleans representing each lesson
            when it finds the first false boolean it checks what the specific lesson integer is,
            the code will then set the lesson back to two lessons adjusting the lesson booleans and integers in Shared Preferences when necessary.
            It will go to the lesson just before the one that was last completed.
            After completing the first credit lesson this button will just reset to the first credit lesson.
             */
            @Override
            public void onClick(View view){
                // Getting the credit lesson boolean from SharedPreferences and checking if false
                if (!sp.getBoolean("credit", false)){
                    // Getting the credit lesson status from SharedPreferences
                    int lesson = sp.getInt("creditLesson", 0);
                    // Starting a new activity based on lesson status
                    if(lesson ==0){
                        Intent intent = new Intent(LessonComplete.this, LessonOneCredit.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        editor.putInt("creditLesson", 0);
                        editor.commit();
                        Intent intent = new Intent(LessonComplete.this, LessonOneCredit.class);
                        startActivity(intent);}}
                // Getting the debit lesson boolean from SharedPreferences and checking if false
                else if (!sp.getBoolean("debit", false)){
                    // Getting the debit lesson status from SharedPreferences
                    int lesson = sp.getInt("debitLesson", 0);
                    // Starting a new activity based on lesson status
                    if(lesson ==0){
                        editor.putInt("creditLesson", 0);
                        editor.putBoolean("credit", false);
                        editor.commit();
                        Intent intent = new Intent(LessonComplete.this, LessonOneCredit.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        editor.putInt("creditLesson", 1);
                        editor.putBoolean("credit", false);
                        editor.commit();
                        Intent intent = new Intent(LessonComplete.this, LessonTwoCredit.class);
                        startActivity(intent);}
                    else if(lesson==2){
                        editor.putInt("debitLesson", 0);
                        editor.commit();
                        Intent intent = new Intent(LessonComplete.this, Lesson_1_2_1.class);
                        startActivity(intent);}}
                // Getting the cash lesson boolean from SharedPreferences and checking if false
                else if (!sp.getBoolean("cash", false)){
                    // Starting a new activity based on lesson boolean status
                    editor.putInt("debitLesson", 1);
                    editor.putBoolean("debit", false);
                    editor.commit();
                    Intent intent = new Intent(LessonComplete.this,Lesson_1_2_2.class);
                    startActivity(intent);}
                // Getting the credit score lesson boolean from SharedPreferences and checking if false
                else if (!sp.getBoolean("credit", false)){
                    // Getting the credit lesson status from SharedPreferences
                    int lesson = sp.getInt("creditScoreLesson", 0);
                    // Starting a new activity based on lesson status
                    if(lesson ==0){
                        editor.putInt("debitLesson", 2);
                        editor.putBoolean("debit", false);
                        editor.putBoolean("cash", false);
                        editor.commit();
                        Intent intent = new Intent(LessonComplete.this, Lesson_1_2_3.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        editor.putBoolean("cash", false);
                        editor.commit();
                        Intent intent = new Intent(LessonComplete.this, Lesson_1_3_1.class);
                        startActivity(intent);}
                    else if(lesson==2){
                        editor.putInt("creditScoreLesson", 0);
                        editor.commit();
                        Intent intent = new Intent(LessonComplete.this, Lesson_1_4_1.class);
                        startActivity(intent);}}
            }
        });

    }
}
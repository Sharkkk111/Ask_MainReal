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

    Button home;
    Button next_lesson;
    Button explore;
    Button back;
    SharedPreferences sp;
    @Override
    /*
    This opens the Lesson Complete page and contains the classes for the three buttons on that page.
     */
    protected void onCreate(Bundle savedInstanceState) {
        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_complete);

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener(){
            /*
            This activates when the home button is clicked and starts the HomePage java class which opens the apps home page.
             */
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LessonComplete.this, HomePage.class );
                startActivity(intent);}
        });
        explore = findViewById(R.id.explore);
        explore.setOnClickListener(new View.OnClickListener(){
            /*
            This activates when the explore other topics button is clicked and starts the Module explorer java class, labeled Test, which opens the apps starting page with the list of available modules.
             */
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LessonComplete.this, Test.class );
                startActivity(intent);}
        });
        next_lesson = findViewById(R.id.next_lesson);
        next_lesson.setOnClickListener(new View.OnClickListener(){
            /*
            This activates when the start next lesson button is clicked and checks shared preferences for the booleans representing each lesson then when it finds the first false boolean it checks what the specific lesson integer is and opens the corresponding lesson page.
             */
            @Override
            public void onClick(View view){
                if (!sp.getBoolean("credit", false)){
                    int lesson = sp.getInt("creditLesson", 0);
                    if(lesson ==0){
                        Intent intent = new Intent(LessonComplete.this, LessonOneCredit.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(LessonComplete.this, LessonTwoCredit.class);
                        startActivity(intent);}}
                else if (!sp.getBoolean("debit", false)){
                    int lesson = sp.getInt("debitLesson", 0);
                    if(lesson ==0){
                        Intent intent = new Intent(LessonComplete.this, Lesson_1_2_1.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(LessonComplete.this, Lesson_1_2_2.class);
                        startActivity(intent);}
                    else if(lesson==2){
                        Intent intent = new Intent(LessonComplete.this, Test.class);
                        startActivity(intent);}}
                else if (!sp.getBoolean("cash", false)){
                        Intent intent = new Intent(LessonComplete.this,Lesson_1_3_1.class);
                        startActivity(intent);}
                else if (!sp.getBoolean("creditScore", false)){
                    int lesson = sp.getInt("creditScoreLesson", 0);
                    if(lesson ==0){
                        Intent intent = new Intent(LessonComplete.this, Lesson_1_4_1.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        Intent intent = new Intent(LessonComplete.this, Lesson_1_4_2.class);
                        startActivity(intent);}
                    else if(lesson==2){
                        Intent intent = new Intent(LessonComplete.this, Lesson_1_4_3.class);
                        startActivity(intent);}}
            }
        });

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            /*
            This activates when the start next lesson button is clicked and checks shared preferences for the booleans representing each lesson then when it finds the first false boolean it checks what the specific lesson integer is, the code will then set the lesson back to two lessons adjusting the lesson booleans and integers in Shared Preferences when necessary. It will go to the lesson just before the one that was last completed. After completing the first credit lesson this button will just reset to the first credit lesson.
             */
            @Override
            public void onClick(View view){
                if (!sp.getBoolean("credit", false)){
                    int lesson = sp.getInt("creditLesson", 0);
                    if(lesson ==0){
                        Intent intent = new Intent(LessonComplete.this, LessonOneCredit.class);
                        startActivity(intent);}
                    else if(lesson==1){
                        editor.putInt("creditLesson", 0);
                        editor.commit();
                        Intent intent = new Intent(LessonComplete.this, LessonOneCredit.class);
                        startActivity(intent);}}
                else if (!sp.getBoolean("debit", false)){
                    int lesson = sp.getInt("debitLesson", 0);
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
                else if (!sp.getBoolean("cash", false)){
                    editor.putInt("debitLesson", 1);
                    editor.putBoolean("debit", false);
                    editor.commit();
                    Intent intent = new Intent(LessonComplete.this,Lesson_1_2_2.class);
                    startActivity(intent);}
                else if (!sp.getBoolean("credit", false)){
                    int lesson = sp.getInt("creditScoreLesson", 0);
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
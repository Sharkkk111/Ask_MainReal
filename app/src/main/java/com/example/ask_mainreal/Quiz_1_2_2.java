package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_1_2_2 extends AppCompatActivity {
    // declaring UI elements and shared preferences
    Button home;
    Button credit2;
    Button credit3;
    Button credit4;
    Button credit5;
    Button debit2;
    Button debit3;
    Button debit4;
    Button debit5;
    SharedPreferences sp;
    /*
  Set content view to quiz1_2_2
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
        setContentView(R.layout.quiz1_2_2);

        // initialize button using id in xml code
        home = findViewById(R.id.home);
        /*
        set the onClickListener for the home button
         Navigate to HomePage class
         */
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_2.this, HomePage.class );
                startActivity(intent);
            }
        });

        // initialize button using id in xml code
        credit2 = findViewById(R.id.credit2);
        /*
        Set up the click listener for button credit 2
        option credit 2 is correct so it sends the user to the lesson complete page
         */
        credit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //update preferences
                editor.putBoolean("answer2", true);
                editor.commit();
                //check if all questions are answered correctly
                if (sp.getBoolean("answer3", false)&&sp.getBoolean("answer4", false)&&sp.getBoolean("answer5", false)) {
                    //update preferences
                    editor.putInt("debitLesson", 2);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_2_2.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });

        // initialize button using id in xml code
        debit2 = findViewById(R.id.debit2);
        /*
        Set up the click listener for button debit 2
        option debit 2 is not correct so it sends the user back to the lesson
         */
        debit2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_2.this, Lesson_1_2_2.class );
                startActivity(intent);
            }
        });

        // initialize button using id in xml code
        credit3 = findViewById(R.id.credit3);
        /*
        Set up the click listener for button credit 3
        option credit 3 is correct so it sends the user to the lesson complete page
         */
        credit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //update preferences
                editor.putBoolean("answer3", true);
                editor.commit();
                //check if all questions are answered correctly
                if (sp.getBoolean("answer2", false)&&sp.getBoolean("answer4", false)&&sp.getBoolean("answer5", false)) {
                    //update preferences
                    editor.putInt("debitLesson", 2);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_2_2.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });

        // initialize button using id in xml code
        debit3 = findViewById(R.id.debit3);
        /*
        Set up the click listener for button debit 3
        option debit 3 is not correct so it sends the user back to the lesson
         */
        debit3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_2.this, Lesson_1_2_2.class );
                startActivity(intent);
            }
        });

        // initialize button using id in xml code
        debit4 = findViewById(R.id.debit4);
        /*
        Set up the click listener for button debit 4
        option debit 4 is correct so it sends the user to the lesson complete page
         */
        debit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //update preferences
                editor.putBoolean("answer4", true);
                editor.commit();
                //check if all questions are answered correctly
                if (sp.getBoolean("answer2", false)&&sp.getBoolean("answer3", false)&&sp.getBoolean("answer5", false)) {
                    //update preferences
                    editor.putInt("debitLesson", 2);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_2_2.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });

        // initialize button using id in xml code
        credit4 = findViewById(R.id.credit4);
        /*
        Set up the click listener for button credit 4
        option credit 4 is not correct so it sends the user back to the lesson
         */
        credit4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_2.this, Lesson_1_2_2.class );
                startActivity(intent);
            }
        });

        // initialize button using id in xml code
        credit5 = findViewById(R.id.credit5);
        /*
        Set up the click listener for button credit 5
        option credit 5 is correct so it sends the user to the lesson complete page
         */
        credit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //update preferences
                editor.putBoolean("answer5", true);
                editor.commit();
                //check if all questions are answered correctly
                if (sp.getBoolean("answer2", false)&&sp.getBoolean("answer3", false)&&sp.getBoolean("answer4", false)) {
                    //update preferences
                    editor.putInt("debitLesson", 2);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_2_2.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });

        // initialize button using id in xml code
        debit5 = findViewById(R.id.debit5);
        /*
        Set up the click listener for button debit 5
        option debit 5 is not correct so it sends the user back to the lesson
         */
        debit5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_2.this, Lesson_1_2_2.class );
                startActivity(intent);
            }
        });



    }
}
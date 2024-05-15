package com.example.ask_mainreal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_1_4_1 extends AppCompatActivity {
    // declaring UI elements and shared preferences and a string to temporarily store user input
    Button a;
    Button b;
    Button c;
    Button d;
    Button submit;
    EditText ShortAnswer;
    SharedPreferences sp;
    String ShortAnswerStr;
    Button home;
    /*
   Set content view to quiz1_4_1
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
        setContentView(R.layout.quiz1_4_1);

        // initialize button using id in xml code
        home = findViewById(R.id.home);
         /*
        set the onClickListener for the home button
         Navigate to HomePage class
         */
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_4_1.this, HomePage.class );
                startActivity(intent);

            }
        });

        // Short answer text field initialization using id from xml code
        ShortAnswer = findViewById(R.id.editText);
        // initialize button using id in xml code
        submit = findViewById(R.id.enter);

         /*
        set on click lister for the submit answer button
        when button is clicked it puts the user short answer edit text into a string and checks if it is equal to the actual answer
            if it is equal and all other answers are true it sends the user to the lesson complete page
            if it is equal but not all other questions have been answered it updates preferences
            if not it sends the user back to the lesson page
         */
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //set to string
                ShortAnswerStr = ShortAnswer.getText().toString();
                //remove all dashes and spaces from answer
                ShortAnswerStr = ShortAnswerStr.replaceAll("\\s|-", "");
                ShortAnswerStr  = ShortAnswerStr.replaceAll("\\s| ", "");

                //checks if answer is correct
                if(ShortAnswerStr.equals("300850")){
                    //update preferences
                    editor.putBoolean("answer1", true);
                    //checks if all questions are answered correctly
                    if (sp.getBoolean("answer2", false)) {
                        //update preferences
                        editor.putInt("creditScoreLesson", 1);
                        editor.commit();
                        Intent intent = new Intent(Quiz_1_4_1.this, LessonComplete.class);
                        startActivity(intent);}
                }
                else{
                    // send to lesson page
                    Intent intent = new Intent(Quiz_1_4_1.this, Lesson_1_4_1.class );
                    startActivity(intent);
                }
                editor.apply();
            }
        });

        // initialize button using id in xml code
        a = findViewById(R.id.a);
         /*
        Set up the click listener for button a
        option a is not correct so it sends the user back to the lesson
         */
        a.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_4_1.this, Lesson_1_4_1.class);
                startActivity(intent);
            }
        });

        // initialize button using id in xml code
        b = findViewById(R.id.b);
         /*
        Set up the click listener for button b
        option b is not correct so it sends the user back to the lesson
         */
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_4_1.this, Lesson_1_4_1.class );
                startActivity(intent);
            }
        });

        // initialize button using id in xml code
        d = findViewById(R.id.d);
         /*
        Set up the click listener for button d
        option d is not correct so it sends the user back to the lesson
         */
        d.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_4_1.this, Lesson_1_4_1.class);
                startActivity(intent);
            }
        });

        // initialize button using id in xml code
        c = findViewById(R.id.c);
         /*
        Set up the click listener for button c
        option c is correct so it sends the user to the lesson complete page
         */
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //update preferences
                editor.putBoolean("answer2", true);
                editor.commit();
                //check if all questions are answered correctly
                if (sp.getBoolean("answer1", false)) {
                    //update preferences
                    editor.putInt("creditScoreLesson", 1);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_4_1.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });
    }}
package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_1_2_3 extends AppCompatActivity {
    // declaring UI elements and shared preferences
    Button home;
    Button true1;
    Button false1;
    Button true2;
    Button false2;
    Button true3;
    Button false3;
    SharedPreferences sp;

    /*
Set content view to quiz1_2_3
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
        setContentView(R.layout.quiz1_2_3);

        // initialize button using id in xml code
        home = findViewById(R.id.home);
        /*
        set the onClickListener for the home button
         Navigate to HomePage class
         */
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_3.this, HomePage.class );
                startActivity(intent);
            }
        });


        // initialize button using id in xml code
        true1 = findViewById(R.id.true1);
       /*
        Set up the click listener for button true 1
        option true 1 is not correct so it sends the user back to the lesson
         */
        true1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_3.this, Lesson_1_2_3.class );
                startActivity(intent);
            }
        });

        // initialize button using id in xml code
        false1 = findViewById(R.id.false1);
        /*
        Set up the click listener for button false 1
        option false 1 is correct so it sends the user to the lesson complete page
         */
        false1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //update preferences
                editor.putBoolean("answer1", true);
                editor.commit();
                //check if all questions are answered correctly
                if (sp.getBoolean("answer2", false)&&sp.getBoolean("answer3", false)) {
                    //update preferences
                    editor.putInt("debitLesson", 3);
                    editor.putBoolean("debit", true);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_2_3.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });

        // initialize button using id in xml code
        false2 = findViewById(R.id.false2);
        /*
        Set up the click listener for button false 2
        option false 2 is not correct so it sends the user back to the lesson
         */
        false2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_3.this, Lesson_1_2_3.class );
                startActivity(intent);
            }
        });

        // initialize button using id in xml code
        true2 = findViewById(R.id.true2);
        /*
        Set up the click listener for button true 2
        option true 2 is correct so it sends the user to the lesson complete page
         */
        true2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //update preferences
                editor.putBoolean("answer2", true);
                editor.commit();
                //check if all questions are answered correctly
                if (sp.getBoolean("answer1", false)&&sp.getBoolean("answer3", false)) {
                    //update preferences
                    editor.putInt("debitLesson", 3);
                    editor.putBoolean("debit", true);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_2_3.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });

        // initialize button using id in xml code
        true3 = findViewById(R.id.true3);
        /*
        Set up the click listener for button true 3
        option true 3 is not correct so it sends the user back to the lesson
         */
        true3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_2_3.this, Lesson_1_2_3.class );
                startActivity(intent);
            }
        });

        // initialize button using id in xml code
        false3 = findViewById(R.id.false3);
        /*
        Set up the click listener for button false 3
        option false 3 is correct so it sends the user to the lesson complete page
         */
        false3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //update preferences
                editor.putBoolean("answer3", true);
                editor.commit();
                //check if all questions are answered correctly
                if (sp.getBoolean("answer2", false)&&sp.getBoolean("answer1", false)) {
                    //update preferences
                    editor.putInt("debitLesson", 3);
                    editor.putBoolean("debit", true);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_2_3.this, LessonComplete.class);
                    startActivity(intent);
                }
            }
        });
    }
}
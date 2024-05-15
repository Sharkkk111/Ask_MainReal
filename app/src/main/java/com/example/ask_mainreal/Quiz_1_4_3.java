package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_1_4_3 extends AppCompatActivity {
    // declaring UI elements and shared preferences
    Button home;
    Button true1;
    Button false1;
    SharedPreferences sp;
    Button a;
    Button b;
    Button c;
    Button d;
    /*
   Set content view to quiz1_4_3
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
        setContentView(R.layout.quiz1_4_3);

        // initialize button using id in xml code
        home = findViewById(R.id.home);
        /*
        set the onClickListener for the home button
         Navigate to HomePage class
         */
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_4_3.this, HomePage.class );
                startActivity(intent);
            }
        });

        // initialize button using id in xml code
        false1 = findViewById(R.id.false1);
        /*
        Set up the click listener for button false 1
        option false 1 is not correct so it sends the user back to the lesson
         */
        false1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Quiz_1_4_3.this, Lesson_1_4_3.class );
                startActivity(intent);
            }
        });

        // initialize button using id in xml code
        true1 = findViewById(R.id.true1);
         /*
        Set up the click listener for button true 1
        option true 1 is correct so it sends the user to the lesson complete page
         */
        true1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //update preferences
                editor.putBoolean("answer1", true);
                editor.commit();
                //check if all questions are answered correctly
                if (sp.getBoolean("answer2", false)) {
                    //update preferences
                    editor.putInt("creditScoreLesson", 3);
                    editor.putBoolean("creditScore", true);
                    editor.commit();
                    Intent intent = new Intent(Quiz_1_4_3.this, ModuleComplete.class);
                    startActivity(intent);
                }
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
                    Intent intent = new Intent(Quiz_1_4_3.this, Lesson_1_4_3.class );
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
                    Intent intent = new Intent(Quiz_1_4_3.this, Lesson_1_4_3.class  );
                    startActivity(intent);
                }
            });

        // initialize button using id in xml code
        c = findViewById(R.id.c);
         /*
        Set up the click listener for button c
        option c is not correct so it sends the user back to the lesson
         */
        c.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent intent = new Intent(Quiz_1_4_3.this, Lesson_1_4_3.class );
                    startActivity(intent);
                }
            });

        // initialize button using id in xml code
        d = findViewById(R.id.d);
         /*
        Set up the click listener for button d
        option d is correct so it sends the user to the lesson complete page
         */
        d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //update preferences
                    editor.putBoolean("answer2", true);
                    editor.commit();
                    //check if all questions are answered correctly
                    if (sp.getBoolean("answer1", false)) {
                        //update preferences
                        editor.putInt("creditScoreLesson", 2);
                        editor.commit();
                        Intent intent = new Intent(Quiz_1_4_3.this, ModuleComplete.class);
                        startActivity(intent);
                    }
                }
            });
    }
}
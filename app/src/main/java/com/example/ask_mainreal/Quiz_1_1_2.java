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
    Button submit;
    EditText ShortAnswer;
    SharedPreferences sp;
    String ShortAnswerStr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sp = getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1_1_1);

        ShortAnswer = findViewById(R.id.editText);
        submit = findViewById(R.id.enter);

        submit.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("ApplySharedPref")
            @Override
            public void onClick(View view){
                ShortAnswerStr = ShortAnswer.getText().toString();

                if(ShortAnswerStr.equals("correct answer")){
                    editor.putBoolean("answer1", true);
                    if (sp.getBoolean("answer2", false)) {
                        editor.putInt("creditLesson", 1);
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
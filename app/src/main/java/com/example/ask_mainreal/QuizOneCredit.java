package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
public class QuizOneCredit extends AppCompatActivity{
    Button choice;
    Button submit;
    EditText ShortAnswer;
    SharedPreferences sp;
    String ShortAnswerStr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1_1_1);

    ShortAnswer = findViewById(R.id.editText);
    submit = findViewById(R.id.enter);

    sp = getSharedPreferences("MyUserPreferences", Context.MODE_PRIVATE);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ShortAnswerStr = ShortAnswer.getText().toString();

                SharedPreferences.Editor editor = sp.edit();

                editor.putString("answer", ShortAnswerStr);
                editor.apply();


            }
        });

    }
}

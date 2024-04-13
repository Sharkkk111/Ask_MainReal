package com.example.ask_mainreal;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Test extends AppCompatActivity {

    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.button_front_page);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Test.this, MainActivityThree.class );
                startActivity(intent);
            }
        });
         button2 = findViewById(R.id.home);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Test.this, LessonOneCredit.class );
                startActivity(intent);
            }
        });
    }
}

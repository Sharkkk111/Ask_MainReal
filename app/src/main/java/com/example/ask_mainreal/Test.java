package com.example.ask_mainreal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Test extends AppCompatActivity {
    // Declaring buttons
    Button button1;
    Button home;
    /*
    Set content view to lesson 1_3_1
    set on click listeners for each button
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //set content view
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set up button using id in xml code
        button1=findViewById(R.id.button_front_page);
        /*
        set the onClickListener for the credit, debit, cash module button
         Navigate to MainActivityThree class
         */
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Test.this, MainActivityThree.class );
                startActivity(intent);
            }
        });

        // set up button using id in xml code
        home = findViewById(R.id.home);
        /*
        set the onClickListener for the home button
         Navigate to HomePage class
         */
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Test.this, HomePage.class );
                startActivity(intent);
            }
        });
    }
}

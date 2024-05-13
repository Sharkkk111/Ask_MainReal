package com.example.ask_mainreal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ModuleComplete extends AppCompatActivity {
    // Declaring buttons
    Button home;
    Button explore;
    @Override
    /*
     Set content view to  lesson_complete page
     set on click listeners for each button
     */
    protected void onCreate(Bundle savedInstanceState) {

        //set content view
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_complete);

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
                Intent intent = new Intent(ModuleComplete.this, HomePage.class );
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
                Intent intent = new Intent(ModuleComplete.this, Test.class );
                startActivity(intent);}
        });

    }
}
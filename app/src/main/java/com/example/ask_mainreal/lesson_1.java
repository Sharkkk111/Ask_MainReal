package com.example.ask_mainreal;
<<<<<<< HEAD

import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

=======
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

>>>>>>> origin/shaurya
public class lesson_1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(R.layout.lesson_1);}

        final VideoView videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoPath();
        videoView.start();

=======
        VideoView videoView = (VideoView) findViewById(R.id.videoView);  //casting to VideoView is not Strictly required above API level 26
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.how_do_credit_cards_work); //set the path of the video that we need to use in our VideoView
        videoView.start();  //start() method of the VideoView class will start the video to play
        MediaController mediaController = new MediaController(this);
//link mediaController to videoView
        mediaController.setAnchorView(videoView);
//allow mediaController to control our videoView
        videoView.setMediaController(mediaController);
        setContentView(R.layout.lesson_1);


    }
>>>>>>> origin/shaurya
}
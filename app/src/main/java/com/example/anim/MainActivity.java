package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


        private AnimationDrawable mAnimationDrawable;

        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);

            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.animation);

            mAnimationDrawable = (AnimationDrawable) imageView.getBackground();

            final Button btnStart = findViewById(R.id.buttonStart);
            btnStart.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    mAnimationDrawable.start();
                }
            });

            final Button btnStop = findViewById(R.id.buttonStop);
            btnStop.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    mAnimationDrawable.stop();
                }
            });
        }
    }

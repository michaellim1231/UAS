package com.example.uasprogtech;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Type;


public class WelcomeActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN = 5000;
    Animation topAnimaton,  botAnimation;
    ImageView image1;
    TextView image2;
    ProgressBar loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_start_up);

        //animasi
        topAnimaton = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        botAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //hooks
        image1 = findViewById(R.id.logo);
        image2 = findViewById(R.id.text_queasy);
        loading = findViewById(R.id.loading_bar);

        image1.setAnimation(topAnimaton);
        image2.setAnimation(botAnimation);
        loading.setAnimation(botAnimation);

        TextView textView = (TextView) findViewById(R.id.text_queasy);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"font/Good Morning.ttf");
        textView.setTypeface(typeface);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(WelcomeActivity.this, Main2Activity.class);
                    startActivity(intent);

                }
            }
        };
        timerThread.start();
    }


    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}

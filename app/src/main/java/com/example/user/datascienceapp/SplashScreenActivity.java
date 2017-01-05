package com.example.user.datascienceapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        final ProgressBar progress = (ProgressBar) findViewById(R.id.ProgressBar01);
        Drawable loginActivityBackground = findViewById(R.id.splash).getBackground();
        loginActivityBackground.setAlpha(100);

        progress.setIndeterminate(true);
        // Splash screen timer
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {

               /* FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("cards");
                list1 = create_databean_list.create_list();

                Iterator<DataBean> iterator=list1.iterator();
                while(iterator.hasNext()){
                    DataBean temp=iterator.next();
                    myRef.child("id_"+temp.getId()).setValue(temp);
                }*/
                // This method will be executed once the timer is over
                // Start your app main activity

                Intent i = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(i);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
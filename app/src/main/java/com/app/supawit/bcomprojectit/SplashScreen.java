package com.app.supawit.bcomprojectit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class SplashScreen extends Activity {
    Handler handler;
    Runnable runnable;
    long delay_time;
    long time = 3000L;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);


        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, Login.class);
                startActivity(intent);
                finish();
            }
        };
    }


        public void onResume() {
            super.onResume();
            delay_time = time;
            handler.postDelayed(runnable, delay_time);
            time = System.currentTimeMillis();
        }

        public void onPause() {
            super.onPause();
            handler.removeCallbacks(runnable);
            time = delay_time - (System.currentTimeMillis() - time);
        }



}

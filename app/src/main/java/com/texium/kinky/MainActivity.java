package com.texium.kinky;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                checkValidSession();
                finish();
            }
        }, 3000);
    }

    private void checkValidSession() {
        //TODO CHECK SESSION
        boolean valid = false;
        openActivity((valid) ? NavigationDrawerActivity.class : LoginActivity.class);
    }

    private void openActivity(Class<?> cls) {
        Intent mainActivity = new Intent(MainActivity.this, cls);
        startActivity(mainActivity);
        finish();
    }
}

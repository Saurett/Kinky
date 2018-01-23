package com.texium.kinky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = this.getClass().getName();

    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btnBack = findViewById(R.id.btn_back);

        btnBack.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_back:
                openActivity(LoginActivity.class);
                break;
        }
    }

    private void openActivity(Class<?> cls) {
        Intent mainActivity = new Intent(this.getApplicationContext(), cls);
        startActivity(mainActivity);
        finish();
    }
}

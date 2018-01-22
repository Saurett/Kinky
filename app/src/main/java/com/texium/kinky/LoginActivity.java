package com.texium.kinky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = LoginActivity.class.getSimpleName();

    private Button btnLogin, btnReset, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_login);
        btnReset = findViewById(R.id.btn_reset_password);
        btnSignup = findViewById(R.id.btn_signup);

        btnLogin.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        btnSignup.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                openActivity(NavigationDrawerActivity.class);
                break;
            case R.id.btn_reset_password:
                openActivity(ResetPasswordActivity.class);
                break;
            case R.id.btn_signup:
                openActivity(SignupActivity.class);
                break;
        }
    }

    private void openActivity(Class<?> cls) {
        Intent mainActivity = new Intent(LoginActivity.this, cls);
        startActivity(mainActivity);
        finish();
    }
}

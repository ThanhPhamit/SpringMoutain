package com.example.springmoutain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class MainScreenActivity extends AppCompatActivity {
    LinearLayout btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setControl() {
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnSignup);
    }

    private void setEvent() {
//        Login button
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreenActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
// Sign up Button
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreenActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
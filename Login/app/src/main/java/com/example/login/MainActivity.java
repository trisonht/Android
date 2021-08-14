package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void login(View view) {
        EditText usernameEditText = findViewById(R.id.usernameEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        Log.i("Info","Login starting");
        Log.i("Username", usernameEditText.getText().toString());
        Log.i("Password", passwordEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
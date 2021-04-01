package com.ikhwan.emergencyapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.ikhwan.emergencyapp.R;

public class LoginActivity extends AppCompatActivity {

    Button login;
    TextInputEditText name, email, password;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login_layout);

        login = (Button) findViewById(R.id.btnLogin);
        name = (TextInputEditText) findViewById(R.id.etName);
        email = (TextInputEditText) findViewById(R.id.etEmail);
        password = (TextInputEditText) findViewById(R.id.etPassword);
    }

    public void btnLogin(View view) {
        if (password.getText().toString().toLowerCase().equals("admin")) {
            login_success();
        } else {
            Toast.makeText(getApplicationContext(), "Wrong Password!", Toast.LENGTH_SHORT).show();
        }
    }

    private void login_success() {
        Intent i = new Intent(this, MainActivity.class);

        i.putExtra("name", name.getText().toString());
        i.putExtra("email", email.getText().toString());

        startActivity(i);
    }
}

package com.block.addoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    Button button;
    EditText phone, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button = findViewById(R.id.button);
        phone = findViewById(R.id.editTextPhone);
        email = findViewById(R.id.editTextEmail);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(login.this, "Yay you are awesome!!", Toast.LENGTH_SHORT).show();
                String p = phone.getText().toString();
                long phone = Long.parseLong(p);
                String e = email.getText().toString();
                openMainActivity4();

            }
        });
    }

    public void openMainActivity4() {
        Intent intent = new Intent(this, otp.class);
        startActivity(intent);
    }
}
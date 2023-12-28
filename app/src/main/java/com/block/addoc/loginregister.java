package com.block.addoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class loginregister extends AppCompatActivity {
    Button button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginregister);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlogin();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openregister();
            }
        });
    }
    public void openlogin(){
        Intent intent = new Intent(loginregister.this, login.class);
        startActivity(intent);
    }
    public void openregister() {
        Intent intent1 = new Intent(this, register.class);
        startActivity(intent1);
    }
}
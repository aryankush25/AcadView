package com.example.aryanagarwal.regestrationapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        Button button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int dur = Toast.LENGTH_SHORT;
                Toast t = Toast.makeText(getApplicationContext(), "Login Sucessful", dur);
                t.show();
            }
        });

    }
}

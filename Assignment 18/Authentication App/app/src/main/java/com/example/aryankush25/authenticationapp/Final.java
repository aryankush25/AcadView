package com.example.aryankush25.authenticationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Bundle extras = getIntent().getExtras();
        String id = extras.getString("id");
        TextView message = findViewById(R.id.message);
        message.setText("Welcome " + id);
    }
}

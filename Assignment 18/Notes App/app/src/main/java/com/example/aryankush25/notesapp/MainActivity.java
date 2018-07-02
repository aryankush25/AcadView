package com.example.aryankush25.notesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addNotes = findViewById(R.id.addNotes);
        Button viewNotes = findViewById(R.id.viewNotes);

        addNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addIntent = new Intent(getApplicationContext(), AddNotes.class);
                startActivity(addIntent);
            }
        });

        viewNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent(getApplicationContext(), ViewNotes.class);
                startActivity(viewIntent);
            }
        });
    }
}

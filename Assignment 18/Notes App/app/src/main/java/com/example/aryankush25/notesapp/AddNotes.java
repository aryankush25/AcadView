package com.example.aryankush25.notesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddNotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notes);

        Button add = findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText note = findViewById(R.id.note);
                String value = note.getText().toString();
                note.setText("");
                DBActivity db = new DBActivity(getApplicationContext());

                db.AddNote(value);
            }
        });
    }
}

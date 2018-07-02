package com.example.aryankush25.authenticationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DBActivity db = new DBActivity(getApplicationContext());

        Button button = (Button) findViewById(R.id.button);

        Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView message = (TextView) findViewById(R.id.message);
                EditText userid = (EditText) findViewById(R.id.userid);
                EditText password = (EditText) findViewById(R.id.password);

                if(userid.getText().toString().compareTo("") != 0 &&
                        password.getText().toString().compareTo("") != 0) {

                    message.setText("");

                    //Toast.makeText(getApplicationContext(), userid.getText().toString()+ " " + password.getText().toString(), Toast.LENGTH_SHORT).show();

                    // sharedPreferences.edit().putString(userid.getText().toString(), password.getText().toString()).commit();
                    db.addUser(userid.getText().toString(), password.getText().toString());
                    userid.setText("");
                    password.setText("");
                    Intent intent = new Intent(getApplicationContext(), Login.class);
                    startActivity(intent);


                }else {

                    message.setText("Invalid Details...");
                }
            }
        });
    }
}

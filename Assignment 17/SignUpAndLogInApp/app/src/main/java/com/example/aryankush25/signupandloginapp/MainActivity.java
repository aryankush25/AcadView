package com.example.aryankush25.signupandloginapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String id,password;
    EditText mail;
    EditText pass;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mail = findViewById(R.id.editText5);
        pass = findViewById(R.id.editText6);
        signUp = findViewById(R.id.button4);

        mail.setText("");
        pass.setText("");

        final SharedPreferences sharedPreferences = this.getSharedPreferences("details", Context.MODE_PRIVATE);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                id = mail.getText().toString();
                password = pass.getText().toString();

                if(id.compareTo(" ") == 0 && password.compareTo(" ")==0)
                {
                    Toast.makeText(getApplicationContext(),"Enter your Details",Toast.LENGTH_LONG).show();
                }
                else{
                    sharedPreferences.edit().putString(id, password).commit();

                    Intent intent = new Intent(MainActivity.this, Login.class);
                    mail.setText("");
                    pass.setText("");
                    startActivity(intent);
                }
            }

        });
    }
}

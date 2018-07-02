package com.example.aryankush25.authenticationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public abstract class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final DBActivity db = new DBActivity(getApplicationContext());

        Button btn = findViewById(R.id.button);
        final TextView message = (TextView) findViewById(R.id.message);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText userid = findViewById(R.id.userid);
                EditText password = findViewById(R.id.password);
                //String password_actual = sharedPreferences.getString(userid.getText().toString(), "");

                //Toast.makeText(getApplicationContext(), password.getText().toString() + " -> " + password_actual, Toast.LENGTH_SHORT).show();

                if(db.checkAuth(userid.getText().toString(),password.getText().toString() )) {

                    Intent intent = new Intent(getApplicationContext(), Final.class);
                    intent.putExtra("id", userid.getText().toString());
                    userid.setText("");
                    password.setText("");
                    startActivity(intent);
                }else {
                    message.setText("Invalid Details");
                }
            }
        });

    }
}

package com.example.aryanagarwal.toastonlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int dur = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(getApplicationContext(), "Aryan Agarwal", dur);
        t.show();
        t.setGravity(Gravity.CENTER, 0, 0);

    }

}

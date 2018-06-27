package com.example.aryanagarwal.toastonlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int dur = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(getApplicationContext(), "OnCreated", dur);
        t.show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        int dur = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(getApplicationContext(), "OnStart", dur);
        t.show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        int dur = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(getApplicationContext(), "OnPause", dur);
        t.show();

    }

    @Override
    protected void onResume() {
        super.onResume();

        int dur = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(getApplicationContext(), "OnResume", dur);
        t.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        int dur = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(getApplicationContext(), "OnDestroy", dur);
        t.show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        int dur = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(getApplicationContext(), "OnStop", dur);
        t.show();
    }
}

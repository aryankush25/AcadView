package com.example.aryanagarwal.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d( "State",  "OnCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d( "State",  "OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(  "State",  "OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(  "State",  "OnPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d( "State",  "OnDestory()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(  "State",  "OnStop()");
    }

}

package com.bwie.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG ="MainActivity";
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w(LOG_TAG, "==============onCreate()");

        FirstFragment firstFragment = new FirstFragment();
        android.support.v4.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.linearlayout,firstFragment,"firstFragment");
        fragmentTransaction.commit();
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.w(LOG_TAG, "------------------mButton onClick-------------------");
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w(LOG_TAG, "==============onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(LOG_TAG, "==============onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(LOG_TAG, "==============onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(LOG_TAG, "==============onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(LOG_TAG, "==============onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(LOG_TAG, "==============onDestroy()");
    }
}

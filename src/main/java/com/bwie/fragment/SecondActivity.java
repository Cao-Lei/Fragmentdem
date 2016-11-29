package com.bwie.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private static final String LOG_TAG ="SecondActivity";
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.w(LOG_TAG, "==============onCreate()");

        SecondFragment secondFragment = new SecondFragment();
        android.support.v4.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.linearlayout,secondFragment,"secondFragment");
        fragmentTransaction.commit();
        mButton = (Button) findViewById(R.id.button_finish);
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.w(LOG_TAG, "------------------mButton onClick-------------------");
                finish();
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

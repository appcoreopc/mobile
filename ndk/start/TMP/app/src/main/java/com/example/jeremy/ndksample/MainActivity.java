package com.example.jeremy.ndksample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,
                getStringNative(),
                Toast.LENGTH_LONG)
                .show();
    }

    public native String getStringNative();

   static {
        System.loadLibrary("native");
    }
}

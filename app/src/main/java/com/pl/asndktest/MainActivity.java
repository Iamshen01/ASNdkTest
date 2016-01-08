package com.pl.asndktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.pl.asndktest.jni.NdkTest;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    NdkTest test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tv);
        test = new NdkTest();
        tv.setText(test.getStringFromJni());
    }
}

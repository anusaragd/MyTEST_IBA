package com.example.masters.mytest_iba;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class IBEACONActivity extends AppCompatActivity {

    TextView Show;
    String nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibeacon);

        Intent intent = getIntent();
        nameText = intent.getStringExtra(nameText);

//        Log.e("GGG",nameText);

        Show = (TextView) findViewById(R.id.textshow);
//        Show.setText(Build.BRAND + " " + nameText);
        Show.setText(MainActivity.BATTERY_SERVICE);
//        Show.getText().toString();

    }
}

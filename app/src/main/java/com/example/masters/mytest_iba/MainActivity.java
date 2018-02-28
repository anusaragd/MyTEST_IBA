package com.example.masters.mytest_iba;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText nameText ;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  setDeviceNameText();

        nameText = (EditText) findViewById(R.id.nameText);
//        nameText.setText(Build.DEVICE);
        nameText.setText(Build.BRAND + " " + Build.MODEL);

        submitButton = (Button) findViewById(R.id.button_submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,IBEACONActivity.class);
                intent.putExtra(String.valueOf(nameText),"nametext");
                startActivity(intent);
                Toast.makeText(MainActivity.this, nameText.getText().toString() , Toast.LENGTH_LONG).show();

            }
        });



    }


}

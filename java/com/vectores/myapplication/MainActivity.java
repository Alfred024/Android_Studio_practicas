package com.vectores.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button p3, p4,p5,p6,p7,p8;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p3 = (Button)findViewById(R.id.btnP3);
        p4 = (Button)findViewById(R.id.btnP4);
        p5 = (Button)findViewById(R.id.btnP5);
        p6 = (Button)findViewById(R.id.btnP6);
        p7 = (Button)findViewById(R.id.btnP7);
        p8 = (Button)findViewById(R.id.btnP8);

    }

    public void activityButton(View view){
        Intent i = new Intent(this, Button.class);
        startActivity(i);
    }

    public void activityRadioGroup(View view){
        Intent i = new Intent(this, RadioGroup.class);
        startActivity(i);
    }

    public void activityCheckBox(View view){
        Intent i = new Intent(this, Checkbox.class);
        startActivity(i);
    }

}
package com.vectores.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner sp;
    private TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] sp_items = {
                "Click de un botón",
                "Radio Group y Radio Button",
                "CheckBox",
                "Spinner",
                "ListView",
                "Image Button",
                "Toast notification",
                "Control EditText"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sp_items);
        sp.setAdapter(adapter);
    }

    public void activityButton(View view){
        Intent i = new Intent(this, ButtonListener.class);
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
    public void activitySpinner(View view){
        Intent i = new Intent(this, Spinner_Frame.class);
        startActivity(i);
    }
    public void activitySListView(){
        Intent i = new Intent(this, ListView_Frame.class);
        startActivity(i);
    }

}
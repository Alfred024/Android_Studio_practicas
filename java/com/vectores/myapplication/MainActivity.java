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
                "Control EditText",
                "WebView"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sp_items);
        sp.setAdapter(adapter);
    }

    public void cambiarDpractica(View view){
        String practicaSelecionada = sp.getSelectedItem().toString();
        Intent i = null;
        if(practicaSelecionada.equals("Click de un botón")){
            i = new Intent(this, ButtonListener.class);
        }
        if(practicaSelecionada.equals("Radio Group y Radio Button")){
            i = new Intent(this, ButtonListener.class);
        }
        if(practicaSelecionada.equals("CheckBox")){
            i = new Intent(this, ButtonListener.class);
        }
        if(practicaSelecionada.equals("Spinner")){
            i = new Intent(this, ButtonListener.class);
        }
        if(practicaSelecionada.equals("ListView")){
            i = new Intent(this, ButtonListener.class);
        }
        if(practicaSelecionada.equals("Image Button")){
            i = new Intent(this, ButtonListener.class);
        }
        if(practicaSelecionada.equals("Toast notification")){
            i = new Intent(this, ButtonListener.class);
        }
        if(practicaSelecionada.equals("Control EditText")){
            i = new Intent(this, ButtonListener.class);
        }
        if(practicaSelecionada.equals("WebView")){
            i = new Intent(this, ButtonListener.class);
        }startActivity(i);
    }

}
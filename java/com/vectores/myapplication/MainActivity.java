package com.vectores.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner sp;
    private TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = (TextView) findViewById(R.id.textView2);

        sp = (Spinner) findViewById(R.id.spinnerMain);
        String [] sp_items = {
                "Click de un botón",
                "Radio Group y Radio Button",
                "CheckBox",
                "Spinner",
                "ListView",
                "Image Button",
                "Toast notification",
                "Control EditText",
                "WebView",
                "Shared Preferences"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sp_items);
        sp.setAdapter(adapter);
    }

    public void cambiarDpractica(View view){
        String practicaSelecionada = sp.getSelectedItem().toString();
        Intent i = null;

        /*NO SE DESPLIEGA*/
        if(practicaSelecionada == "Click de un botón"){
            i = new Intent(this, ButtonListener.class);
        }
        if(practicaSelecionada == "Radio Group y Radio Button"){
            i = new Intent(this, RadioGroup.class);
        }
        if(practicaSelecionada == "CheckBox"){
            i = new Intent(this, Checkbox.class);
        }
        if(practicaSelecionada == "Spinner"){
            i = new Intent(this, Spinner_Frame.class);
        }
        if(practicaSelecionada == "ListView"){
            i = new Intent(this, ListView_Frame.class);
        }
        if(practicaSelecionada == "Image Button"){
            i = new Intent(this, ImgButton_Frame.class);
        }
        if(practicaSelecionada == "Toast notification"){
            i = new Intent(this, Notification_Toast.class);
        }
        if(practicaSelecionada == "Control EditText"){
            i = new Intent(this, Edit_Text_control.class);
        }

        /*NO SE DESPLIEGA*/
        if(practicaSelecionada == "Problema ingresar usuario y clave"){
            i = new Intent(this, Problema_cambio_activity.class);
        }
        /*NO SE DESPLIEGA*/
        if(practicaSelecionada == "WebView"){
            i = new Intent(this, Parametros_webView.class);
        }
        if(practicaSelecionada == "Shared Preferences"){
            i = new Intent(this, SharedPreferences_email.class);
        }

        startActivity(i);
    }

}
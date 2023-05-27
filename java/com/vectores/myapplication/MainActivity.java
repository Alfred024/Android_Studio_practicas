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
                "Problema ingresar usuario y clave",
                "WebView",
                "Shared Preferences",
                "Lista de contactos",
                "Número al azar"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sp_items);
        sp.setAdapter(adapter);
    }

    public void cambiarDpractica(View view){
        String practicaSelecionada = sp.getSelectedItem().toString();
        Intent i = null;

        /*NO SE DESPLIEGA*/
        if(practicaSelecionada.equals("Click de un botón")){
            i = new Intent(this, ButtonListener.class);
        }
        if(practicaSelecionada.equals("Radio Group y Radio Button")){
            i = new Intent(this, RadioGroup.class);
        }
        if(practicaSelecionada.equals("CheckBox")){
            i = new Intent(this, Checkbox.class);
        }
        if(practicaSelecionada.equals("Spinner")){
            i = new Intent(this, Spinner_Frame.class);
        }
        if(practicaSelecionada.equals("ListView")){
            i = new Intent(this, ListView_Frame.class);
        }
        if(practicaSelecionada.equals("Image Button")){
            i = new Intent(this, ImgButton_Frame.class);
        }
        if(practicaSelecionada.equals("Toast notification")){
            i = new Intent(this, Notification_Toast.class);
        }
        if(practicaSelecionada.equals("Control EditText")){
            i = new Intent(this, Edit_Text_control.class);
        }
        /*NO SE DESPLIEGA*/
        if(practicaSelecionada.equals("Problema ingresar usuario y clave")){
            i = new Intent(this, Problema_cambio_activity.class);
        }
        /*NO SE DESPLIEGA*/
        if(practicaSelecionada.equals("WebView")){
            i = new Intent(this, Parametros_webView.class);
        }
        if(practicaSelecionada.equals("Shared Preferences")){
            i = new Intent(this, SharedPreferences_email.class);
        }
        if(practicaSelecionada.equals("Lista de contactos")){
            i = new Intent(this, Agenda_contactos.class);
        }
        if(practicaSelecionada.equals("Número al azar")){
            i = new Intent(this, Juego_RandomNum.class);
        }

        startActivity(i);
    }

}
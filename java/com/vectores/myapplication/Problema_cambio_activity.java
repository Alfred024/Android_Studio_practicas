package com.vectores.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Problema_cambio_activity extends AppCompatActivity {

    EditText etClave;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problema_cambio);

        btn = (Button) findViewById(R.id.btn_verificar);
        etClave = (EditText) findViewById(R.id.claveInput);
    }

    public void verificarClave(View view){
        String claveIngresada = etClave.getText().toString();
        if(claveIngresada.equals("abc123")){
            Intent i = new Intent(this, Problema_cambio_activity2.class);
            startActivity(i);
        }else{
            Toast.makeText(this, "Clave incorrecta", Toast.LENGTH_SHORT).show();
        }
    }
}
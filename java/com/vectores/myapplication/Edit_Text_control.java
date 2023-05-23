package com.vectores.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Edit_Text_control extends AppCompatActivity {

    private EditText etUsuario, etPassword;
    private Button b;
    private String usuario = "Alfredo Jiménez";
    private String claveUsuario = "panquecito123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_control);

        etUsuario = (EditText) findViewById(R.id.textView_usuario);
        etPassword = (EditText) findViewById(R.id.textView_password);
        b = (Button) findViewById(R.id.btn_TextView_controlP);

    }

    public void verificarInfo(View view){
        String usuario = etUsuario.getText().toString();
        String clave = etPassword.getText().toString();

        if(usuario.equals(null) || clave.equals(null)){
            Toast.makeText(this, "Favor de llenar ambos campos", Toast.LENGTH_SHORT).show();
        }else{
            if(usuario.length() < 10){
                Toast.makeText(this, "Favor de ingresar un nomre de usario más grande", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Bienvenid@ "+usuario, Toast.LENGTH_SHORT).show();
            }
        }

    }
}
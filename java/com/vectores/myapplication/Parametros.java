package com.vectores.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Parametros extends AppCompatActivity {

    EditText et;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametros);
        et = (EditText) findViewById(R.id.input_webPage);
        btn = (Button) findViewById(R.id.btn_go2url);

    }

    public void goToPage(View view){
        Intent i = new Intent(this, Parametros_webView.class);
        i.putExtra("url_parametro", et.getText().toString());
        startActivity(i);
    }
}
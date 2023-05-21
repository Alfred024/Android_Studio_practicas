package com.vectores.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ButtonListener extends AppCompatActivity {

    private EditText e1, e2;
    private Button b;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.input1);
        e2 = (EditText)findViewById(R.id.input2);
        b = (Button)findViewById(R.id.btn);
        res = (TextView)findViewById(R.id.resultadoLabel);
    }

    public void sumaI1_I2(View view){
        int valor1 = Integer.parseInt(e1.getText().toString());
        int valor2 = Integer.parseInt(e2.getText().toString());
        String resultadoSuma = (valor1+valor2)+"";
        res.setText(resultadoSuma);
    }
}
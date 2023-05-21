package com.vectores.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioGroup extends AppCompatActivity {

    private EditText e1, e2;
    private Button b;
    private TextView res;
    private RadioButton rbSuma, rbResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);

        e1 = (EditText) findViewById(R.id.input1_p2);
        e2 = (EditText) findViewById(R.id.input2_p2);
        b = (Button) findViewById(R.id.btn_p2);
        rbSuma = (RadioButton) findViewById(R.id.radioBtn_suma);
        rbResta = (RadioButton) findViewById(R.id.radioBtn_resta);
        res = (TextView) findViewById(R.id.resultadoLabel_p2);
    }

    public void operacion(View view){
        int valor1 = Integer.parseInt(e1.getText().toString());
        int valor2 = Integer.parseInt(e2.getText().toString());
        String resultadoSuma = "";

        if(rbSuma.isChecked()){
            resultadoSuma = (valor1+valor2)+"";
        }
        if(rbResta.isChecked()){
            resultadoSuma = (valor1-valor2)+"";
        }
        res.setText(resultadoSuma);
    }
}
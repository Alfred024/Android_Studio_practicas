package com.vectores.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.TextView;

public class Checkbox extends AppCompatActivity {

    private EditText e1, e2;
    private Button b;
    private TextView res;
    private CheckBox cbSuma, cbResta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        e1 = (EditText) findViewById(R.id.textView1_p3);
        e2 = (EditText) findViewById(R.id.textView2_p3);
        b = (Button) findViewById(R.id.btn_p3);
        res = (TextView) findViewById(R.id.textViewRes_p3);
        cbSuma = (CheckBox) findViewById(R.id.btn_CB_suma);
        cbResta = (CheckBox) findViewById(R.id.btn_CB_resta);
    }

    public void operacion(View view){
        int valor1 = Integer.parseInt(e1.getText().toString());
        int valor2 = Integer.parseInt(e2.getText().toString());
        String resultadoOperacion = "";

        if(cbSuma.isChecked()){
            resultadoOperacion = "Suma: "+(valor1+valor2)+" / ";
        }
        if(cbResta.isChecked()){
            resultadoOperacion += "Resta: "+(valor1-valor2)+"";
        }
        res.setText(resultadoOperacion);
    }
}

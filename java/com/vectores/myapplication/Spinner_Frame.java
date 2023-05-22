package com.vectores.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Spinner_Frame extends AppCompatActivity {

    private EditText e1, e2;
    private Button b;
    private TextView res;
    private Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_frame);

        e1 = (EditText) findViewById(R.id.textView1_p4);
        e2 = (EditText) findViewById(R.id.textView2_p4);
        b = (Button) findViewById(R.id.btn_p4);
        res = (TextView) findViewById(R.id.textViewRes_p4);
        sp = (Spinner) findViewById(R.id.spinner);

        String [] sp_items = {"Suma", "Resta", "Multiplicación", "División"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sp_items);
        sp.setAdapter(adapter);
    }

    public void operacion(View view){
        int valor1 = Integer.parseInt(e1.getText().toString());
        int valor2 = Integer.parseInt(e2.getText().toString());
        String resultadoOperacion = "";

        String operacionSelecionada = sp.getSelectedItem().toString();
        if(operacionSelecionada.equals("Suma")){
            resultadoOperacion = (valor1+valor2)+"";
        }
        if(operacionSelecionada.equals("Resta")){
            resultadoOperacion = (valor1-valor2)+"";
        }
        if(operacionSelecionada.equals("Multiplicación")){
            resultadoOperacion = (valor1*valor2)+"";
        }
        if(operacionSelecionada.equals("División")){
            resultadoOperacion = (valor1/valor2)+"";
        }
        res.setText(resultadoOperacion);
    }
}
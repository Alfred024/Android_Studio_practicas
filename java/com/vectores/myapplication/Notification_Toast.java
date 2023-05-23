package com.vectores.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Notification_Toast extends AppCompatActivity {

    private EditText et;
    private int numRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_toast);

        et = (EditText) findViewById(R.id.textView_p7);
        numRandom = (int)(Math.random()*1000);
        String numNotificaion = String.valueOf(numRandom);
        Toast notification = Toast.makeText(this, numNotificaion, Toast.LENGTH_SHORT);
        notification.show();
    }

    public void checarRspuesta(View view){
        int respuestaUsuario = Integer.parseInt(et.getText().toString());
        if(respuestaUsuario == numRandom){
            Toast.makeText(this, "Tu respuesta es correcta!!!", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Tas mal", Toast.LENGTH_LONG).show();
        }
    }

}
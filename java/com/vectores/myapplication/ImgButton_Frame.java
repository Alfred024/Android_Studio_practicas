package com.vectores.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ImgButton_Frame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_button_frame);
    }

    public void imgBtn_info(){
        Toast.makeText(this, "Práctica con img buttons para la materia de TAP", Toast.LENGTH_SHORT).show();
    }

    public void imgBtn_close(){
        Toast.makeText(this, "Modal cerrado", Toast.LENGTH_SHORT).show();
    }
}
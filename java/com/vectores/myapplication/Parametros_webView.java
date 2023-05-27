package com.vectores.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Parametros_webView extends AppCompatActivity {

    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametros_web_view);

        wv = (WebView) findViewById(R.id.webView_container);
        Bundle b = getIntent().getExtras();
        String parametroActivityPadre = b.getString("url_parametro");
        wv.loadUrl("https://www."+parametroActivityPadre+".com");
    }
}
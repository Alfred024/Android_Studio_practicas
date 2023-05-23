package com.vectores.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListView_Frame extends AppCompatActivity {

    private TextView tv;
    private ListView lv;

    private String nombresLista[] = {
            "Carlos",
            "Roberto",
            "Valeria",
            "Paola",
            "Sara",
            "David",
            "Tiany"
    };
    private String edadesLista[] = {
            "17",
            "24",
            "16",
            "20",
            "24",
            "21",
            "23"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_frame);

        tv = (TextView) findViewById(R.id.textView_p5);
        lv = (ListView) findViewById(R.id.listView_p5);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_p5, nombresLista);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv.setText(
                        "Nombre: "+nombresLista[position]+"\n"
                        +"Edad: "+edadesLista[position]
                );
            }
        });
    }


}
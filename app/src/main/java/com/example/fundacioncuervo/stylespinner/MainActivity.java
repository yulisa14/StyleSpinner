package com.example.fundacioncuervo.stylespinner;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    private Spinner mySpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.txt);
        mySpinner = (Spinner) findViewById(R.id.mySpinner);


        String opciones[] = {"NEGRA","CURSIVA","AMBAS"};
        ArrayAdapter<String> adapter = new
                ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        mySpinner.setAdapter(adapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String opcion = mySpinner.getSelectedItem().toString();
                if(opcion.equals("NEGRA"))
                    txt.setTypeface(null, Typeface.BOLD);
                else if(opcion.equals("CURSIVA"))
                    txt.setTypeface(null, Typeface.ITALIC);
                else if (opcion.equals("AMBAS"))
                    txt.setTypeface(null, Typeface.BOLD_ITALIC);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


    }}





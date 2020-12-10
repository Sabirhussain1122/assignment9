package com.example.assignment7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class spinner extends AppCompatActivity {
    Spinner spn;
    String[] country={"Select","Pakistan","China","England"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spn=findViewById(R.id.spinner1);
        ArrayAdapter= new Array(this,R.layout.support_simple_spinner_dropdown_item,country);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spn.setAdapter( adapter);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(spinner.this, country[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Login_pg extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button b1;
    TextView T1;


    ArrayAdapter aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    T1 = findViewById(R.id.textView);
    T1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent j = new Intent(Login_pg.this,Register.class);
        startActivity(j);
    }
});
    b1 = findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login_pg.this,complaint_pg.class);
                startActivity(i);
            }
        });
     };


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
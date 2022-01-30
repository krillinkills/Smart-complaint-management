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
    Spinner s1;

    ArrayAdapter aa;

    String[] ss1={"User", "Officer", "Admin"};


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
    s1=findViewById(R.id.spinner1);
        s1.setOnItemSelectedListener(this);
        aa=new ArrayAdapter(this, android.R.layout.simple_spinner_item,ss1);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_item);
        s1.setAdapter(aa);
     s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             if(position==0)
             {
                 b1.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Intent i= new Intent(Login_pg.this,complaint_pg.class);
                         startActivity(i);
                     }
                 });
             }
             if(position==1)
             {
                 b1.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Intent i= new Intent(Login_pg.this,officer.class);
                         startActivity(i);
                     }
                 });
             }
         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {

         }
     });

    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
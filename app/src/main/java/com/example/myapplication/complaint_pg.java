package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class complaint_pg extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button b1;
    Button b2;
    EditText e1 ,e2;
    Spinner s1;


    String[] ss1={"Street light", "Potholes", "Urban development"};

    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint_pg);

        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button3);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        s1=findViewById(R.id.spinner);

        //request camera
        if(ContextCompat.checkSelfPermission(complaint_pg.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(complaint_pg.this,
                    new String[]{
                    Manifest.permission.CAMERA
            },
                    100);

        }
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open camera
                Intent intent =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,100);

            }
        });

        //Allocating list to spinner
        s1.setOnItemSelectedListener(this);
        aa=new ArrayAdapter(this, android.R.layout.simple_spinner_item,ss1);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_item);
        s1.setAdapter(aa);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a1=e1.getText().toString();
                String b1=e2.getText().toString();

                if(a1.equals("")||b1.equals("")){
                    Toast.makeText(complaint_pg.this, "Please fill all the details", Toast.LENGTH_SHORT).show();
                }else{

                    Toast.makeText(complaint_pg.this, "Complaint received", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
    //Get captured image
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100) {
            //get captured image
            Bitmap captureImage = (Bitmap) data.getExtras().get ("data");

        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
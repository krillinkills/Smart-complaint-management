package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class spl_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if(spl_screen.this==null){

                    return;
                }

                Intent i = new Intent(spl_screen.this,Login_pg.class);
                startActivity(i);
                finish();

            }
        },  2000);

    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_pg extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

b1 = findViewById(R.id.button);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent i = new Intent(Login_pg.this,complaint_pg.class);
        startActivity(i);
    }
});



}
}
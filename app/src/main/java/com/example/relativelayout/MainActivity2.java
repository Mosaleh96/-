package com.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
     Intent incomingIntent;
     TextView txtphone;
     TextView txtmessage;
     Button  btn_but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("ViewData");
        // استقبال البيانات من الراسل
        incomingIntent=getIntent();
        txtphone=(TextView) findViewById(R.id.text_p);
        txtmessage=(TextView)findViewById(R.id.textm);
        txtphone.setText(incomingIntent.getStringExtra(MainActivity.Phone));
        txtmessage.setText(incomingIntent.getStringExtra(MainActivity.Message));
         btn_but=(Button)findViewById(R.id.button);
         btn_but.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 finish();
             }
         });
    }
}
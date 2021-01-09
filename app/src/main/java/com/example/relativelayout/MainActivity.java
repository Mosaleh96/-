package com.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent outIntent;
    EditText editPhone;
    EditText editMessage;
    Button btn_text;
    String tempText="";
    public static final String Phone="Phone";
    public static final String Message="Message";
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //send data
        editPhone =(EditText)findViewById(R.id.editTextPhone);
        editMessage =(EditText)findViewById(R.id.editTextTextPersonName);
        //click button
        button = (Button) findViewById(R.id.hand);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
                outIntent=new Intent(MainActivity.this,MainActivity2.class);
                tempText =editPhone.getText().toString();
                outIntent.putExtra(Phone,tempText);
                tempText =editMessage.getText().toString();
                outIntent.putExtra(Message,tempText);
                startActivity(outIntent);

            }
        });
    }

    public void closed(View view) {
        finish();
    }
}

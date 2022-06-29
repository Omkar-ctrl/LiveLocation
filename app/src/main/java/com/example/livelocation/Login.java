package com.example.livelocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button b1,b2;
    EditText ed1,ed2;

    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "" +
                                    "Logging...",Toast.LENGTH_SHORT).show();

                    Intent intent=new Intent(Login.this,MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(Login.this, "Wrong Username and Password", Toast.LENGTH_SHORT).show();}
//
            }
        });




    }
}
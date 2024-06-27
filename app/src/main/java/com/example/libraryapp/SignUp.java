package com.example.libraryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7,e8;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        e1=(EditText) findViewById(R.id.pname);
        e2=(EditText) findViewById(R.id.age);
        e3=(EditText) findViewById(R.id.hname);
        e4=(EditText) findViewById(R.id.pin);
        e5=(EditText) findViewById(R.id.mobno);
        e6=(EditText) findViewById(R.id.uname);
        e7=(EditText) findViewById(R.id.pwd);
        e8=(EditText) findViewById(R.id.cpwd);
        b1=(AppCompatButton) findViewById(R.id.rgbtn);
        b2=(AppCompatButton) findViewById(R.id.blbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getPatientName=e1.getText().toString();
                String getAge=e2.getText().toString();
                String getHouseName=e3.getText().toString();
                String getPinCode=e4.getText().toString();
                String getMobileNo=e5.getText().toString();
                String getUserName=e6.getText().toString();
                String getPassword=e7.getText().toString();
                String getConfirmPassword=e8.getText().toString();
                Toast.makeText(getApplicationContext(),getPatientName+' '+getAge+' '+getHouseName+' '+getPinCode+' '+getMobileNo+' '+getUserName+' '+getPassword+' '+getConfirmPassword,Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}
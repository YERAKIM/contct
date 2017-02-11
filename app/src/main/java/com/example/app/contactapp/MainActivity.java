package com.example.app.contactapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.app.contactapp.presentation.SgininActivity;
import com.example.app.contactapp.presentation.SginupActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btSignIn, btSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btSignIn = (Button) findViewById(R.id.btSignIn);
        btSignUp = (Button) findViewById(R.id.btSignUp);
        btSignIn.setOnClickListener(this);
        btSignUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btSignUp:
                Toast.makeText(MainActivity.this, "GO To Add", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, SginupActivity.class));
                break;
            case R.id.btSignIn:
                Toast.makeText(MainActivity.this, "GO To Login", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, SgininActivity.class));
                break;

        }
    }
}

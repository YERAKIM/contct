package com.example.app.contactapp.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.app.contactapp.R;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etName,etTel,etAddr;
    Button btCall,btMag,btGps,btEdit,btList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        etName = (EditText) findViewById(R.id.etName);
        etTel = (EditText) findViewById(R.id.etTel);
        etAddr = (EditText) findViewById(R.id.etAddr);
        btCall = (Button) findViewById(R.id.btCall);
        btMag = (Button) findViewById(R.id.btMag);
        btGps = (Button) findViewById(R.id.btGps);
        btEdit = (Button) findViewById(R.id.btEdit);
        btList = (Button) findViewById(R.id.btList);
        btCall.setOnClickListener(this);
        btMag.setOnClickListener(this);
        btGps.setOnClickListener(this);
        btEdit.setOnClickListener(this);
        btList.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.btCall :
            Intent intent = new Intent(DetailActivity.this,UpdateActivity.class);
            intent.putExtra("id", "hong");

            break;

        case R.id.btMag :
            Intent intent_1 = new Intent(DetailActivity.this,UpdateActivity.class);
            intent_1.putExtra("id", "hong");

            break;

        case R.id.btList :
            startActivity(new Intent(DetailActivity.this,ListActivity.class));
            break;

    }
    }
}

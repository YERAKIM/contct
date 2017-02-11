package com.example.app.contactapp.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.app.contactapp.R;
import com.example.app.contactapp.domain.MemberBean;
import com.example.app.contactapp.service.MemberService;
import com.example.app.contactapp.service.MemberServiceImpl;

public class MemberActivity extends AppCompatActivity implements View.OnClickListener {
    Button btadd, btFindByid, btFindbyname, btList, btUpdate, btDelete;
    MemberService service;
    MemberBean member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);
        btadd = (Button) findViewById(R.id.btadd);
        btFindByid = (Button) findViewById(R.id.btFindByid);
        btFindbyname = (Button) findViewById(R.id.btFindbyname);
        btList = (Button) findViewById(R.id.btList);
        btUpdate = (Button) findViewById(R.id.btUpdate);
        btDelete = (Button) findViewById(R.id.btDelete);

        btadd.setOnClickListener(this);
        btFindByid.setOnClickListener(this);
        btFindbyname.setOnClickListener(this);
        btList.setOnClickListener(this);
        btUpdate.setOnClickListener(this);
        btDelete.setOnClickListener(this);
        service = new MemberServiceImpl();
        member = new MemberBean();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btadd:
                service.add(member);
                break;
            case R.id.btFindByid:
                service.findOne(member);
                break;
            case R.id.btFindbyname:
                service.findSome("");
                break;
            case R.id.btList:
                service.list();
                break;
            case R.id.btUpdate:
                service.update(member);
                break;
            case R.id.btDelete:
                service.delete(member);
                break;
        }
    }
}

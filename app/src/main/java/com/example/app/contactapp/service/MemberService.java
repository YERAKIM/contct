package com.example.app.contactapp.service;

import com.example.app.contactapp.domain.MemberBean;

import java.util.ArrayList;

/**
 * Created by hb2004 on 2017-02-04.
 */

public interface MemberService {
    //CREATE
    public void add(MemberBean bean);
    //READ ONE, SOME, ALL
    public MemberBean findOne(MemberBean bean);
    public ArrayList<MemberBean> findSome(String keyword);
    public ArrayList<MemberBean> list();
    //UPDATE
    public void update(MemberBean bean);
    //DLETE
    public void delete(MemberBean bean);


}

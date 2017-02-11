package com.example.app.contactapp.domain;

/**
 * Created by hb2004 on 2017-02-04.
 */

public class MemberBean {
    private String id, pass, name, phone, addr, profile;

    public void setId(String id) {
        this.id = id;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getId() {

        return id;
    }

    public String getPass() {
        return pass;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddr() {
        return addr;
    }

    public String getProfile() {
        return profile;
    }
}

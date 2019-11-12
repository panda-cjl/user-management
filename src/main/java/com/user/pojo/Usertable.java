package com.user.pojo;

public class Usertable {
    private Integer ucode;

    private String uname;

    private String upwd;

    private Integer utype;

    public Integer getUcode() {
        return ucode;
    }

    public void setUcode(Integer ucode) {
        this.ucode = ucode;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public Integer getUtype() {
        return utype;
    }

    public void setUtype(Integer utype) {
        this.utype = utype;
    }
}
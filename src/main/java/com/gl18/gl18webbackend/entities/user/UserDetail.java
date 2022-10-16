package com.gl18.gl18webbackend.entities.user;

import com.alibaba.fastjson2.JSONObject;
import com.gl18.gl18webbackend.mysql.user.GetDetail;

public class UserDetail {
    private String username;
    private Integer uid;

    public Integer getUid(){
        return uid;
    }
    public String getUsername(){
        return username;
    }
    public void setUserDetail(int uid,String username){
        this.username = username;
        this.uid = uid;
    }
}

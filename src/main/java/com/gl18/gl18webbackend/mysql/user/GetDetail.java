package com.gl18.gl18webbackend.mysql.user;

import com.alibaba.fastjson2.JSONObject;

public class GetDetail{
    public static JSONObject getDetail(int uid){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            return null;
        }
        return null;
    }
}

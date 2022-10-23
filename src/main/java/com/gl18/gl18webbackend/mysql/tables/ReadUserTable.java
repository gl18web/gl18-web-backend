package com.gl18.gl18webbackend.mysql.tables;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.gl18.gl18webbackend.Gl18WebBackendApplication;

import java.sql.*;

public class ReadUserTable {
    public static String get(String name){
        try {
            String url = String.format("jdbc:mysql://%s:3306/%s?useUnicode=true&characterEncoding=UTF-8&userSSL=false",Gl18WebBackendApplication.dbConfigReader.dbhost,Gl18WebBackendApplication.dbConfigReader.dbname);
            Connection conn = DriverManager.getConnection(url, Gl18WebBackendApplication.dbConfigReader.dbusername, Gl18WebBackendApplication.dbConfigReader.dbpasswd);
            Statement statement = conn.createStatement();
            String sql = String.format("select uid,uuid,name from user where name=\"%s\"",name);
            ResultSet result = statement.executeQuery(sql);
            JSONArray obj = new JSONArray();
            int i = 0;
            while (result.next()){
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("uid", result.getString("uid"));
                jsonObject.put("uuid", result.getString("uuid"));
                jsonObject.put("name", result.getString("name"));
                obj.add(jsonObject);
                i++;
                jsonObject = null;
            }
            return obj.toJSONString();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

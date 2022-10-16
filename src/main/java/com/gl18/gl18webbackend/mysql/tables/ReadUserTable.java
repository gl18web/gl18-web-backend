package com.gl18.gl18webbackend.mysql.tables;

import com.gl18.gl18webbackend.Gl18WebBackendApplication;

import java.sql.*;

public class ReadUserTable {
    public static String get(String name){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = String.format("jdbc:mysql://%s:3306/%s?useUnicode=true&characterEncoding=UTF-8&userSSL=false",Gl18WebBackendApplication.dbConfigReader.dbhost,Gl18WebBackendApplication.dbConfigReader.dbname);
            Connection conn = DriverManager.getConnection(url, Gl18WebBackendApplication.dbConfigReader.dbusername, Gl18WebBackendApplication.dbConfigReader.dbpasswd);
            Statement statement = conn.createStatement();
            String sql = String.format("select uid,uuid,name from user where name=\"%s\"",name);
            ResultSet result = statement.executeQuery(sql);
            result.afterLast();
            result.previous();
            System.out.println(result);
            return result.getString("uid") +"\n"+ result.getString("uuid") +"\n"+ result.getString("name");
        } catch (ClassNotFoundException e) {
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

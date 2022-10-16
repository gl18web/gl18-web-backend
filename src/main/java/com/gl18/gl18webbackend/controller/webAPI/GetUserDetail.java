package com.gl18.gl18webbackend.controller.webAPI;


import com.alibaba.fastjson2.JSONObject;
import com.gl18.gl18webbackend.mysql.tables.ReadUserTable;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class GetUserDetail {
    @GetMapping("/api/user/getdetail")
    public String hello(HttpServletRequest request){
        return ReadUserTable.get(request.getParameter("name"));
    }
}

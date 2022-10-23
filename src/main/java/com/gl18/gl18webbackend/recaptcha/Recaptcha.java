package com.gl18.gl18webbackend.recaptcha;

import com.alibaba.fastjson2.JSONObject;
import com.gl18.gl18webbackend.Gl18WebBackendApplication;
import com.gl18.gl18webbackend.request.Request;

public class Recaptcha {
    public static JSONObject verifyResponseOfJSONObj(String token){
        String url = String.format("https://recaptcha.net/recaptcha/api/siteverify?secret=%s&response=%s", Gl18WebBackendApplication.dbConfigReader.recaptcha_key,token);
        JSONObject result = JSONObject.parseObject(Request.get(url));
        url = null;
        return result;
    }
    public static boolean verifyResponseOfBoolean(String token){
        String url = String.format("https://recaptcha.net/recaptcha/api/siteverify?secret=%s&response=%s", Gl18WebBackendApplication.dbConfigReader.recaptcha_key,token);
        JSONObject result = JSONObject.parseObject(Request.get(url));
        url = null;
        return result.getBoolean("succcess");
    }
}

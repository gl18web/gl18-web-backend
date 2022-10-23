package com.gl18.gl18webbackend.controller.webAPI.recaptcha;

import com.gl18.gl18webbackend.recaptcha.Recaptcha;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RecaptchaController {

    @GetMapping("/api/recaptcha/check")
    public static String check(HttpServletRequest request){
        return Recaptcha.verifyResponseOfJSONObj(request.getParameter("token")).toJSONString();
    }
}

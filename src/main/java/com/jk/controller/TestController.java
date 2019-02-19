package com.jk.controller;

import com.jk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService myService;

    @GetMapping("/test")
    public String findData(){
        String say = myService.say("你吃了吗？");
        System.out.println(say);
        return "OK";
    }

}

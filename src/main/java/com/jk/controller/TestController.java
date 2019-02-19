package com.jk.controller;

import com.jk.model.User;
import com.jk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

    public static void main(String[] args) {
        User user = new User(1,"小明",2);
        User user1 = new User(2,"小明1",3);
        User user2 = new User(3,"小明2",42);
        User user3 = new User(4,"小明3",52);
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.stream().map(User::getName).forEach(System.out::print);
    }

}

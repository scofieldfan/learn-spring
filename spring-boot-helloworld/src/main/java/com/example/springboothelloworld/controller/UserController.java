package com.example.springboothelloworld.controller;


import com.example.springboothelloworld.pojo.User;
import com.example.springboothelloworld.properties.NeoProperties;
import com.example.springboothelloworld.properties.RemoteProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    private NeoProperties properties;

    @Autowired
    private RemoteProperties remoteProperties;

    @RequestMapping("/hello")
    public User say() {
        System.out.println("Hello springboot");
        User user = new User();
        user.setName(properties.getTitle());

        String str = remoteProperties.getTitle();
        System.out.println("remote properties:"+str);
        return user;

    }
}

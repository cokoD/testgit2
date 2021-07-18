package com.example.springbootweb.Controller;

import com.example.springbootweb.pojo.user;
import com.example.springbootweb.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class HelloController {

    @Autowired
    private Userservice userservice;

    @GetMapping("/hello")
    public String hello(){
        return "hello,world";
    }

    @GetMapping("{id}")
    public user queryUserById(@PathVariable("id") Long id){
        return this.userservice.queryUserById(id);
    }

    @GetMapping("/all")
    public List<user> queryUser(){
        return this.userservice.queryUsers();
    }
}

package com.ritik.spring_sec_demo.controller;


import com.ritik.spring_sec_demo.model.Users;
import com.ritik.spring_sec_demo.service.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    public AddUserService addUserService;


    @PostMapping("/register")
    public Users adduser(@RequestBody Users user)
    {
        return addUserService.adduser(user);
    }

}

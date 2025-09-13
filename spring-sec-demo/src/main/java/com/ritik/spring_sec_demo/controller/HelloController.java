package com.ritik.spring_sec_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/")
    public String Greet(HttpServletRequest req)
    {
        return "hello world"+req.getSession().getId();
    }

}

package com.ritik.spring_sec_demo.service;

import com.ritik.spring_sec_demo.model.Users;
import com.ritik.spring_sec_demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AddUserService {


    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder Encoder=new BCryptPasswordEncoder(12);


    public Users adduser(Users user) {

         user.setPassword(Encoder.encode(user.getPassword()));
        return repo.save(user);
    }
}

package com.jwt.controller;

import com.jwt.model.User;
import com.jwt.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody User user){
        if("sai".equals(user.getUsername()) && "password".equals(user.getPassword())){
            return jwtUtil.generateToken(user.getUsername());
        }

        return "Invalid Credentials";
    }
}

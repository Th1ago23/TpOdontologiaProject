package com.tpodontologia.backend.controller;

import com.tpodontologia.backend.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @PostMapping
    public void save(User user){
        System.out.println(user);
    }

}

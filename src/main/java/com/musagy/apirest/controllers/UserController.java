package com.musagy.apirest.controllers;

import com.musagy.apirest.models.UserModel;
import com.musagy.apirest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/all")
    public ArrayList<UserModel> getUser () {
        return userService.getUsers();
    }

    @PostMapping()
    public UserModel createUser (@RequestBody UserModel newUser) {
        return userService.saveUser(newUser);
    }
}

package com.musagy.apirest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class indexController {
    @GetMapping("")
    public String Message() {
        return "hola chupapis";
    }
}

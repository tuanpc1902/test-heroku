package com.tuanpc.testheroku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("test")
    public String index(){
        return "test heroky by tuanpc";
    }


}

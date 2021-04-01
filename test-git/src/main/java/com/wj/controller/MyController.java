package com.wj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/get")
    public String get(){
        return "hello world";
    }

    @RequestMapping("/get2")
    public String get2() {
        return "hell java";
    }
}

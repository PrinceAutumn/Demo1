package com.ckcj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/admin")
@Controller
public class Hellocontroller {
 //   @ResponseBody
    @RequestMapping("/hello")
    public String ceshi(){
       return "Hello";
    }
}

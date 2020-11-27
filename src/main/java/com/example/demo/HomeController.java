package com.example.demo;

import com.example.demo.utils.Proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired Proxy px;
    @GetMapping("/")
    public String index(){
        px.print("서버에 들어옴");
        return "index";
    }
}

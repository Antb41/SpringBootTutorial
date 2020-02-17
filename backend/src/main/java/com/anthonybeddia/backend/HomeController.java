package com.anthonybeddia.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController{
    @GetMapping("/")
    public String home(){
        return "Hello";
        //sending String ^ to localhost/8085
    }
}
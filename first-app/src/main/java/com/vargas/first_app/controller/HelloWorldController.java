package com.vargas.first_app.controller;

import com.vargas.first_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;


//    public HelloWorldController(HelloWorldService helloWorldService){
//        this.helloWorldService = helloWorldService;
//    }

    //GET /hello-world
    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("leo");
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody String body){
        return "Hello World Post";
    }

}

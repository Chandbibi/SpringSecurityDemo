package com.example.securitydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppCtrl {

    @Autowired
    AppService appService;

    @Autowired
    MyComponent myComponent;

    @GetMapping("/first")
    public String first(){
        System.out.println("in first");
        myComponent.setI(10);
        return appService.getMessage();
    }

    @GetMapping("/second")
    public String second(){
        System.out.println(myComponent.getI());
        return appService.getMessage();
    }
}

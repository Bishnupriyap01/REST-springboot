package com.shipturtle.Activity1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
    @RequestMapping(path = "/api/greet")
    @GetMapping
    public String greetCustomer(){
        return "Hello Shipturtle, Hope you are doing well !";
    }

}

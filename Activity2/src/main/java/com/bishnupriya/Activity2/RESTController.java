package com.bishnupriya.Activity2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
    @Autowired //dependencyInjection
    private GreetingService greetingService;
    @RequestMapping(path = "/shipturtle/employee/greetings")
    @GetMapping
    public String greetCustomer(
            @RequestParam(value = "firstName") String firstName,
            @RequestParam(value = "lastName") String lastName) {
        return greetingService.getGreeting(firstName, lastName);
    }
   


}

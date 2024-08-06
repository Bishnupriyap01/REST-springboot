package com.bishnupriya.Activity2;

import org.springframework.stereotype.Service;

import java.time.LocalTime;
@Service
public class GreetingService {
    public String getGreeting(String firstName, String lastName) {
        LocalTime now = LocalTime.now();
        String greeting;

        if (now.isBefore(LocalTime.NOON)) {
            greeting = "Good Morning";
        } else if (now.isBefore(LocalTime.of(17, 0))) {
            greeting = "Good Afternoon";
        } else {
            greeting = "Good Evening";
        }

        return String.format("%s %s %s", greeting, firstName, lastName);
    }
}

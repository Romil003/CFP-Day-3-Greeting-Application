package com.bridgelabz.greetingapplication.Controller;

import com.bridgelabz.greetingapplication.Model.Greeting;
import com.bridgelabz.greetingapplication.Model.User;
import com.bridgelabz.greetingapplication.Service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;

    @GetMapping("/msg")
    public Greeting greeting(@RequestParam(value = "name" , defaultValue = "World") String name){
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }
}

package com.bridgelabz.greetingapplication.Controller;

import com.bridgelabz.greetingapplication.Model.Greeting;
import com.bridgelabz.greetingapplication.Model.User;
import com.bridgelabz.greetingapplication.Service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @GetMapping ("/name")
    public Greeting greeting(@RequestParam(value = "firstName" , defaultValue = "World") String firstName,
                             @RequestParam(value = "lastName" , defaultValue = "World") String lastName){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }

    @PostMapping("/save")
    public Greeting greeting(@RequestBody User user){
        return greetingService.saveGreetings(user);
    }

    @GetMapping("/msg/{id}")
    public Greeting greeting(@PathVariable long id){
        return greetingService.getGreetingById(id);
    }

    @GetMapping("/allmsg")
    public List<Greeting> greeting(){
        return greetingService.getGreetingMsg();
    }
}

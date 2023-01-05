package com.bridgelabz.greetingapplication.Service;

import com.bridgelabz.greetingapplication.Model.Greeting;
import com.bridgelabz.greetingapplication.Model.User;

import java.util.List;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
    Greeting saveGreetings(User user);
    List<Greeting> getGreetingMsg();
    Greeting editGreetingMsg(long id, Greeting greeting);
    void deleteById(long id);
}

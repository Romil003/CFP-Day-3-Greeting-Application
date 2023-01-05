package com.bridgelabz.greetingapplication.Service;

import com.bridgelabz.greetingapplication.Model.Greeting;
import com.bridgelabz.greetingapplication.Model.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
}

package com.bridgelabz.greetingapplication.Service;

import com.bridgelabz.greetingapplication.Model.Greeting;
import com.bridgelabz.greetingapplication.Model.User;
import com.bridgelabz.greetingapplication.Repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService{
    private static final String template = "Hello, %s ,%s";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingRepository greetingRepository;
    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template,(user.toString().isEmpty()) ? "Hello World" : user.toString());
        return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
    }

    @Override
    public Greeting getGreetingById(long id) {
        return greetingRepository.findById(id).get();
    }

    @Override
    public Greeting saveGreetings(User user) {
        String message = String.format(template,(user.getFirstName().isEmpty()) ? "Hello World" : user.getFirstName(),
                (user.getLastName().isEmpty()) ? "Hello World" : user.getLastName());
        return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
    }

    @Override
    public List<Greeting> getGreetingMsg() {
        return greetingRepository.findAll();
    }
}

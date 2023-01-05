package com.bridgelabz.greetingapplication.Repository;

import com.bridgelabz.greetingapplication.Model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}

package com.bridgelabz.greetingapplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GreetingTable")
public class Greeting {
    @Id
    private long id ;
    private String msg;

    public Greeting() {
    }

    public Greeting(long id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

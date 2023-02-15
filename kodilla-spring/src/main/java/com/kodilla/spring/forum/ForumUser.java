package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String username = "John Smith";

    public String getUsername() {
        return username;
    }

    public ForumUser() {
    }
}

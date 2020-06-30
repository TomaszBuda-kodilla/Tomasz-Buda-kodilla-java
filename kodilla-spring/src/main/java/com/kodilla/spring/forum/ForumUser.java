package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username = "John Wick";

    public String getUsername() {
        return username;
    }
}

package com.example.cut.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {
    public List<User> getUsers(){
        return List.of(
                new User(
                        1L,
                        "Mashhhod",
                        "3lm",
                        "pwned",
                        "a@i.in",
                        LocalDate.of(2002, 5, 20),
                        "This is mashhood!",
                        false
                ));
    }
}

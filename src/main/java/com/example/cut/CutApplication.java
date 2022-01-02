package com.example.cut;
import com.example.cut.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;


@SpringBootApplication

public class CutApplication {

    public static void main(String[] args) {
        SpringApplication.run(CutApplication.class, args);
    }

}
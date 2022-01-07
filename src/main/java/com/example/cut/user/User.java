package com.example.cut.user;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class User {
    @Id
    @SequenceGenerator(
            name="user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private long id;
    private String name;
    private String Username;
    private String password;
    private String email;
    private LocalDate dob;
    private String bio;
    private boolean pub;

    public User() {
    }

    public User(String name,
                String username,
                String password,
                String email,
                LocalDate dob,
                String bio,
                boolean pub) {
        this.name = name;
        this.Username = username;
        this.password = password;
        this.email = email;
        this.dob = dob;
        this.bio = bio;
        this.pub = pub;
    }

    public User(long id,
                String name,
                String username,
                String password,
                String email,
                LocalDate dob,
                String bio,
                boolean pub) {
        this.id = id;
        this.name = name;
        this.Username = username;
        this.password = password;
        this.email = email;
        this.dob = dob;
        this.bio = bio;
        this.pub = pub;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public boolean isPub() {
        return pub;
    }

    public void setPub(boolean pub) {
        this.pub = pub;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Username='" + Username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", bio='" + bio + '\'' +
                ", pub=" + pub +
                '}';
    }
}

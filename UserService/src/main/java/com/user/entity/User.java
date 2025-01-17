package com.user.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "micro_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String name;
    private String email;
    private String about;
    //other user properties that you want
    @Transient
    private List<Rating> ratings = new ArrayList<>();

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public User(Integer userId, String name, String email, String about) {
        super();
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.about = about;

    }

    public static Object builder() {

        return null;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}

package com.crudops.springbootcrudexample.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "UserProfile")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String username;
    private int problemsSolved;
    private int numberOfSubmissions;
    private int userRank;

    
    public UserProfile() {}

    public UserProfile(String name, String username, int problemsSolved, int numberOfSubmissions, int userRank) {
        this.name = name;
        this.username = username;
        this.problemsSolved = problemsSolved;
        this.numberOfSubmissions = numberOfSubmissions;
        this.userRank = userRank;
    }

    public int getId() {
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
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getProblemsSolved() {
        return problemsSolved;
    }

    public void setProblemsSolved(int problemsSolved) {
        this.problemsSolved = problemsSolved;
    }

    public int getNumberOfSubmissions() {
        return numberOfSubmissions;
    }

    public void setNumberOfSubmissions(int numberOfSubmissions) {
        this.numberOfSubmissions = numberOfSubmissions;
    }

    public int getuserRank() {
        return userRank;
    }

    public void setuserRank(int userRank) {
        this.userRank = userRank;
    }
}

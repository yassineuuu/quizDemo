package com.quiz.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class Quiz {

    private String picture;
    private List<Long> Questions;
    private User user;
    private int score;


//    ++++++++++++++++ Constructor ++++++++++++++++++++++


    public Quiz() {
    }

    public Quiz(String picture, List<Long> questions) {
        this.picture = picture;
        Questions = questions;
    }

    public Quiz(User user, int score) {
        this.user = user;
        this.score = score;
    }

    //    ++++++++++++++++ Getters & Setters ++++++++++++++++++++++


    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<Long> getQuestions() {
        return Questions;
    }

    public void setQuestions(List<Long> questions) {
        Questions = questions;
    }

    public User getUser() {
        return user;
    }

    public void setClient(User user) {
        this.user = user;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

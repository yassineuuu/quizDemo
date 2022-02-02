package com.quiz.demo.models;

import com.quiz.demo.enums.QuizType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QuizQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private QuizType type;
    private String Question;
    private String response;
    private int point;


//    ++++++++++++++++ Constructor ++++++++++++++++++++++

    public QuizQuestion(QuizType type, String question, String response, int point) {
        this.type = type;
        Question = question;
        this.response = response;
        this.point = point;
    }

    public QuizQuestion(String question, String response) {
        Question = question;
        this.response = response;
    }

    public QuizQuestion(QuizType type, String question, String response) {
        this.type = type;
        Question = question;
        this.response = response;
    }
}

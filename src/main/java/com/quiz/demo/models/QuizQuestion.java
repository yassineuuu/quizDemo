package com.quiz.demo.models;

import com.quiz.demo.enums.QuizType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


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
    @Column
    @ElementCollection(targetClass = String.class)
    private List<String> answers;
    private String correctAnswer;
    private int point;


//    ++++++++++++++++ Constructor ++++++++++++++++++++++


    public QuizQuestion(QuizType type, String question, List<String> answers, String correctAnswer, int point) {
        this.type = type;
        Question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        this.point = point;
    }

    public QuizQuestion(String question, List<String> answers) {
        Question = question;
        this.answers = answers;
    }

    public QuizQuestion(String question, String correctAnswer, int point) {
        Question = question;
        this.correctAnswer = correctAnswer;
        this.point = point;
    }

//    ++++++++++++++++ Getters & Setters ++++++++++++++++++++++


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public QuizType getType() {
        return type;
    }

    public void setType(QuizType type) {
        this.type = type;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}

package com.quiz.demo.controllers;

import com.quiz.demo.models.Quiz;
import com.quiz.demo.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @GetMapping("/getQuiz")
    public ResponseEntity<Quiz> getQuiz(@RequestParam String quizType){
        return new ResponseEntity<>(quizService.newQuiz(quizType), HttpStatus.OK);
    }
}

package com.quiz.demo.services;

import com.quiz.demo.enums.QuizType;
import com.quiz.demo.models.Quiz;
import org.springframework.stereotype.Service;

@Service
public interface QuizService {

    Quiz newQuiz(String type);
}

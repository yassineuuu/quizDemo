package com.quiz.demo.services;

import com.quiz.demo.enums.QuizType;
import com.quiz.demo.models.QuizQuestion;
import com.quiz.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuizQuestionService {
    QuizQuestion addQuestion(QuizQuestion quizQuestion);

    List<QuizQuestion> findAllQuestions();

    List<QuizQuestion> findQuestionByType(String type);

    List<QuizQuestion> findQuestionByPoint(int point);

    QuizQuestion updateQuizQuestion(long id, QuizQuestion quizQuestion);

    void deleteQuizQuestion(long id);
}

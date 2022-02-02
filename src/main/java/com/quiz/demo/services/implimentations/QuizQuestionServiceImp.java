package com.quiz.demo.services.implimentations;

import com.quiz.demo.enums.QuizType;
import com.quiz.demo.models.QuizQuestion;
import com.quiz.demo.models.User;
import com.quiz.demo.repositories.QuizQuestionRepo;
import com.quiz.demo.services.QuizQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizQuestionServiceImp implements QuizQuestionService {

    @Autowired
    private QuizQuestionRepo quizQuestionRepo;


    @Override
    public QuizQuestion addQuestion(QuizQuestion quizQuestion) {
        quizQuestionRepo.save(quizQuestion);
        return quizQuestion;
    }

    @Override
    public List<QuizQuestion> findAllQuestions() {
        return null;
    }

    @Override
    public List<QuizQuestion> findQuestionByType(QuizType type) {
        return null;
    }

    @Override
    public List<QuizQuestion> findQuestionByPoint(int point) {
        return null;
    }

    @Override
    public QuizQuestion updateQuizQuestion(long id, QuizQuestion quizQuestion) {
        return null;
    }

    @Override
    public void deleteQuizQuestion(long id) {

    }
}

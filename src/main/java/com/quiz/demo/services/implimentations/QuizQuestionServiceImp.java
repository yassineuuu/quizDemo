package com.quiz.demo.services.implimentations;

import com.quiz.demo.enums.QuizType;
import com.quiz.demo.models.QuizQuestion;
import com.quiz.demo.models.User;
import com.quiz.demo.repositories.QuizQuestionRepo;
import com.quiz.demo.services.QuizQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

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
        return (List<QuizQuestion>) quizQuestionRepo.findAll();
    }

    @Override
    public List<QuizQuestion> findQuestionByType(String type) {
        return (List<QuizQuestion>) quizQuestionRepo.findByType(QuizType.valueOf(type.toUpperCase(Locale.ROOT)));
    }

    @Override
    public List<QuizQuestion> findQuestionByPoint(int point) {
        return (List<QuizQuestion>) quizQuestionRepo.findByPoint(point);
    }

    @Override
    public QuizQuestion updateQuizQuestion(long id, QuizQuestion newQuizQuestion) {
        QuizQuestion question = quizQuestionRepo.findById(id).get();
        question.setType(newQuizQuestion.getType());
        question.setQuestion(newQuizQuestion.getQuestion());
        question.setAnswers(newQuizQuestion.getAnswers());
        question.setCorrectAnswer(newQuizQuestion.getCorrectAnswer());
        question.setPoint(newQuizQuestion.getPoint());

        quizQuestionRepo.save(question);

        return question;
    }

    @Override
    public void deleteQuizQuestion(long id) {
        quizQuestionRepo.deleteById(id);
    }
}

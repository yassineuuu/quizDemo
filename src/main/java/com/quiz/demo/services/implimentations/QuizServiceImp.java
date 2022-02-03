package com.quiz.demo.services.implimentations;

import com.quiz.demo.enums.QuizType;
import com.quiz.demo.models.Quiz;
import com.quiz.demo.models.QuizQuestion;
import com.quiz.demo.services.QuizService;
import com.quiz.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizServiceImp implements QuizService {

    @Autowired
    private UserService userService;
    @Autowired
    private QuizQuestionServiceImp questionServiceImp;


    @Override
    public Quiz newQuiz(String type) {

        List<QuizQuestion> questions = questionServiceImp.findQuestionByType(type);
        List<Long> questionsIds = new ArrayList<>();

        if (questions != null){
            for (QuizQuestion question: questions) {
                questionsIds.add(question.getId());

            }
        }

        Quiz quiz = new Quiz();

        quiz.setQuestions(questionsIds);
        quiz.setClient(userService.findUserById(9));



        return quiz;
    }
}

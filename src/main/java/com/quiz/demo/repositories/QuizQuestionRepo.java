package com.quiz.demo.repositories;

import com.quiz.demo.enums.QuizType;
import com.quiz.demo.models.QuizQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizQuestionRepo extends CrudRepository<QuizQuestion, Long> {
    List<QuizQuestion> findByType(QuizType type);
    List<QuizQuestion> findByPoint(int point);
}

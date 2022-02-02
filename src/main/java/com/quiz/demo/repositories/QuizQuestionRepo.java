package com.quiz.demo.repositories;

import com.quiz.demo.models.QuizQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizQuestionRepo extends CrudRepository<QuizQuestion, Long> {
}

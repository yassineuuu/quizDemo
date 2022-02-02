package com.quiz.demo.controllers;

import com.quiz.demo.models.QuizQuestion;
import com.quiz.demo.services.QuizQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuizQuestionsController {
    @Autowired
    private QuizQuestionService questionService;

    @PostMapping("/addQuestion")
    public ResponseEntity<QuizQuestion> addQuestion(@RequestBody QuizQuestion question){
        questionService.addQuestion(question);
        return new ResponseEntity<>(question, HttpStatus.CREATED);

    }

    @GetMapping("")
    public ResponseEntity<List<QuizQuestion>> getAllQuestions(){
        List<QuizQuestion> questions = questionService.findAllQuestions();
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    @GetMapping("/type")
    public ResponseEntity<List<QuizQuestion>> getQuestionsByType(@RequestParam String type){
        List<QuizQuestion> questions = questionService.findQuestionByType(type);
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }


    @GetMapping("/point")
    public ResponseEntity<List<QuizQuestion>> getQuestionsByPoint(@RequestParam String point){
        List<QuizQuestion> questions = questionService.findQuestionByPoint(Integer.parseInt(point));
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }


    @PutMapping("/updateQuestion")
    public ResponseEntity<QuizQuestion> updateQuestion(@RequestParam long id, @RequestBody QuizQuestion newQuestion){
        QuizQuestion question = questionService.updateQuizQuestion(id, newQuestion);
        return new ResponseEntity<>(question, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteQuestion")
    public ResponseEntity<Void> updateQuestion(@RequestParam long id){
        questionService.deleteQuizQuestion(id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}

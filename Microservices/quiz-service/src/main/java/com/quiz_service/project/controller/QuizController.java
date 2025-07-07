package com.quiz_service.project.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.quiz_service.project.model.QuestionWrapper;
import com.quiz_service.project.model.QuizDto;
import com.quiz_service.project.model.Response;
import com.quiz_service.project.service.QuizService;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;
    
    public void redirect(HttpServletResponse response) throws IOException 
	{
		response.sendRedirect("/swagger-ui.html");
	}

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestBody QuizDto quizDto){
        return quizService.createQuiz(quizDto.getCategoryName(), quizDto.getNumQuestions(), quizDto.getTitle());
    }

    @PostMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id){
        return quizService.getQuizQuestions(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses){
        return quizService.calculateResult(id, responses);
    }
}

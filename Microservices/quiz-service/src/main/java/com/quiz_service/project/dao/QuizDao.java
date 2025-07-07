package com.quiz_service.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz_service.project.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {

}

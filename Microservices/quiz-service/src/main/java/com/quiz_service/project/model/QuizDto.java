package com.quiz_service.project.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuizDto {

	String categoryName;
    Integer numQuestions;
    String title;
}

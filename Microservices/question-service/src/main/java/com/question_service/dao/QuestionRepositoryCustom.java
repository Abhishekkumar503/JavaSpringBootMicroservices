package com.question_service.dao;

import java.util.List;

public interface QuestionRepositoryCustom {

	 List<Integer> findRandomQuestionsByCategory(String category, int limit);
}

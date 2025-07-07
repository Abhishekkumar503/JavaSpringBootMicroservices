package com.question_service.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class QuestionRepositoryCustomImpl implements QuestionRepositoryCustom {
	
	@PersistenceContext
    private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> findRandomQuestionsByCategory(String category, int limit) {
		// TODO Auto-generated method stub
	        String sql = "SELECT q.id FROM question q WHERE q.category = :category ORDER BY RAND()";
	        return em.createNativeQuery(sql)
	                 .setParameter("category", category)
	                 .setMaxResults(limit)
	                 .getResultList();
	    }

}

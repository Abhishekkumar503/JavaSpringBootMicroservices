package com.SpringBoot.Learn.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.SpringBoot.Learn.SpringbootJdbcApplication;
import com.SpringBoot.Learn.model.People;

@Repository
public class PeopleRepo {

	private JdbcTemplate jdbctemplate;
	
	
	
	public void save(People ppl)
	{
		
		int rows = jdbctemplate.update("insert into people (id, name, tech) values (?,?,?)", ppl.getId(), ppl.getName(), ppl.getTech());

		System.out.println(rows + "Row/s added!");
	}

	public List<People> findAll()
	{
		return new ArrayList<People>();
		
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	@Autowired
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
}

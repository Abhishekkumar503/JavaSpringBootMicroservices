package com.SpringBoot.Learn.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

	public List<People> findAll1()
	{
		String sql = "Select * from people";
		RowMapper<People> mapper = new RowMapper<People>() {
			
			@Override
			public People mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				 
				People p =new People();
				p.setId(rs.getInt(1)); // instead of number you can refer name as well
				p.setName(rs.getString(2));
				p.setTech(rs.getString(3));
				return p;
			}
		};
		List<People> ppl = jdbctemplate.query(sql, mapper);
		return ppl;
		
	}
	
	// Lambda expression
	public List<People> findAll2()
	{
		String sql = "Select * from people";
		RowMapper<People> mapper =( rs,  rowNum) ->{
				// TODO Auto-generated method stub
				People p =new People();
				p.setId(rs.getInt(1)); // instead of number you can refer name as well
				p.setName(rs.getString(2));
				p.setTech(rs.getString(3));
				return p;	
		};
		
		List<People> ppl = jdbctemplate.query(sql, mapper);
		return ppl;
		
	}
	
	
	/********************************************  OR  ************************************/
	
	
	
	public List<People> findAll3()
	{
		String sql = "Select * from people";
		
		List<People> ppl = jdbctemplate.query(sql, (rs,row) ->{
			// TODO Auto-generated method stub
			People p =new People();
			p.setId(rs.getInt(1)); // instead of number you can refer name as well
			p.setName(rs.getString(2));
			p.setTech(rs.getString(3));
			return p;	
		});
		
		return ppl;
		
	}
	
/********************************************  OR  ************************************/
	
	
	
	public List<People> findAll4()
	{
		String sql = "Select * from people";		
		return jdbctemplate.query(sql, (rs,row) ->{
			// TODO Auto-generated method stub
			People p =new People();
			p.setId(rs.getInt(1)); // instead of number you can refer name as well
			p.setName(rs.getString(2));
			p.setTech(rs.getString(3));
			return p;	
		});
		
	}
	
	// Awesome!!
	

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	@Autowired
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
}

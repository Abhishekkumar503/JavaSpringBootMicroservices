package com.security.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.project.Login.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}

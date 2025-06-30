package com.security.project.SecurityConfig;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;




@Configuration
@EnableWebSecurity
public class SecurityConfig {

	
	@Bean
    public UserDetailsService userDetailsService() {
		
		List<UserDetails> user =new ArrayList<>();
		user.add(User.withDefaultPasswordEncoder().username("Abis")
                .password("Password01")
                .roles("USER")
                .build());
		return new InMemoryUserDetailsManager(user);
	}
        
	
}

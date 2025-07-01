package com.security.project.SecurityConfig;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;




@Configuration
@EnableWebSecurity
public class SecurityConfig {

	
//	@Bean
//    public UserDetailsService userDetailsService() {
//		
//		List<UserDetails> user =new ArrayList<>();
//		user.add(User.withDefaultPasswordEncoder().username("Abis")
//                .password("Password01")
//                .roles("USER")
//                .build());
//		return new InMemoryUserDetailsManager(user);
//	}
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	@SuppressWarnings("deprecation")
	public AuthenticationProvider authAprovider()
	{
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
//		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());  // Simple String Password
		provider.setPasswordEncoder(new BCryptPasswordEncoder());			// Encrypted Format 
		return provider;
		
	}
     
//@SuppressWarnings({ "removal", "deprecation" })
//protected void Configure(HttpSecurity http) throws Exception	
//{
//	http
//	.csrf().disable()
//	.authorizeRequests().requestMatchers("/login").permitAll()
//	.and()
//	.formLogin()
//	.loginPage(".login").permitAll()
//	.and()
//	.logout().invalidateHttpSession(true)
//	.clearAuthentication(true)
//	.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//	.logoutSuccessUrl("/logout-success").permitAll();
//	
//}

	
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/login.jsp", "/logout-success.jsp", "/resources/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/login.jsp")
                .loginProcessingUrl("/login")  // should match your form action
                .defaultSuccessUrl("/home.jsp", true)
                .failureUrl("/login.jsp?error=true")
                .permitAll()
            )
//            .logout(logout -> logout
//                .invalidateHttpSession(true)
//                .clearAuthentication(true)
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .logoutSuccessUrl("/login.jsp?logout=true")
//                .permitAll()
//            );
            .logout(logout -> logout
            	    .invalidateHttpSession(true)
            	    .clearAuthentication(true)
            	    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            	    .logoutSuccessUrl("/logout.jsp")
            	    .permitAll()
            	);


        return http.build();
    }



	
}

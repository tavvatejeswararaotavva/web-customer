package com.playcde.sprigSecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		UserBuilder use = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication().withUser(use.username("teja").password("test").roles("ADMIN"))
				.withUser(use.username("sandhya").password("test").roles("Employee"))
				.withUser(use.username("raju").password("test").roles("manager"))
				.withUser(use.username("TRN").password("test").roles("ceo"));

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/loginpage")
				.loginProcessingUrl("/authenticateTheUser").permitAll().and().logout().permitAll();
	}

}

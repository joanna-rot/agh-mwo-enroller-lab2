package com.company.enroller.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {
    @Override

    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(participantProvider).passwordEncoder(passwordEncoder);
    }
    //protected void configure(HttpSecurity http) throws Exception {
    //    http.csrf().disable()
    //            .authorizeRequests()
    //            .anyRequest().permitAll()
    //            .and()
    //            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

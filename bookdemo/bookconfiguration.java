//package com.example.bookdemo;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//
//public class bookconfiguration extends WebSecurityConfigurerAdapter {
//
////    @Autowired
////    PasswordEncode pwd;
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/book_api/book_list")
//                .authenticated()
//                .and()
//                .httpBasic();
//
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder book_api) throws Exception {
//        book_api
////                .inMemoryAuthentication()
////                .withUser("gouthami").password(pwd.passwordEncode().encode("1234"));
////
////    }
//
//                .inMemoryAuthentication()
//                .withUser("gouthami").password(passwordEncoder().encode("1234"));
//
//
//
//    }

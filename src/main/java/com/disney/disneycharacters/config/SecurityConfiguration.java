package com.disney.disneycharacters.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@Slf4j
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure( HttpSecurity http ) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers( "/", "/home" ).permitAll()
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage( "/login" )
                    .permitAll()
                    .and()
                .logout()
                    .permitAll()
                    .and()
                .httpBasic();
    }
}

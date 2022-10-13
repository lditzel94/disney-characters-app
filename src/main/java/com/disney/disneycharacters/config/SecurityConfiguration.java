package com.disney.disneycharacters.config;

import lombok.extern.slf4j.Slf4j;

/*@Configuration
@EnableWebSecurity*/
@Slf4j
public class SecurityConfiguration {//extends WebSecurityConfigurerAdapter {
    /*@Override
    protected void configure( HttpSecurity http ) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers( "/**").permitAll()
                    .anyRequest().permitAll()
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

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }*/
}

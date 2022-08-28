package com.disney.disneycharacters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.disney.disneycharacters.model.entity")
public class DisneyCharactersApplication {

    public static void main( String[] args ) {
        SpringApplication.run( DisneyCharactersApplication.class, args );
    }

}

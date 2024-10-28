package com.userServiceCrudOps.springbootcrudeUserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class userServiceCrudApplication {

    public static void main(String[] args) {
        
        Dotenv dotenv = Dotenv.load();
        
        
        System.setProperty("SERVER_PORT", dotenv.get("SERVER_PORT"));
        System.setProperty("MYSQL_URL", dotenv.get("MYSQL_URL"));
        System.setProperty("MYSQL_USERNAME", dotenv.get("MYSQL_USERNAME"));
		System.setProperty("MYSQL_PASSWORD", dotenv.get("MYSQL_PASSWORD"));
		    
       
        SpringApplication.run(userServiceCrudApplication.class, args);
        
       
		System.out.printf("Hello world%n");
    }
}

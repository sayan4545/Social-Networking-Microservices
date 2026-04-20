package com.dev.sayan.socialnetworking.postservice;

import io.github.cdimascio.dotenv.DotEnvException;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostServiceApplication {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().load();
        dotenv.entries()
                        .forEach(entry-> System.setProperty(
                                entry.getKey(),entry.getValue()
                        ));
        SpringApplication.run(PostServiceApplication.class, args);
    }

}

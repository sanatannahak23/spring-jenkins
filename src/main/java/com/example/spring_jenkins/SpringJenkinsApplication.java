package com.example.spring_jenkins;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);

    @PostConstruct
    public void init() {
        log.info("init method is executed...");
    }

    public static void main(String[] args) {
        log.info("main method is executed..");
        SpringApplication.run(SpringJenkinsApplication.class, args);
    }

    @PreDestroy
    public void destroy() {
        log.info("Destroy method is executed...");
    }

}

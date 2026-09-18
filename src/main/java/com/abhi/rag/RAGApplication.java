package com.abhi.rag;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Spring AI RAG Application.
 *
 * <p>Initial project setup for a Retrieval-Augmented Generation
 * application using Spring Boot and Spring AI.
 *
 * @author Abhishek Kumar
 */
@SpringBootApplication
public class RAGApplication {

    private static final Logger LOG =
            LoggerFactory.getLogger(RAGApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RAGApplication.class, args);
    }

    /**
     * Displays a startup message when the application starts.
     */
    @Bean
    CommandLineRunner startupBanner() {
        return args -> {
            LOG.info("==============================================");
            LOG.info("Spring AI RAG Application");
            LOG.info("Initial project setup");
            LOG.info("Application started successfully");
            LOG.info("==============================================");
        };
    }
}
package dev.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ben Outram on 15/12/15.
 */
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Main {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(Main.class);
    }
}

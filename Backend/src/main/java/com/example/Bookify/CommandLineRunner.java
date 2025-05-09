package com.example.Bookify;

import org.springframework.stereotype.Component;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        for(int i=0;i<200;i++)
        {
            System.out.println("hello from docker container "+i);
        }
    }
}

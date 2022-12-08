package com.example.poetrywebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@SpringBootApplication
@RestController
public class PoetryWebAppApplication {

    public static void main(final String[] args) throws IOException {
        SpringApplication.run(PoetryWebAppApplication.class, args);

    }

    @GetMapping("/la")
    public String simple_one() throws IOException {

        Random rand = new Random();
        String randomNumber = Integer.toString(rand.nextInt(0, 85));

        //https://howtodoinjava.com/java/io/read-file-from-resources-folder/
        InputStream ioStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("data/poems/" + randomNumber + ".txt");

        Scanner sc = new Scanner(ioStream);
        String content = sc.useDelimiter("\\A").next();
        sc.close();

        return content;

    }

}

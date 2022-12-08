package com.example.poetrywebapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PoetryWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoetryWebAppApplication.class, args);
    }

    @GetMapping("/lala")
    public String simpleRequest() throws FileNotFoundException {
        // Random rand = new Random();
        // String randomNumber = Integer.toString(rand.nextInt(0, 85));
        // File file = new File("src/poems/" + randomNumber + ".txt");
        // Scanner sc = new Scanner(file);
        // String content = sc.useDelimiter("\\A").next();
        // sc.close();

        // return content;
        return "ok";
    }
}


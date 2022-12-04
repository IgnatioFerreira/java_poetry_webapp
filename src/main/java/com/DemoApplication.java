package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// This annotation instructs Spring to initialize its configuration - which is needed to start a
// new application
@SpringBootApplication
// Indicates that this class contains RESTful methods to handle incoming HTTP
// requests
@RestController
public class DemoApplication {

    // We can start our application by calling the run method with the primary class
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // The `GetMapping` annotation indicates that this method should be called
    // when handling GET requests to the "/simple-request" endpoint
    @GetMapping("/")
    public String simpleRequest() throws FileNotFoundException {
        Random rand = new Random();
        String randomNumber = Integer.toString(rand.nextInt(0, 85));
        File file = new File("src/poems/"+ randomNumber  + ".txt");
        Scanner sc = new Scanner(file);
        String content = sc.useDelimiter("\\A").next();
        sc.close();

        // In this case, we return the plain text response "ok"
        return content;
    }

}

package com.example.poetrywebapp;

import java.io.FileNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/lala")
    public String simpleRequest() throws FileNotFoundException {
        // Random rand = new Random();
        // String randomNumber = Integer.toString(rand.nextInt(0, 85));
        // File file = new File("src/poems/" + randomNumber + ".txt");
        // Scanner sc = new Scanner(file);
        // String content = sc.useDelimiter("\\A").next();
        // sc.close();

        // // In this case, we return the plain text response "ok"
        // return content;

        return "ok";
    }
}

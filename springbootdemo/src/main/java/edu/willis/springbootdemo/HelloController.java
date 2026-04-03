package edu.willis.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to my Spring Boot Application";
    }

    @GetMapping("/about")
    public String about() {
        return "This application was created for Advanced Java";
    }

    @GetMapping("/contact")
    public String contact() {
        return "Contact: Jesama9384@students.ecpi.edu";
    }

    @GetMapping("/color")
    public String color() {
        return "My favorite color is green";
    }
    
    
    
    
    
}

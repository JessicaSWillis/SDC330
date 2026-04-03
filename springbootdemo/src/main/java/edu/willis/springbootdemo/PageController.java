package edu.willis.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {
    @GetMapping("/pagehome")
    public String homePage() {
        return "home";
    }

    @GetMapping("/pageabout") 
        public String aboutPage(){
            return "about";
        }
}

package org.msa.finder.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        System.out.println("System initialized.");
        return "Welcome to the keyword finder online app";

    }

}

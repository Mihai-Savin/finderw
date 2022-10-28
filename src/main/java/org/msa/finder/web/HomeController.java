package org.msa.finder.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/init")
    public String home(){
        System.out.println("System initialized.");
        return "Result here";

    }

}

package app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Hello Spring";
    }

    @RequestMapping("/date")
    public String printData(){
        return new Date().toString();
    }
}

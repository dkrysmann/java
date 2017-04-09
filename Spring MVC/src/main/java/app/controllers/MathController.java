package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MathController {
    @RequestMapping("/numbers")
    public String numbers(){
        return "numbers";
    }
}

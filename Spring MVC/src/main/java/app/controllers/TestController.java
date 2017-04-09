package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class TestController {
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","Done");
        model.addAttribute("date", new Date().toString());
       return "hello-view";
   }
}

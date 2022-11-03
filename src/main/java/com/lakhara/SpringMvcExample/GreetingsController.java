package com.lakhara.SpringMvcExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingsController {

    @GetMapping("/hello")
    public String greetings(@RequestParam(name = "userName", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greetings";
    }
}

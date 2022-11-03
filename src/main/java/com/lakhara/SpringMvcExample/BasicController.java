package com.lakhara.SpringMvcExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {

    @GetMapping("/")
    public String basicGet(Model model) {
        model.addAttribute("var1", "variable1 value");
        model.addAttribute("var2", 800);
        return "basic";
    }
}

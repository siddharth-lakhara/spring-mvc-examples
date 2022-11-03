package com.lakhara.SpringMvcExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @GetMapping("/form")
    public String getForm(Model model) {
        model.addAttribute("formModel", new FormModel());
        return "form";
    }

    @PostMapping("/form")
    public void postForm(@ModelAttribute FormModel formInputs) {
        System.out.println(formInputs);
        System.out.println("Reached here");
    }
}

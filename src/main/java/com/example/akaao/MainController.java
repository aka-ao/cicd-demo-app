package com.example.akaao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/hello")
    public String index(Model model) {
        model.addAttribute("modelValue", "2021/09/23 08:33");
        return "hello";
    }
}

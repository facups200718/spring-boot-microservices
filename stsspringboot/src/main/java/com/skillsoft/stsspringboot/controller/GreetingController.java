package com.skillsoft.stsspringboot.controller;

import com.skillsoft.stsspringboot.config.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @Autowired
    private MessageProperties properties;

    @GetMapping("/greeting")
    public String greeting(@RequestParam String name, Model model) {
        String message = properties.getGreeting() + name;
        model.addAttribute("greetingMessage",message);
        return "homePage";
    }
}

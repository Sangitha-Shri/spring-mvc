package com.ibm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.ibm.model.User;

@Controller
public class UserController {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/saveUser")
    public String submitForm(@ModelAttribute("user") User user,Model model) {
       model.addAttribute("userdata", user);
       return "result";
    }
}


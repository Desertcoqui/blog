package com.codeup.controllers;

import com.codeup.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by PapoteDetres1 on 2/13/17.
 */
@Controller
public class AuthenticationController {
    @GetMapping("/login")
    public String showLoginForm() {
        System.out.println(new BCryptPasswordEncoder().encode("codeup2"));
        System.out.println(new BCryptPasswordEncoder().encode("codeup3"));
        System.out.println(new BCryptPasswordEncoder().encode("codeup4"));

        return "login/login";
    }

    @GetMapping("/register")
    public String showForm(Model viewModel) {
        viewModel.addAttribute("user", new User());
        return "user/create";

    }
}
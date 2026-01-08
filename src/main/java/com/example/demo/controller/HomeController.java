package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.services.BlogServices;

@Controller
public class HomeController {
    
    @Autowired
    BlogServices blogServices;

    @GetMapping("/")
    public String welcomePage(Model model){
        List<String> articleTitles = blogServices.articleTitles();
        model.addAttribute("listOfTitles", articleTitles);
        return "index";
    }

}

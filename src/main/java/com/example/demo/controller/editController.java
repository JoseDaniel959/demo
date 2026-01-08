package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Blog;
import com.example.demo.services.BlogServices;

@Controller
public class editController {
    
    @Autowired
    BlogServices blogServices;

    @GetMapping("/edit/{blogID}")
    public String editPage(@PathVariable Integer blogID){
        Optional<Blog> articleToEdit = blogServices.article(blogID);
            return "edit";
    }

    
    @PostMapping(path = "/edit/{blogID}", consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    public String editBlog(@ModelAttribute("blog") Blog blog, @PathVariable Integer blogID, Model model){
        model.addAttribute("blogID", blogID);
        System.out.println("soy el blog " + blog);
        System.out.println("BLOG ID " + blogID);
        return "edit";
    }


}


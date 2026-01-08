package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Blog;
import com.example.demo.services.BlogServices;

@Controller
public class ArticleController {

    @Autowired
    BlogServices blogServices;

    @GetMapping("/article/{blogID}")
    public String article(Model model, @PathVariable Integer blogID){
        Optional<Blog> article =  blogServices.article(blogID);
        if(!article.isEmpty()){
            model.addAttribute("article",article.get());
            return "article";
        
        }
        return "404";
    }
}

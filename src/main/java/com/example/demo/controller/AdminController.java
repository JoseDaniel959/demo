package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepo;
import com.example.demo.services.BlogServices;

@Controller
public class AdminController{

    @Autowired
    BlogServices blogServices;
    

    @ModelAttribute("articles")
    public List<Blog> populatedTitltes(){
        return blogServices.getBlogs();
    }
    
    @GetMapping("/admin")
    public String adminPage(Model model){
        return "admin";
    }

    @DeleteMapping("/admin/{blogID}")
    public ResponseEntity<Void> deleteArticle(@PathVariable Integer blogID){
        blogServices.deleteArticle(blogID);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}


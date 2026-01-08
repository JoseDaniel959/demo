package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepo;

@Service
public class BlogServices{
    
    @Autowired
    BlogRepo blogRepo;
    
    public List<String> articleTitles(){
            return blogRepo.findAll().stream().map( (Blog) -> Blog.getTitle()).collect(Collectors.toList());
    }

    public Optional<Blog> article(Integer blogId){
        return blogRepo.findById(blogId);
    }

    public void deleteArticle(Integer blodId){
        blogRepo.deleteById(blodId);   
    }

    public List<Blog> getBlogs(){
        return blogRepo.findAll();
    }
}

package com.example.demo.model;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Blog {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private int blogID;

    private String title;

    @Column(columnDefinition = "text")
    private String text;
    
    @Column(columnDefinition = "Date")
    private LocalDate articleDate;
    
    public Blog() {
    }

    public Blog(int blogID, String title, String text) {
        this.blogID = blogID;
        this.title = title;
        this.text = text;
    }
    
    public int getBlogID() {
        return blogID;
    }
    public void setBlogID(int blogID) {
        this.blogID = blogID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(LocalDate articleDate) {
        this.articleDate = articleDate;
    }

    @Override
    public String toString() {
        return "Blog [blogID=" + blogID + ", title=" + title + ", text=" + text + ", articleDate=" + articleDate + "]";
    }
   
  
    
}

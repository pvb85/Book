package com.hcl.synchrony.onlinebookshopping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table 
public class Inventory { 
  
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="book_id") 
    private Integer bookId; 
    @Column(name="book_name") 
    private String bookName; 
    @Column(name="author") 
    private String author; 
    @Column(name="price") 
    private float price; 
    public Integer getBookId() { 
        return bookId; 
    } 
    public void setBookId(Integer bookId) { 
        this.bookId = bookId; 
    } 
    public String getBookName() { 
        return bookName; 
    } 
    public void setBookName(String bookName) { 
        this.bookName = bookName; 
    } 
    public String getAuthor() { 
        return author; 
    } 
    public void setAuthor(String author) { 
        this.author = author; 
    } 
    public float getPrice() { 
        return price; 
    } 
    public void setPrice(float price) { 
        this.price = price; 
    } 
     
     
} 
 
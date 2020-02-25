package com.hcl.synchrony.onlinebookshopping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table 
public class OrderDetails { 
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="order_id") 
    private Integer orderId; 
    @Column(name="user_name") 
    private String userName; 
    @Column(name="book_name") 
    private String bookName; 
    @Column(name="quantity") 
    private int quantity; 
    @Column(name="is_payment") 
    private boolean isPayment; 
    public Integer getOrderId() { 
        return orderId; 
    } 
    public void setOrderId(Integer orderId) { 
        this.orderId = orderId; 
    } 
    public String getUserName() { 
        return userName; 
    } 
    public void setUserName(String userName) { 
        this.userName = userName; 
    } 
    public String getBookName() { 
        return bookName; 
    } 
    public void setBookName(String bookName) { 
        this.bookName = bookName; 
    } 
    public int getQuantity() { 
        return quantity; 
    } 
    public void setQuantity(int quantity) { 
        this.quantity = quantity; 
    } 
    public boolean isPayment() { 
        return isPayment; 
    } 
    public void setPayment(boolean isPayment) { 
        this.isPayment = isPayment; 
    } 
     
} 
 
 
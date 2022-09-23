package com.example.bookdemo;

import javax.persistence.*;

@Entity
@Table
public class book {

@Id
@SequenceGenerator(name="book_seq",sequenceName = "book_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "book_seq")
    private int bookid;
    private String bookname;
    private String authname;
    private float price;

    public book() {

    }

    public book(int bookid, String bookname, String authname, float price) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.authname = authname;
        this.price = price;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthname() {
        return authname;
    }

    public void setAuthname(String authname) {
        this.authname = authname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

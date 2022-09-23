package com.example.bookdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:3002/")
@RestController
@RequestMapping("/book_api")
public class bookcontroller {

    @Autowired
    private bookservice service;

    public bookcontroller(bookservice service) {
        this.service = service;
    }

    @PostMapping("/c_insert")
    public void insertion(@RequestBody book entry) {
        service.addBook(entry);
    }


    @PostMapping("/save_book")
    public book save(@RequestBody book b){
        return service.saveBook(b);
    }

    @GetMapping("/book_list")
    public List<book> list() {
        return service.getBookList();
    }
}


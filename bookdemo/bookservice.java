package com.example.bookdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bookservice {

    @Autowired
    private bookrepository repo;

    public bookservice(bookrepository repo) {
        this.repo = repo;
    }

    public void addBook(book entry) {
        repo.save(entry);
    }
    public List<book> getBookList() {
        return repo.findAll();
    }


    public book saveBook(book b) {
return repo.save(b);
    }
}

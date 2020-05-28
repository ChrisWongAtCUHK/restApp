package com.william.code.RestApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    private BookRepository repository;

    @RequestMapping("/")
    public String index() {
        repository.save(new Book("Java"));
        repository.save(new Book("Node"));
        repository.save(new Book("Python"));
        return "Hello World";
    }

    @RequestMapping("/books")
    public String books() {
        StringBuilder sb = new StringBuilder();
        for(Book book : repository.findAll()) {
            sb.append(book.getName());
        }
        return sb.toString();
    }
}

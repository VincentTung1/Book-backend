package com.vincent.controller;

import com.vincent.entity.Book;
import com.vincent.service.BookService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Resource
    BookService bookService;

    @RequestMapping("/book/{bid}")
    public Book findUserById(@PathVariable("bid") int uid){
        return bookService.getBookById(uid);
    }

}

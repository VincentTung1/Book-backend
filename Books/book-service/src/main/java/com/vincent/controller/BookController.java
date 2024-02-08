package com.vincent.controller;

import com.vincent.entity.Book;
import com.vincent.service.BookService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Resource
    BookService bookService;

    @RequestMapping("/book/{bid}")
    public Book findUserById(@PathVariable("bid") int uid){
        return bookService.getBookById(uid);
    }

    @RequestMapping(value = "/book/book-insert",method = RequestMethod.POST)
    public void createBook(
            @PathVariable("name") String name,
            @PathVariable("desc")   String desc,
            @PathVariable("author")   String author,
            @PathVariable("year") String year){
       bookService.createBook(name,desc,author,year);
    }

}

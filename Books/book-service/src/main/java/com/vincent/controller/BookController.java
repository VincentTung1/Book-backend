package com.vincent.controller;

import com.vincent.entity.Book;
import com.vincent.service.BookService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Resource
    BookService bookService;

    @RequestMapping("/book/{bid}")
    public Book findBookById(@PathVariable("bid") int bid){
        return bookService.getBookById(bid);
    }

    @RequestMapping(value = "/book/book-insert",method = RequestMethod.POST)
    public void createBook(
            @RequestParam("name") String name,
            @RequestParam("desc")   String desc,
            @RequestParam("author")   String author,
            @RequestParam("year") String year){
       bookService.createBook(name,desc,author,year);
    }

}

package com.vincent.controller;

import com.vincent.entity.Book;
import com.vincent.service.BookService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@RestController
public class BookController {
    @Resource
    BookService bookService;

    @RequestMapping("/book/{bid}")
    public Book findBookById(@PathVariable("bid") int bid){
        return bookService.getBookById(bid);
    }

    @PostMapping(value = "/book/book-insert")
    public String createBook(
            @RequestBody Book book){
       bookService.createBook(book.getName(),book.getDesc(),book.getAuthor(),book.getYear());
       return "success";
    }

    @PostMapping(value = "/book/book-update")
    public String updateBook(
            @RequestBody Book book
    ){
        bookService.updateBook(book.getBid(),book.getName(),book.getDesc(),book.getAuthor(),book.getYear());
        return "success";
    }

    @RequestMapping(value = "/book/book-delete")
    public String deleteBook(@PathParam("bid") int bid){
       bookService.deleteBook(bid);
        return "success";
    }

}

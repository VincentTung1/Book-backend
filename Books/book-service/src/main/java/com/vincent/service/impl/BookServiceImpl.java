package com.vincent.service.impl;

import com.vincent.entity.Book;
import com.vincent.mapper.BookMapper;
import com.vincent.service.BookService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper bookMapper;
    @Override
    public Book getBookById(int bid) {
        return bookMapper.getBookById(bid);
    }

    @Override
    public void createBook(String name, String desc, String author, String year) {
       bookMapper.createBook(name,desc,author,year);
    }

    @Override
    public void updateBook(int bid, String name, String desc, String author, String year) {
       bookMapper.updateBook(bid,name,desc,author,year);
    }

    @Override
    public void deleteBook(int bid) {
       bookMapper.deleteBook(bid);
    }
}

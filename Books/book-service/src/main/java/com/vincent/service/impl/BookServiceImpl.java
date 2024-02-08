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
}

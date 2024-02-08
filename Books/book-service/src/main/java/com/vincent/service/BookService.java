package com.vincent.service;

import com.vincent.entity.Book;

public interface BookService {

    Book getBookById(int bid);

    void createBook(String name, String desc, String author, String year);
}

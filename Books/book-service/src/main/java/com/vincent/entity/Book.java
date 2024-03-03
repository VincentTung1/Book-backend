package com.vincent.entity;

import lombok.Data;

@Data
public class Book {
    int bid;
    String name;
    String desc;
    String author;
    String year;

    public Book(int bid, String name, String desc, String author, String year) {
        this.bid = bid;
        this.name = name;
        this.desc = desc;
        this.author = author;
        this.year = year;
    }
}

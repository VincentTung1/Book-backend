package com.vincent.entity;

import lombok.Data;

@Data
public class Book {
    int bid;
    String name;
    String desc;
    String author;
    String year;
}

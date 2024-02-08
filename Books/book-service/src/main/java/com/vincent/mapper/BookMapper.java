package com.vincent.mapper;

import com.vincent.entity.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper {

    @Select("select * from db_book where bid = #{bid}")
    Book getBookById(int bid);

    @Insert("INSERT INTO db_book(name,desc,author,year) VALUES(#{name}, #{desc}, #{author}, #{year})")
    void createBook(String name, String desc, String author, String year);
}

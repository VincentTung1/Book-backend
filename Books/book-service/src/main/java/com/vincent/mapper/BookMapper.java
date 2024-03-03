package com.vincent.mapper;

import com.vincent.entity.Book;
import org.apache.ibatis.annotations.*;

@Mapper
public interface BookMapper {

    @Select("select * from db_book where bid = #{bid}")
    Book getBookById(int bid);

    @Insert("INSERT INTO db_book(name,`desc`,author,year) VALUES(#{name}, #{desc}, #{author}, #{year})")
    void createBook(String name, String desc, String author, String year);

    @Update("UPDATE db_book SET name=#{name},`desc`=#{desc},author=#{author},year=#{year} WHERE bid=#{bid}")
    void updateBook(int bid, String name, String desc, String author, String year);

    @Delete("DELETE FROM db_book WHERE bid=#{bid}")
    void deleteBook(int bid);
}

package com.example.library.data.book;

import com.example.library.po.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {
    //根据作者id获取list<book>//主要用在author
    List<Book> selectBooksByAuthorId(@Param("authorId") Integer authorId);
    //返回所有book//首页
    List<Book> selectAllBooks();
    //根据bookid返回书籍信息
    Book getBookById(@Param("bookid") Integer bookid );

    //TODO 根据分类返回书籍信息//目前还没有分类等。。搁置

}

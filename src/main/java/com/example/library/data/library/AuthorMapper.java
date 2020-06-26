package com.example.library.data.library;

import com.example.library.po.Author;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface AuthorMapper {
    ArrayList<Author> getAllAuthors();

    Author getAuthorByID(@Param("authorID")Integer authorID);

    ArrayList<Author> getAuthorsByCategoryID(@Param("categoryID")Integer categoryID);

    ArrayList<String> getAuthorsNameByCategoryID(@Param("categoryID")Integer categoryID);

    String getNameByID(@Param("authorID")Integer authorID);

    Integer getIDByName(@Param("authorName")String name);

    ArrayList<Author> searchAuthorByKeyword(@Param("keyword")String keyword);

    void addAuthor(Author author);

    void updateAuthor(Integer authorID, Author author);
}

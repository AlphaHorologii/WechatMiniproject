package com.example.library.data.author;

import com.example.library.po.Author;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AuthorMapper {
    Author getAuthorById(@Param("id") int id);
    Author getAuthorByName(@Param("name") String name);
}

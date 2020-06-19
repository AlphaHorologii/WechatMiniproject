package com.example.library.data.author;

import com.example.library.vo.AuthorVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AuthorMapper {
    AuthorVO getAuthorById(@Param("id") int id);
//  Author getAuthorByName(@Param("name") String name);
    String getAuthornameById(@Param("id") int id);
    List<String> getAuthornameByCategoryid(@Param("id") int id);
}

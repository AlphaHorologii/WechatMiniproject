package com.example.library.data.library;

import com.example.library.po.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface CategoryMapper {
    ArrayList<Category> getAllCategory();

    Integer getIDByName(@Param("categoryName")String categoryName);

    String getNameByID(@Param("categoryID")Integer categoryID);
}

package com.example.library.data.category;

import com.example.library.po.Book;
import com.example.library.vo.CategoryVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface CategoryMapper {
    List<CategoryVO> getAllCategory();
}

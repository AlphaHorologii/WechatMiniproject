package com.example.library.servicelmpl;

import com.example.library.service.CategoryService;
import com.example.library.data.author.AuthorMapper;
import com.example.library.data.book.BookMapper;
import com.example.library.data.category.CategoryMapper;
import com.example.library.vo.CategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Autowired
    AuthorMapper authorMapper;
    @Autowired
    BookMapper bookMapper;

    @Override
    public List<CategoryVO> getAllCategory() {
        List<CategoryVO> categoryVOS=categoryMapper.getAllCategory();
        for (CategoryVO categoryVO:categoryVOS){
            Integer id=categoryVO.getId();
            Integer nums= bookMapper.getBookNumsByCategoryId(id);
            categoryVO.setBooknums(nums);
            //todo 根据id在books寻找这类书的总数 方法一律加在mapper里即可
            List<String> famous_authors=authorMapper.getAuthornameByCategoryid(id);
            categoryVO.setFamous_authors(famous_authors);
        }
        return categoryVOS;
    }
}

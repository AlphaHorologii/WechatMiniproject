package com.example.library.serviceImpl.library;

import com.example.library.data.library.AuthorMapper;
import com.example.library.data.library.BooksMapper;
import com.example.library.data.library.CategoryMapper;
import com.example.library.po.Category;
import com.example.library.service.library.CategoryService;
import com.example.library.vo.CategoryVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Autowired
    BooksMapper booksMapper;

    @Autowired
    AuthorMapper authorMapper;

    @Override
    public ArrayList<CategoryVO> getAllCategories() {
        ArrayList<Category> categories = categoryMapper.getAllCategory();
        ArrayList<CategoryVO> categoryVOs = new ArrayList<>();
        for(Category category:categories){
            Integer ID = category.getCategoryID();
            Integer count = booksMapper.getBooksCountByCategoryID(ID);
            ArrayList<String> famousAuthors = authorMapper.getAuthorsNameByCategoryID(ID);

            CategoryVO categoryVO = new CategoryVO();
            BeanUtils.copyProperties(category, categoryVO);
            categoryVO.setBooksCount(count);
            categoryVO.setFamousAuthors(famousAuthors);
            categoryVOs.add(categoryVO);
        }
        return categoryVOs;
    }
}

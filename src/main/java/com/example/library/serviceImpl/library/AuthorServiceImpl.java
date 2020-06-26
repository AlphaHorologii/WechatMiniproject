package com.example.library.serviceImpl.library;

import com.example.library.data.library.AuthorMapper;
import com.example.library.data.library.BooksMapper;
import com.example.library.data.library.CategoryMapper;
import com.example.library.po.Author;
import com.example.library.service.library.AuthorService;
import com.example.library.service.library.BooksService;
import com.example.library.vo.AuthorInfoVO;
import com.example.library.vo.AuthorVO;
import com.example.library.vo.ResponseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    AuthorMapper authorMapper;

    @Autowired
    BooksMapper booksMapper;

    @Autowired
    CategoryMapper categoryMapper;

    @Autowired
    BooksService booksService;

    @Override
    public ArrayList<AuthorVO> getAllAuthors() {
        ArrayList<AuthorVO> authorVOs = new ArrayList<>();
        for (Author author:authorMapper.getAllAuthors()) {
            AuthorVO authorVO = new AuthorVO();
            BeanUtils.copyProperties(author, authorVO);
            Integer authorID = author.getAuthorID();
            authorVO.setBooks(booksService.getBooksByAuthorID(authorID));
            Integer categoryID = author.getCategoryID();
            authorVO.setCategoryName(categoryMapper.getNameByID(categoryID));
            authorVOs.add(authorVO);
        }
        return authorVOs;
    }

    @Override
    public ArrayList<AuthorVO> searchAuthorsByKeyword(String keyword){
        keyword = "%" + keyword + "%";
        ArrayList<AuthorVO> authorVOs = new ArrayList<>();
        for (Author author:authorMapper.searchAuthorByKeyword(keyword)) {
            AuthorVO authorVO = new AuthorVO();
            BeanUtils.copyProperties(author, authorVO);
            Integer authorID = author.getAuthorID();
            authorVO.setBooks(booksService.getBooksByAuthorID(authorID));
            Integer categoryID = author.getCategoryID();
            authorVO.setCategoryName(categoryMapper.getNameByID(categoryID));
            authorVOs.add(authorVO);
        }
        return authorVOs;
    }

    @Override
    public ResponseVO addAuthor(AuthorInfoVO authorInfoVO) {
        return null;
    }

    @Override
    public ResponseVO updateAuthor(Integer authorID,AuthorInfoVO authorInfoVO) {
        return null;
    }

    @Override
    public AuthorVO getAuthorByID(Integer authorID) {
        Author author = authorMapper.getAuthorByID(authorID);
        AuthorVO authorVO = new AuthorVO();
        BeanUtils.copyProperties(author, authorVO);
        authorVO.setBooks(booksService.getBooksByAuthorID(authorID));
        Integer categoryID = author.getCategoryID();
        authorVO.setCategoryName(categoryMapper.getNameByID(categoryID));
        return authorVO;
    }

    @Override
    public ArrayList<AuthorVO> getAuthorByCategoryID(Integer categoryID) {
        ArrayList<AuthorVO> authorVOs = new ArrayList<>();
        for (Author author:authorMapper.getAuthorsByCategoryID(categoryID)) {
            AuthorVO authorVO = new AuthorVO();
            BeanUtils.copyProperties(author, authorVO);
            Integer authorID = author.getAuthorID();
            authorVO.setBooks(booksService.getBooksByAuthorID(authorID));
            authorVO.setCategoryName(categoryMapper.getNameByID(categoryID));
            authorVOs.add(authorVO);
        }
        return authorVOs;
    }
}

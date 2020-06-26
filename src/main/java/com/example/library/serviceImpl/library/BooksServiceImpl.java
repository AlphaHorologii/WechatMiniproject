package com.example.library.serviceImpl.library;

import com.example.library.data.library.AuthorMapper;
import com.example.library.data.library.BooksMapper;
import com.example.library.data.library.CategoryMapper;
import com.example.library.data.user.UserFavoriteMapper;
import com.example.library.po.Book;
import com.example.library.service.library.BooksService;
import com.example.library.vo.BookVO;
import com.example.library.vo.ResponseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    BooksMapper booksMapper;

    @Autowired
    AuthorMapper authorMapper;

    @Autowired
    CategoryMapper categoryMapper;

    @Autowired
    UserFavoriteMapper userFavoriteMapper;

    @Override
    public ResponseVO addBook(BookVO bookVO) {
        return null;
    }

    @Override
    public ResponseVO updateBook(Integer bookID, BookVO bookVO) {
        return null;
    }

    @Override
    public BookVO getBookByID(Integer bookID) {
        BookVO bookVO = new BookVO();
        Book book = booksMapper.getBookByID(bookID);
        BeanUtils.copyProperties(book, bookVO);
        bookVO.setAuthorName(authorMapper.getNameByID(book.getAuthorID()));
        bookVO.setCategoryName(categoryMapper.getNameByID(book.getCategoryID()));
        return bookVO;
    }

    @Override
    public ArrayList<BookVO> getBooksByCategoryID(Integer categoryID) {
        ArrayList<BookVO> bookVOs = new ArrayList<>();
        for(Book book:booksMapper.getBooksByCategoryID(categoryID)){
            BookVO bookVO = new BookVO();
            BeanUtils.copyProperties(book, bookVO);
            bookVO.setAuthorName(authorMapper.getNameByID(book.getAuthorID()));
            bookVO.setCategoryName(categoryMapper.getNameByID(book.getCategoryID()));
            bookVOs.add(bookVO);
        }
        return bookVOs;
    }

    @Override
    public ArrayList<BookVO> getBooksByAuthorID(Integer authorID) {
        ArrayList<BookVO> bookVOs = new ArrayList<>();
        for(Book book:booksMapper.getBooksByAuthorID(authorID)){
            BookVO bookVO = new BookVO();
            BeanUtils.copyProperties(book, bookVO);
            bookVO.setAuthorName(authorMapper.getNameByID(book.getAuthorID()));
            bookVO.setCategoryName(categoryMapper.getNameByID(book.getCategoryID()));
            bookVOs.add(bookVO);
        }
        return bookVOs;
    }

    @Override
    public ArrayList<BookVO> searchBooksByKeyword(String keyword){
        keyword = "%" + keyword + "%";
        ArrayList<BookVO> bookVOs = new ArrayList<>();
        for(Book book:booksMapper.searchBooksByKeyword(keyword)){
            BookVO bookVO = new BookVO();
            BeanUtils.copyProperties(book, bookVO);
            bookVO.setAuthorName(authorMapper.getNameByID(book.getAuthorID()));
            bookVO.setCategoryName(categoryMapper.getNameByID(book.getCategoryID()));
            bookVOs.add(bookVO);
        }
        return bookVOs;
    }

    @Override
    public ArrayList<BookVO> getAllBooks() {
        ArrayList<BookVO> bookVOs = new ArrayList<>();
        for(Book book:booksMapper.getAllBooks()){
            BookVO bookVO = new BookVO();
            BeanUtils.copyProperties(book, bookVO);
            bookVO.setAuthorName(authorMapper.getNameByID(book.getAuthorID()));
            bookVO.setCategoryName(categoryMapper.getNameByID(book.getCategoryID()));
            bookVOs.add(bookVO);
        }
        return bookVOs;
    }

    @Override
    public ResponseVO isUserFavorite(Integer userID, Integer bookID) {
        if(userFavoriteMapper.isUserFavorite(userID, bookID) > 0){
            return ResponseVO.buildSuccess(true);
        }
        return ResponseVO.buildSuccess(false);
    }
}

package com.example.library.bllmpl;

import com.example.library.data.author.AuthorMapper;
import com.example.library.bl.AuthorDisplayService;
import com.example.library.data.book.BookMapper;
import com.example.library.po.Author;
import com.example.library.po.Book;
import com.example.library.vo.AuthorVO;
import com.example.library.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorDisplayServiceImpl implements AuthorDisplayService {
    @Autowired
    AuthorMapper authorMapper;
    @Autowired
    BookMapper bookMapper;
    @Override
    public AuthorVO getAuthorByID(int authorID) {
        AuthorVO author=authorMapper.getAuthorById(authorID);
        List<Book> books=bookMapper.selectBooksByAuthorId(authorID);
        for(Book b:books){
            b.setAuthorName(author.getName());
        }
        author.setBooks(books);
        return  author;
    }

    @Override
    public String getAuthornameById(int authorID) {
        return authorMapper.getAuthornameById(authorID);
    }

//    public Author getAuthorByID(int authorID) {
//
//        return author;
//    }
}

package com.example.library.bllmpl;


import com.example.library.bl.BooksDisplayService;
import com.example.library.data.author.AuthorMapper;
import com.example.library.data.book.BookMapper;
import com.example.library.po.Book;
import com.example.library.vo.CategoryBookVO;
import com.example.library.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BooksDisplayServiceImpl implements BooksDisplayService {
    @Autowired
    BookMapper bookMapper;
    @Autowired
    AuthorMapper authorMapper;

    @Override
    public Book getBookByID(Integer bookID) {
        Book book= bookMapper.getBookById(bookID);
        String authorname=authorMapper.getAuthornameById(book.getAuthor_id());
        book.setAuthorName(authorname);
        return book;
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> books= bookMapper.selectAllBooks();
        for(Book b:books){
            String authorname=authorMapper.getAuthornameById(b.getAuthor_id());
            b.setAuthorName(authorname);
        }
        return books;
    }


//    public List<Book> getBooksByAuthorId(Integer authorid) {
//        return bookMapper.selectBooksByAuthorId(authorid);
//    }

    @Override
    public List<CategoryBookVO> getBooksByCategoryId(Integer categoryId) {
     List<Book> books=bookMapper.selectBooksBycategoryId(categoryId);
        for(Book b:books){
            String authorname=authorMapper.getAuthornameById(b.getAuthor_id());
            b.setAuthorName(authorname);
        }
     List<CategoryBookVO> catbooks = books.stream().map(r -> {
         CategoryBookVO bookVO = new CategoryBookVO();
         bookVO.setAuthor_id(r.getAuthor_id());
         bookVO.setAuthorName(r.getAuthorName());
         bookVO.setBookid(r.getBookid());
         bookVO.setImage(r.getImage());
         bookVO.setPubdate(r.getPubdate());
         bookVO.setRating(r.getRating());
         bookVO.setTitle(r.getTitle());
         return bookVO;
     }).collect(Collectors.toList());
     return catbooks;
    }

}

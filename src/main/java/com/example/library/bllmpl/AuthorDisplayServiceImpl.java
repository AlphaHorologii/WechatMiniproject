package com.example.library.bllmpl;

import com.example.library.data.author.AuthorMapper;
import com.example.library.bl.AuthorDisplayService;
import com.example.library.po.Author;
import com.example.library.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorDisplayServiceImpl implements AuthorDisplayService {
    @Autowired
    AuthorMapper authorMapper;
    @Override
    public Author getAuthorByID(int authorID) {
        Author author=authorMapper.getAuthorById(authorID);
        return author;
    }
}

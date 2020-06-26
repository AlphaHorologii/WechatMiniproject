package com.example.library.controller.library;

import com.example.library.service.library.AuthorService;
import com.example.library.service.library.BooksService;
import com.example.library.service.library.CategoryService;
import com.example.library.service.user.AccountService;
import com.example.library.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/library")
public class LibraryController {
    private final static String NO_PERMISSION = "您没有执行该操作的权限。";

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BooksService booksService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private AccountService accountService;

//    TODO: 管理员增加、修改图书信息和作者信息的方法
//    @GetMapping("/add/book")
//    public ResponseVO addBook(@RequestParam Integer userID,
//                              @RequestBody BookVO bookVO){
//        if(accountService.getUserInfo(userID).getUserType() != UserType.Admin)
//            return ResponseVO.buildFailure(NO_PERMISSION);
//        return booksService.addBook(bookVO);
//    }
//
//    @GetMapping("/add/author")
//    public ResponseVO addAuthor(@RequestParam Integer userID,
//                                @RequestBody AuthorInfoVO authorInfoVO){
//        if(accountService.getUserInfo(userID).getUserType() != UserType.Admin)
//            return ResponseVO.buildFailure(NO_PERMISSION);
//        return authorService.addAuthor(authorInfoVO);
//    }
//
//    @GetMapping("/update/book={bookID}")
//    public ResponseVO updateBook(@RequestParam Integer userID,
//                                 @RequestBody BookVO bookVO,
//                                 @PathVariable Integer bookID){
//        if(accountService.getUserInfo(userID).getUserType() != UserType.Admin)
//            return ResponseVO.buildFailure(NO_PERMISSION);
//        return booksService.updateBook(bookID, bookVO);
//    }
//
//    @GetMapping("/update/author={authorID}")
//    public ResponseVO updateAuthor(@RequestParam Integer userID,
//                                   @RequestBody AuthorInfoVO authorInfoVO,
//                                   @PathVariable Integer authorID){
//        if(accountService.getUserInfo(userID).getUserType() != UserType.Admin)
//            return ResponseVO.buildFailure(NO_PERMISSION);
//        return authorService.updateAuthor(authorID, authorInfoVO);
//    }

    @GetMapping("/books")
    public ResponseVO getAllBooks(){
        return ResponseVO.buildSuccess(booksService.getAllBooks());
    }

    @GetMapping("/books/book={bookID}")
    public ResponseVO getBookByID(@PathVariable Integer bookID){
        return ResponseVO.buildSuccess(booksService.getBookByID(bookID));
    }

    @GetMapping("/books/category={categoryID}")
    public ResponseVO getBooksByCategoryID(@PathVariable Integer categoryID){
        return ResponseVO.buildSuccess(booksService.getBooksByCategoryID(categoryID));
    }

    @GetMapping("/books/author={authorID}")
    public ResponseVO getBooksByAuthorID(@PathVariable Integer authorID){
        return ResponseVO.buildSuccess(booksService.getBooksByAuthorID(authorID));
    }

    @GetMapping("/books/search")
    public ResponseVO searchBooksByKeyword(@RequestParam String key){
        return ResponseVO.buildSuccess(booksService.searchBooksByKeyword(key));
    }

    @GetMapping("/books/favorite={bookID}")
    public ResponseVO isUserFavorite(@PathVariable Integer bookID,
                                     @RequestParam String userID){
        return ResponseVO.buildSuccess(booksService.isUserFavorite(Integer.parseInt(userID.split("=")[1]), bookID));
    }

    @GetMapping("/authors")
    public ResponseVO getAllAuthors(){
        return ResponseVO.buildSuccess(authorService.getAllAuthors());
    }

    @GetMapping("/authors/author={authorID}")
    public ResponseVO getAuthorByID(@PathVariable Integer authorID){
        return ResponseVO.buildSuccess(authorService.getAuthorByID(authorID));
    }

    @GetMapping("/authors/category={categoryID}")
    public ResponseVO getAuthorsByCategoryID(@PathVariable Integer categoryID){
        return ResponseVO.buildSuccess(authorService.getAuthorByCategoryID(categoryID));
    }

    @GetMapping("/authors/search")
    public ResponseVO searchAuthorsByKeyword(@RequestParam String key){
        return ResponseVO.buildSuccess(authorService.searchAuthorsByKeyword(key));
    }

    @GetMapping("/home")
    public ResponseVO showHomepage(){
        return ResponseVO.buildSuccess(categoryService.getAllCategories());
    }
}

package code81.libraryManagement.controller;

import code81.libraryManagement.entity.Book;
import code81.libraryManagement.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;
    @GetMapping
    public List<Book> getAllBooks()
    {
        return bookService.getAllBooks();
    }
    @GetMapping("/{id}")
    public Book getbookById(@PathVariable Long id)
    {
        return bookService.getBookById(id);
    }
    @PostMapping
    public Book createBook(@RequestBody Book book)
    {
        return  bookService.creatBook(book);
    }
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id , @RequestBody Book book)
    {
        return  bookService.updateBook(id , book);
    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id)
    {
        bookService.deleteBook(id);
    }
}

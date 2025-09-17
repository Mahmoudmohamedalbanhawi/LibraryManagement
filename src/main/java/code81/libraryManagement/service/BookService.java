package code81.libraryManagement.service;

import code81.libraryManagement.entity.Book;
import code81.libraryManagement.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }
    public Book creatBook(Book book)
    {
        return bookRepository.save(book);
    }
    public Book getBookById(Long id)
    {
        return bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book not found"));
    }
    public Book updateBook(Long id , Book updatedBook)
    {
        Book book = getBookById(id);
        book.setEdition(updatedBook.getEdition());
        book.setIsbn(updatedBook.getIsbn());
        book.setLanguage(updatedBook.getLanguage());
        book.setSummary(updatedBook.getSummary());
        book.setTitle(updatedBook.getTitle());
        book.setPublicationYear(updatedBook.getPublicationYear());
        book.setCoverImage(updatedBook.getCoverImage());
        return bookRepository.save(book);
    }
    public void deleteBook(Long id)
    {
        bookRepository.deleteById(id);
    }

}

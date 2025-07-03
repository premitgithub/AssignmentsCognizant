// package com.library.service;

// import com.library.model.Book;
// import com.library.repository.BookRepository;

// import java.util.List;

// public class BookService {
//     private BookRepository bookRepository = new BookRepository();

//     public List<Book> getAllBooks() {
//         return bookRepository.findAll();
//     }

//     public Book getBookById(int id) {
//         return bookRepository.findById(id);
//     }
// }
package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // You can add methods to interact with the repository here later
}



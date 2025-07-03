// package com.library.repository;

// import com.library.model.Book;
// import java.util.ArrayList;
// import java.util.List;

// public class BookRepository {
//     private List<Book> books = new ArrayList<>();

//     public BookRepository() {
//         books.add(new Book(1, "1984", "George Orwell"));
//         books.add(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
//         books.add(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));
//     }

//     public List<Book> findAll() {
//         return books;
//     }

//     public Book findById(int id) {
//         return books.stream()
//             .filter(book -> book.getId() == id)
//             .findFirst()
//             .orElse(null);
//     }
// }
package com.library.repository;

public class BookRepository {
    
}


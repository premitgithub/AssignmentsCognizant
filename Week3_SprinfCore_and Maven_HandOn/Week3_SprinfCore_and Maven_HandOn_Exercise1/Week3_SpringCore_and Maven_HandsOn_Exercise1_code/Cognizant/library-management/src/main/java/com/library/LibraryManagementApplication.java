package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load Spring context from the XML config
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the BookService bean from the context
        BookService bookService = context.getBean("bookService", BookService.class);

        // Just to test, call a method on bookService or print the object
        System.out.println("BookService bean loaded: " + bookService);

        // Close context if necessary
        ((ClassPathXmlApplicationContext) context).close();
    }
}

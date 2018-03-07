package com.example.controllers;

import com.example.model.Book;
import com.example.service.MyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/book")
public class BookController {
    private MyService myService;

    public BookController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping ("/{id}")
    public Book findOne(@PathVariable Long id){
        return myService.findOneBook(id);
    }

    @GetMapping ("/all")
    public List<Book> findAll(){
        return myService.findAllBooks();
    }
    @PostMapping ("/add")
    public Book add(@RequestBody Book book){
        if (book != null){
            return myService.addBook(book);
        }
        return null;
    }
    @DeleteMapping ("/delete")
    public Book delete(@RequestBody Long id){
        if (id != null){
            Book b = myService.findOneBook(id);
            myService.deleteBook(id);
            return b;
        }
        return null;
    }
    @PutMapping ("/update")
    public Book update(@RequestBody Book book){
        if (book != null)
        {
            return myService.updateBook(book);
        }
        return null;
    }
}

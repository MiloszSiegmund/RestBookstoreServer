package com.example.service;

import com.example.model.Book;
import com.example.model.Student;
import com.example.model.StudentBookDto;

import java.util.List;

public interface MyService {
    Student addStudent(Student student);
    Student updateStudent(Student student);
    Student deleteStudent(Long id);
    List<Student> findAllStudents();
    Student findOneStudent(Long id);
    StudentBookDto addStudentWithBook(StudentBookDto studentBookDto);


    Book addBook(Book book);
    Book updateBook(Book book);
    Book deleteBook(Long id);
    List<Book> findAllBooks();
    Book findOneBook(Long id);
}

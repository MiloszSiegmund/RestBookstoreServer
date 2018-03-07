package com.example.service;

import com.example.dao.BookDao;
import com.example.dao.StudentDao;
import com.example.model.Book;
import com.example.model.Student;
import com.example.model.StudentBookDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyServiceImpl implements MyService {

    private StudentDao studentDao;
    private BookDao bookDao;

    public MyServiceImpl(StudentDao studentDao, BookDao bookDao) {
        this.studentDao = studentDao;
        this.bookDao = bookDao;
    }

    @Override
    public Student addStudent(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student deleteStudent(Long id) {
        Student student = studentDao.findOne(id);
        studentDao.delete(student);
        return student;
    }

    @Override
    public List<Student> findAllStudents() {
        return studentDao.findAll();
    }

    @Override
    public Student findOneStudent(Long id) {
        return studentDao.findOne(id);
    }

    @Override
    public StudentBookDto addStudentWithBook(StudentBookDto studentBookDto) {
        Student student = studentDao.findStudentByNameAndSurnameAndNumber(studentBookDto.getStudentName(), studentBookDto.getStudentSurname(), studentBookDto.getStudentNumber());
        Book book = bookDao.findByTitle(studentBookDto.getBookTitle());
        student.setBook(book);
        studentDao.save(student);
        return studentBookDto;
    }

    @Override
    public Book addBook(Book book) {
        return bookDao.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookDao.save(book);
    }

    @Override
    public Book deleteBook(Long id) {
        Book book = bookDao.findOne(id);
        bookDao.delete(book);
        return book;
    }

    @Override
    public List<Book> findAllBooks() {
        return bookDao.findAll();
    }

    @Override
    public Book findOneBook(Long id) {
        return bookDao.findOne(id);
    }
}

package com.example.controllers;

import com.example.model.Student;
import com.example.model.StudentBookDto;
import com.example.service.MyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/student")
public class StudentController {

    private MyService myService;

    public StudentController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping ("/{id}")
    public Student findOne(@PathVariable Long id) {
        return myService.findOneStudent(id);
    }

    @GetMapping ("/all")
    public List<Student> findAll() {
        return myService.findAllStudents();
    }

    @PostMapping ("/add")
    public Student add(@RequestBody Student student) {
        if (student != null) {
            return myService.addStudent(student);
        }
        return null;
    }
    @DeleteMapping ("/delete")
    public Student delete(@RequestBody Long id){
        if(id != null)
        {
            Student s = myService.findOneStudent(id);
            myService.deleteStudent(id);
            return s;

        }
        return null;
    }
    @PutMapping ("/update")
    public Student update(@RequestBody Student student){
        if (student != null)
        {
            return myService.updateStudent(student);
        }
        return null;
    }
    @PostMapping ("/add/book")
    public StudentBookDto addBook(@RequestBody StudentBookDto studentBookDto){
        if (studentBookDto != null)
        {
            return myService.addStudentWithBook(studentBookDto);
        }
        return null;
    }
}

package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService service) {

        this.studentService = service;
    }

    @GetMapping
    public List<Student> getStudents() {

        return studentService.getStudents();
    }


    @GetMapping(path = "{id}")
    public ResponseEntity<String> getSingleStudent(@PathVariable("id") Long id) {
        return studentService.getSingleStudent(id);
    }


    @PostMapping
    public void postStudent(@RequestBody Student student) {
        studentService.postStudent(student);
    }

    @PutMapping(path = "{id}")
    public void updateStudent(@PathVariable("id") Long id, @RequestParam(required = false) String email, @RequestParam(required = false) String name) {
        studentService.updateStudent(id, email, name);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteStudent(id);
    }


    @GetMapping(value = "/api_check", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> liveCheck() {
        return  studentService.liveCheck();
    }




}

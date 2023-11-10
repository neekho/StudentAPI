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


    @GetMapping(value = "/api_check", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> liveCheck() {
        return  studentService.liveCheck();}


    @PostMapping(value = "/post", produces =  MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> postStudent(@RequestBody Student s) {
        return studentService.postStudent(s);}

}

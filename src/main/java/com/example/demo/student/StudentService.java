package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studenRepository;

    @Autowired
    public StudentService(StudentRepository studentRepo) {
        this.studenRepository = studentRepo;
    }

//    private Student s;
//
//    public StudentService(Student student){
//        this.s = student;
//    }


    public ResponseEntity<Object> liveCheck() {

        System.out.println("being called...");
        return ResponseEntity.ok("200 Up and Running");
    }

    public ResponseEntity<Object> postStudent(Student s) {
        Student.studentList.add(s);
        Student.studentList.forEach(System.out::println);
        return ResponseEntity.ok(s.toString());



    }

    public List<Student> getStudents() {
        return studenRepository.findAll();
    }

}

package com.example.demo.student;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.transaction.Transactional;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepo) {
        this.studentRepository = studentRepo;
    }

    public ResponseEntity<Object> liveCheck() {

        System.out.println("being called...");
        return ResponseEntity.ok("200 Up and Running");
    }


    public void postStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());

        if (studentOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }

        studentRepository.save(student);
        System.out.println(student);
    }


    @Transactional
    public void updateStudent(Long id, String email, String name) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalStateException("student id of:" + id + " does not exists"));

        if (email != null && !email.isEmpty() && !Objects.equals(student.getEmail(), email)) {

            Optional<Student> studentEmail = studentRepository.findStudentByEmail(email);

            if (studentEmail.isPresent())
                throw new IllegalStateException("email taken already");

            student.setEmail(email);

        }

        if (name != null && !name.isEmpty() && !Objects.equals(student.getName(), name)) {
            student.setName(name);


        }

    }



    public ResponseEntity<String> deleteStudent(Long id) {

        boolean exists = studentRepository.existsById(id);

        if (!exists) {

            return new ResponseEntity<String>("{\"error\": \"Student id not found\"}", HttpStatus.NOT_FOUND);
        }

        studentRepository.deleteById(id);
        return new ResponseEntity<String>("{\"message\": \"Student deleted successfully\"}", HttpStatus.OK);
    }



    public List<Student> getStudents() {
        return studentRepository.findAll();
    }




}

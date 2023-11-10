package com.example.demo.student;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = -5762551016589019721L;


    @Id
//    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private long id;

    private String email;
    private String name;

    private int age;

    private LocalDate birthDate;


    static List<Student> studentList = new ArrayList<Student>();

    public Student() {
    }

    public Student(long id, String email, String name, int age, LocalDate birthDate) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }



//    public Student(String email, String name, int age, LocalDate birthDate) {
//        this.email = email;
//        this.name = name;
//        this.age = age;
//        this.birthDate = birthDate;
//    }



















    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                '}';
    }
}

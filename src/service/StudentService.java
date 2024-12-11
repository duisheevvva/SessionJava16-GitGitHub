package service;

import models.Student;


public interface StudentService {
    void addStudent(Student student);
    List<Student> getAllStudents();
}

package dao;

import models.Student;


public interface StudentDao {

    void addStudent(Student student);

    List<Student> getAllStudents();

}

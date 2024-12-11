package dao;

import database.Database;
import models.Student;

public class StudentDaoImpl implements StudentDao{
    @Override
    public void addStudent(Student student) {
        Database.students.add(student);
    }
}

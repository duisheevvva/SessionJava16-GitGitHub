package service;

import dao.StudentDao;
import dao.StudentDaoImpl;
import models.Student;

public class StudentServiceImpl implements StudentService {

    StudentDao studentDao = new StudentDaoImpl();
    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }
}

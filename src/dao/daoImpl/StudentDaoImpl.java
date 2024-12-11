package dao.daoImpl;

import dao.StudentDao;
import database.DataBase;
import models.Student;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> getAllStudents() {
        return DataBase.students;
    }
}

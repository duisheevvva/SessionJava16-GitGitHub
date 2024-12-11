package service.serviceImpol;

import dao.StudentDao;
import dao.daoImpl.StudentDaoImpl;
import models.Student;
import service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentDao studentDao = new StudentDaoImpl();

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}

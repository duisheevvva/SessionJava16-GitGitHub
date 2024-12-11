import dao.StudentDao;
import dao.daoImpl.StudentDaoImpl;

public class Main {
    public static void main(String[] args) {

        StudentDao studentDao = new StudentDaoImpl();

        System.out.println(studentDao.getAllStudents());




    }
}
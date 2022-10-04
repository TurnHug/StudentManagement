package cn.nwnu.service.impl;

import cn.nwnu.dao.StudentDao;
import cn.nwnu.pojo.Student;
import cn.nwnu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author TurnHug
 * @date 2022/10/2 20:58
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public boolean add(Student student) {
        int flag = studentDao.add(student);
        return flag > 0;
    }

    @Override
    public boolean update(Student student) {
        int flag = studentDao.update(student);
        return flag > 0;
    }

    @Override
    public Student selectByid(int id) {
        return studentDao.selectByid(id);
    }

    @Override
    public List<Student> selectAll() {
        return studentDao.selectAll();
    }

    @Override
    public boolean delete(int id) {
        int flag = studentDao.delete(id);
        return flag > 0;
    }
}

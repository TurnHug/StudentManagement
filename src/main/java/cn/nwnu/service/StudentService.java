package cn.nwnu.service;

import cn.nwnu.pojo.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author TurnHug
 * @date 2022/10/2 20:57
 */

@Transactional
public interface StudentService {


    public boolean add(Student student);  //新增学生

    public boolean update(Student student);  //更新学生信息

    public Student selectByid(int id); //根据id查询

    public List<Student> selectAll();  //查询所有

    public boolean delete(int id);  //按id删除
}

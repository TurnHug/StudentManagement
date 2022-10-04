package cn.nwnu.service;

import cn.nwnu.config.SpringConfig;
import cn.nwnu.pojo.Student;
import cn.nwnu.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jws.soap.SOAPBinding;

/**
 * @author TurnHug
 * @date 2022/10/2 21:20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;
    @Autowired
    private UserService userService;

    @Test
    public void testselectAll(){

        //System.out.println(accountService.selectAll(2));
        System.out.println(studentService.selectAll());
    }

    @Test
    public void testselectByid(){

        //System.out.println(accountService.selectAll(2));
        System.out.println(studentService.selectByid(3));
    }

    @Test
    public void testAdd(){
        Student student = new Student();
        student.setName("白雪");
        student.setAge(20);
        student.setSex("女");
        student.setGrade("A");
        boolean b= studentService.add(student);
        System.out.println(b);

    }


    @Test
    public void testselectBySno(){

        User user = new User();
        user.setSno(202201);
        user.setPassword("baixue");
        System.out.println(userService.selectBySno(user));
    }
}

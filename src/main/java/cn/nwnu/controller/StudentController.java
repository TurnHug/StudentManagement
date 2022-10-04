package cn.nwnu.controller;

import cn.nwnu.pojo.Code;
import cn.nwnu.pojo.Master;
import cn.nwnu.pojo.Result;
import cn.nwnu.pojo.Student;
import cn.nwnu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author TurnHug
 * @date 2022/10/2 21:03
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public Result selectAll(){
        List<Student> studentList = studentService.selectAll();
        Integer code = studentList != null ? Code.SELECT_OK : Code.SELECT_ERR;
        return new Result(studentList, code);
    }

    @PostMapping
    public Result add(@RequestBody Student student){
        boolean flag = studentService.add(student);
        Integer code = flag ? Code.INSERT_OK : Code.INSERT_ERR;
        return new Result(flag,code);
    }

    @GetMapping("/{id}")
    public Result selectByid(@PathVariable int id){
        Student student = studentService.selectByid(id);
        Integer code = student != null ? Code.SELECT_OK : Code.SELECT_ERR;
        return new Result(student, code);
    }
    @PutMapping
    public Result update(@RequestBody Student student){
        boolean flag = studentService.update(student);
        Integer code = flag ? Code.UPDATE_OK:Code.UPDATE_ERR;
        return new Result(flag,code);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable int id){
        boolean flag = studentService.delete(id);
        Integer code = flag ? Code.DELETE_OK : Code.DELETE_ERR;
        return new Result(code);
    }


}

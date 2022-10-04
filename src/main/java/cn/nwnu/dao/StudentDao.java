package cn.nwnu.dao;

import cn.nwnu.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TurnHug
 * @date 2022/10/2 20:48
 */
@Repository
public interface StudentDao {

    @Insert("insert into student values (null,#{name},#{age},#{sex},#{grade});")
    int add(Student student);

    @Update("update student set name = #{name}, age = #{age}, grade = #{grade} where id = #{id}")
    int update(Student student);

    @Select("select * from student where id = #{id};")
    Student selectByid(int id);

    @Delete("delete from student where id = #{id};")
    int delete(int id);

    @Select("select * from student;")
    List<Student> selectAll();

}

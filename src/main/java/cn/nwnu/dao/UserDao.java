package cn.nwnu.dao;

import cn.nwnu.pojo.Score;
import cn.nwnu.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author TurnHug
 * @date 2022/10/3 19:11
 */
@Repository
public interface UserDao {

    @Select("select * from user where sno = #{sno} and password = #{password};")
    User selectBySno(User user);

    @Select("select sno,student.name,age,sex,grade from student,user where student.name = #{name} and user.name = #{name};")
    Score selectScore(String name);

}

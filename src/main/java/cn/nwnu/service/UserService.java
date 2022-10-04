package cn.nwnu.service;

import cn.nwnu.pojo.Score;
import cn.nwnu.pojo.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author TurnHug
 * @date 2022/10/3 19:19
 */
@Transactional
public interface UserService {

    Score selectBySno(User user);  //根据学号查询登录表

    Score selectScore();  //查询个人成绩
}

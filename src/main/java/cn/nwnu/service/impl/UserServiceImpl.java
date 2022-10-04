package cn.nwnu.service.impl;

import cn.nwnu.dao.UserDao;
import cn.nwnu.pojo.Score;
import cn.nwnu.pojo.User;
import cn.nwnu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TurnHug
 * @date 2022/10/3 19:20
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    private static String name;


    @Override
    public Score selectBySno(User user) {

        User user1 = userDao.selectBySno(user);

        if (user1 == null)
            return null;
        else {
            name = user1.getName();
            return userDao.selectScore(name);
        }

    }

    @Override
    public Score selectScore() {

        return userDao.selectScore(name);
    }


}

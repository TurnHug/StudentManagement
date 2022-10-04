package cn.nwnu.controller;

import cn.nwnu.pojo.Code;
import cn.nwnu.pojo.Result;
import cn.nwnu.pojo.Score;
import cn.nwnu.pojo.User;
import cn.nwnu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author TurnHug
 * @date 2022/10/3 19:22
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Result selectByid(@RequestBody User user){

        Score user1 = userService.selectBySno(user);


        Integer code = user1 != null ? Code.SELECT_OK : Code.SELECT_ERR;

        return new Result(user1, code);
    }

    @GetMapping
    public Result selectScore(){

        Score score = userService.selectScore();

        Integer code = score != null ? Code.SELECT_OK : Code.SELECT_ERR;

        return new Result(score, code);
    }

}

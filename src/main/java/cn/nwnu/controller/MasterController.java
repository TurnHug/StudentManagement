package cn.nwnu.controller;

import cn.nwnu.pojo.Master;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TurnHug
 * @date 2022/10/3 18:58
 */
@RestController
@RequestMapping("/masters")
public class MasterController {

    @PostMapping
    public boolean login(@RequestBody Master master){
        boolean flag = "lsx".equals(master.getUsername()) && "love".equals(master.getPassword());
        System.out.println(flag);
//        System.out.println(master.getUsername());
//        boolean flag = studentService.add(student);
        return flag ;
    }
}

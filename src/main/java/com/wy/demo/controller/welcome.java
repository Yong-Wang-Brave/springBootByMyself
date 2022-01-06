package com.wy.demo.controller;


import com.wy.demo.entity.User;
import com.wy.demo.entity.UserReq;
import com.wy.demo.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Think
 * @Title: welocome
 * @ProjectName token-authentication
 * @Description: TODO
 * @date 2019/1/1815:41
 */
@RestController
public class welcome {

    Logger logger = LoggerFactory.getLogger(com.wy.demo.controller.welcome.class);


    @Autowired
    UserMapper userMapper;

    @PostMapping("/update")
    public String welcome(@RequestBody UserReq userReq) {
        userMapper.updateUser(userReq);

        return "welcome token authentication";
    }


}

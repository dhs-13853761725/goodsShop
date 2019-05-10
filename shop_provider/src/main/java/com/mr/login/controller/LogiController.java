package com.mr.login.controller;

import com.mr.login.service.LogService;
import com.mr.pojo.User;
import com.mr.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 1115393087 on 2019/5/10.
 */
@RestController
public class LogiController {

    @Autowired
    private LogService logService;

    @RequestMapping("loginGo1")
    public ResultVo loginGo1(@RequestBody User user){
        return logService.loginGo1(user);
    }

}

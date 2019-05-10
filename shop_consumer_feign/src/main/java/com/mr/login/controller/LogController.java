package com.mr.login.controller;

import com.mr.login.service.LogSer;
import com.mr.pojo.User;
import com.mr.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 1115393087 on 2019/5/10.
 */
@RestController
public class LogController {


    @Autowired
    private LogSer logSer;



    @RequestMapping("loginMain")
    public ModelAndView loginMain(){
        ModelAndView mo = new ModelAndView();
        mo.setViewName("/login/login");
        return mo;
    }


    @RequestMapping("loginGo")
    public ResultVo loginGo(User user, HttpServletRequest request){
        ResultVo resultVo = logSer.loginGo(user);
        if(resultVo.getCode() == 200){
            request.getSession().setAttribute("userId",resultVo.getData());
        }
        return resultVo;
    }


}

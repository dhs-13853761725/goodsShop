package com.mr.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.mr.pojo.User;
import com.mr.user.service.UserService;
import com.mr.utils.ResultVo;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shun on 2019/4/29.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
/*
    @RequestMapping("")
    public String saveUser(){

    }*/
    /**
     * 跳转页面
     * @return
     */
    @RequestMapping("tiao")
    public ModelAndView tiao(){
        ModelAndView mk=new ModelAndView();
        mk.setViewName("user/register");
        return mk;
    }
    /**
     * 跳转页面
     * @return
     */
    @RequestMapping("deng")
    public ModelAndView deng(){
        ModelAndView mk=new ModelAndView();
        mk.setViewName("user/login");
        return mk;
    }
}

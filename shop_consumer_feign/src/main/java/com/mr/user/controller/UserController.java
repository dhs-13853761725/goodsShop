package com.mr.user.controller;

import com.mr.pojo.User;
import com.mr.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by shun on 2019/4/29.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "information")
    public ModelAndView information(Integer userId){
        ModelAndView mav = new ModelAndView();
        User user = userService.queryUserId(userId);
        mav.addObject("user",user);
        mav.setViewName("/user/information");
        return mav;
    }

    @RequestMapping(value = "updateUser")
    public int updateUser(User user){
        try{
            userService.updateUser(user);
            return 1;
        }catch (Exception e){
            return 2;
        }

    }

}

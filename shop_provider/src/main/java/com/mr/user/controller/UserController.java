package com.mr.user.controller;

import com.github.pagehelper.PageInfo;
import com.mr.pojo.User;
import com.mr.user.service.UserService;
import com.mr.utils.DataGridVo;
import com.mr.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by shun on 2019/4/29.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("queryUserList")
    @ResponseBody
    public DataGridVo<User> queryUserList(Page page){
        PageInfo<User> userPageInfo = userService.queryUserList(page);
        DataGridVo<User> userDataGridVo = new DataGridVo<User>(0,"",userPageInfo.getTotal(),userPageInfo.getList());
        return userDataGridVo;
    }

    @RequestMapping(value = "queryUserId")
    @ResponseBody
    public User queryUserId(@RequestParam Integer userId){
        User user = userService.queryUserId(userId);
        return user;
    }

    @RequestMapping(value = "updateUser")
    @ResponseBody
    public int updateUser(@RequestBody User user){
        int i = userService.updateUser(user);
        return i;
    }

    /**
     * 注册
     * @param user
     */
    @RequestMapping("saveUserr")
    @ResponseBody
    public Map saveUserr(@RequestBody User user){
        Map<String,String> iu=userService.saveUserr(user);
        return iu;
    }
}

package com.mr.user.controller;

import com.github.pagehelper.PageInfo;
import com.mr.pojo.Address;
import com.mr.pojo.User;
import com.mr.user.service.UserService;
import com.mr.utils.DataGridVo;
import com.mr.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

}

package com.mr.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mr.pojo.User;
import com.mr.user.mapper.UserMapper;
import com.mr.user.service.UserService;
import com.mr.utils.Page;
import com.mr.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by shun on 2019/5/6.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    private  Map<String,String> msgMap;

    @Override
    public PageInfo<User> queryUserList(Page page) {
        if(null == page){
            page = new Page();
        }
        PageHelper.startPage(page.getPage(),page.getLimit());
        page.setSort(StringUtil.underscoreName(page.getSort()));
        List<User> users = userMapper.queryUserList();
        PageInfo<User> pageInfo = new PageInfo<User>(users);
        return pageInfo;
    }

    @Override
    public User queryUserId(Integer userId) {
        User user = userMapper.queryUserId(userId);
        return user;
    }

    @Override
    public int updateUser(User user) {
        int i = userMapper.updateUser(user);
        return i;
    }
    @Override
    public Map<String, String> saveUserr(User user) {
        msgMap = new HashMap<>();
        // 对密码做正则校验
        boolean matches = Pattern.matches("\\S{6,16}", user.getUserPass());
        if (!matches) {
            msgMap.put("isSuccess", "500");
            msgMap.put("msg", "密码格式不正确,请输入66~16位!");
            return msgMap;
        }
        // 保存用户到数据库
        userMapper.saveUserr(user);
        msgMap.put("isSuccess", "200");
        msgMap.put("msg", "恭喜您 [" + user.getUserPhone() + "] 注册成功 请登录!!!");
        return msgMap;
    }
}

package com.mr.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mr.pojo.Address;
import com.mr.pojo.User;
import com.mr.user.mapper.UserMapper;
import com.mr.user.service.UserService;
import com.mr.utils.Page;
import com.mr.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shun on 2019/5/6.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

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
}

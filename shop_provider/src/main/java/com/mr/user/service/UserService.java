package com.mr.user.service;

import com.github.pagehelper.PageInfo;
import com.mr.pojo.User;
import com.mr.utils.Page;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by shun on 2019/5/6.
 */
public interface UserService {
    PageInfo<User> queryUserList(Page page);
}

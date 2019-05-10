package com.mr.user.mapper;

import com.mr.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by shun on 2019/5/6.
 */
@Mapper
public interface UserMapper {
    List<User> queryUserList();

    User queryUserId(@Param("userId") Integer userId);

    int updateUser(User user);

    void saveUserr(User user);
}

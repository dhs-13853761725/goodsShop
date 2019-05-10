package com.mr.login.mapper;

import com.mr.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by 1115393087 on 2019/5/10.
 */
@Mapper
public interface LogMapper {


    User selectByName(String userPhone);
}

package com.mr.login.service;

import com.mr.pojo.User;
import com.mr.utils.ResultVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 1115393087 on 2019/5/10.
 */
@FeignClient("PROVIDER-SHOP")
public interface LogSer {


    //登录方法
    @RequestMapping("loginGo1")
    ResultVo loginGo(@RequestBody User user);
}

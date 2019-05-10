package com.mr.login.service.impl;

import com.mr.login.mapper.LogMapper;
import com.mr.login.service.LogService;
import com.mr.pojo.User;
import com.mr.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 1115393087 on 2019/5/10.
 */
@Service
public class LogServiceImpl implements LogService {


    @Autowired
    private LogMapper logMapper;

    @Override
    public ResultVo loginGo1(User user) {
        ResultVo vo = new ResultVo();
        if(user == null){
            return vo.error(500,"帐号密码不可为空！！！");
        }
        //判断帐号
        User uu = logMapper.selectByName(user.getUserPhone());
        if(uu == null){
            return vo.error(501,"账号不存在！！请检查后重试！");
        }
        if(!uu.getUserPass().equals(user.getUserPass())){
            return vo.error(502,"密码错误，请检查重试");
        }

        vo.setData(uu.getUserId());
        vo.setCode(200);
        vo.setMsg("登录成功");
        return vo;//vo.success("登录成功！");
    }
}

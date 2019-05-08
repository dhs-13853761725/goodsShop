package com.mr.user.service;

import com.mr.pojo.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by shun on 2019/4/29.
 */
@FeignClient("PROVIDER-SHOP")
public interface UserService {

    @RequestMapping(value = "/queryComName",method = RequestMethod.GET)
    List queryComName(@RequestParam("comName") String comName);


}

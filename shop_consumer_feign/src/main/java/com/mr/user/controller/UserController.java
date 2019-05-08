package com.mr.user.controller;

import com.mr.user.service.UserService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shun on 2019/4/29.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


}

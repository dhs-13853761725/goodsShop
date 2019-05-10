package com.mr.member.controller;

import com.mr.member.service.MemberService;
import com.mr.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shun on 2019/4/29.
 */
@Controller
@RequestMapping("member")
public class MemberController {



    static {
        System.err.println("》》》》》》》》》》》》》》》》》》》》 高亮初始化完成  《《《《《《《《《《《《《《《《《《《《");
    }

    /**
     * 打开个人中心页面
     * @return
     */
    @RequestMapping("personalPage")
    public String personalPage(){
        return "personal/personal";
    }

    /**
     * 高亮搜索打开商品列表页
     * @return
     */
    @RequestMapping("searchPage")
    public String searchPage(){
        return "commodity/search";
    }

    /**
     * 打开收藏夹页面
     * @return
     */
    @RequestMapping("collectionPages")
    public String collectionPages(){
        return "collection/collection";
    }

    /**
     * 打开注册页面
     * @return
     */
    @RequestMapping("registerPage")
    public String registerPage(){
        return "user/register";
    }

    /**
     * 打开登录页面
     * @return
     */
    @RequestMapping("loginPage")
    public String loginPage(){
        return "user/login";
    }
}

package com.mr.evaluate.controller;

import com.mr.evaluate.service.EvaluateService;
import com.mr.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by wugua on 2019/5/6.
 */
@RestController
public class EvaluateController {

    @Autowired
    private EvaluateService evaluateService;


    /**
     * 查询
     * @return
     */
    @RequestMapping(value="select",method = RequestMethod.GET)
    public ModelAndView select(){
        ModelAndView mm= new ModelAndView();
        List ll =evaluateService.select();
        mm.addObject("ll",ll);
        mm.setViewName("evaluate/comment");
        return mm;
    }

    /**
     * 评价货
     * @return
     */
    @RequestMapping("selectdd")
    public ModelAndView selectdd(){
        ModelAndView mo =new ModelAndView();
        List list =evaluateService.selectdd();
        mo.addObject("list",list);
        mo.setViewName("evaluate/commentlist");
        return mo;
    }
    /**
     * 跳转页面
     * @return
     */
    @RequestMapping("pp")
    public ModelAndView pp(){
        ModelAndView mm = new ModelAndView();
        mm.setViewName("evaluate/commentlist");
        return mm;
    }

}

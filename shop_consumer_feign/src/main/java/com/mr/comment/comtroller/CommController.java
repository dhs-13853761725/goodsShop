package com.mr.comment.comtroller;

import com.mr.comment.service.ComService;
import com.mr.pojo.CommHtml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by 1115393087 on 2019/5/7.
 */
@RestController
public class CommController {

    @Autowired
    private ComService comService;

    @RequestMapping("commentlistMain")
    public ModelAndView commentlistMain(Integer orId){
        ModelAndView mo = new ModelAndView();
        List list = comService.selectComment(orId);
        mo.addObject("list",list);
        mo.setViewName("/comment/commentlist");
        return mo;
    }

    @RequestMapping("comInsert")
    public void comInsert(CommHtml commHtml){
        comService.comInsert(commHtml);
    }



}

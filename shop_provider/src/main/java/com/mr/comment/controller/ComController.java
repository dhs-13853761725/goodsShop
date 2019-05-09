package com.mr.comment.controller;

import com.mr.comment.service.ComService;
import com.mr.pojo.CommHtml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 1115393087 on 2019/5/7.
 */
@RestController
public class ComController {

    @Autowired
    private ComService comService;

    @RequestMapping("selectComment")
    public List selectComment(@RequestBody Integer orId){
        return comService.selectComment(orId);
    }

    @RequestMapping("comInsert1")
    public void comInsert1(@RequestBody CommHtml commHtml){
        comService.comInsert(commHtml);
    }

}

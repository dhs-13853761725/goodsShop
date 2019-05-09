package com.mr.discount.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.mr.discount.service.DisSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 1115393087 on 2019/5/9.
 */
@RestController
public class DisController {

    @Autowired
    private DisSer disSer;

    @RequestMapping("selectDis")
    public List selectDis(@RequestBody Integer userId){
        return disSer.selectDis(userId);
    }

    @RequestMapping("deleDiscont1")
    public void deleDiscont(@RequestBody Integer yhId){
        disSer.deleDiscont(yhId);
    }

}

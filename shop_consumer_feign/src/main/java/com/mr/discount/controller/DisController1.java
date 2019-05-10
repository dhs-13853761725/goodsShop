package com.mr.discount.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mr.discount.service.DisService;
import com.mr.pojo.YhVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 1115393087 on 2019/5/9.
 */
@RestController
public class DisController1 {

    static {
        System.err.println("》》》》》》》》》》》》》》》》》》》》  优惠卷初始化完成  《《《《《《《《《《《《《《《《《《《《");
    }

    @Autowired
    private DisService disService;

    @RequestMapping("couponMain")
    public ModelAndView couponMain(Integer userId){
        ModelAndView mo =  new ModelAndView();

        //所有优惠卷数据
        List<YhVo> list = disService.selectDis(userId);

        //可用优惠卷
        List keyong = new ArrayList();

        //不可用的优惠卷
        List bukeyong = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            YhVo vo = JSON.parseObject(JSON.toJSONString(list.get(i)),YhVo.class);
            if(vo.getYhDesc() == 1 && vo.getYhDateB().getTime() < new Date().getTime() && vo.getYhDateE().getTime() > new Date().getTime()){
                keyong.add(vo);
            }else {
                bukeyong.add(vo);
            }

        }

        //mo.addObject("list",list);
        mo.addObject("keyong",keyong);
        mo.addObject("bukeyong",bukeyong);
        mo.setViewName("/discount/coupon");
        return mo;
    }


    @RequestMapping("deleDiscont")
    public void deleDiscont(Integer yhId){
        disService.deleDiscont(yhId);
    }

}

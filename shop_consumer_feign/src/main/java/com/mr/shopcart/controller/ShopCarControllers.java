package com.mr.shopcart.controller;

import com.mr.pojo.ComUser;
import com.mr.shopcart.pojo.ResponCar;
import com.mr.shopcart.service.ShopServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by 1115393087 on 2019/4/29.
 */
@RestController
public class ShopCarControllers {

    @Autowired
    private ShopServices shopService;

    static {
        System.err.println("》》》》》》》》》》》》》》》》》》》》  购物车初始化完成  《《《《《《《《《《《《《《《《《《《《");
    }


    @RequestMapping(value = "shopcartMain",produces = "application/json")
    public ModelAndView shopcartMain1(ResponCar responCar){
        ModelAndView mo = new ModelAndView();
        List list = shopService.shopcartMain1(responCar);
        mo.addObject("list",list);
        mo.setViewName("/shopcart/shopcart");
        return  mo;
    }


    @RequestMapping("insertCarShop")
    public int insertCarShop(ResponCar car){
        shopService.insertCarShop(car);
        return 0;
    }


    @RequestMapping("seleCarShopYa")
    public int seleCarShopYa(ComUser c){
        int i = shopService.seleCarShopYa(c);
        return i;
    }


}

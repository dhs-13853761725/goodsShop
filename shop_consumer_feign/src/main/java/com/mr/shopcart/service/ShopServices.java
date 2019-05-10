package com.mr.shopcart.service;

import com.mr.pojo.ComUser;
import com.mr.shopcart.pojo.ResponCar;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by 1115393087 on 2019/4/30.
 */
@FeignClient("PROVIDER-SHOP")
@Service
public interface ShopServices {


    @RequestMapping(value = "/shopcartMain1",method = RequestMethod.GET)
    List shopcartMain1(@RequestBody ResponCar responCar);

    @RequestMapping("insertCarShop1")
    void insertCarShop(@RequestBody ResponCar car);

    @RequestMapping("seleCarShopYa1")
    int seleCarShopYa(@RequestBody ComUser c);
}

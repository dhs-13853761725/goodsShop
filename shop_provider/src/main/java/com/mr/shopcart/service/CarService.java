package com.mr.shopcart.service;


import com.mr.shopcart.pojo.ResponCar;

import java.util.List;

/**
 * Created by 1115393087 on 2019/4/29.
 */
public interface CarService {


    List queryListAll(Integer userId);

    List goodsListAll();

    void insertCarShop(ResponCar car);
}

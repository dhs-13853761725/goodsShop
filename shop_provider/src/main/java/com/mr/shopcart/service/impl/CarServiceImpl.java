package com.mr.shopcart.service.impl;

import com.mr.shopcart.mapper.CarMapper;
import com.mr.shopcart.pojo.ResponCar;
import com.mr.shopcart.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 1115393087 on 2019/4/29.
 */
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;


    @Override
    public List queryListAll(Integer userId) {
        return carMapper.queryListAll(userId);
    }

    @Override
    public List goodsListAll() {
        return carMapper.goodsListAll();
    }

    @Override
    public void insertCarShop(ResponCar car) {
        carMapper.insertCarShop(car);
    }
}

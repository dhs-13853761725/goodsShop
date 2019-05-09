package com.mr.shopcart.mapper;

import com.mr.shopcart.pojo.ResponCar;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 1115393087 on 2019/4/29.
 */
@Mapper
public interface CarMapper {

    /**
     * 查询购物车中的数据
     * @return
     */
    List queryListAll(Integer userId);

    /**
     * 查询所有的商品
     * @return
     */
    List goodsListAll();

    /**
     * 新增购物车数据
     * @param car
     */
    void insertCarShop(ResponCar car);
}

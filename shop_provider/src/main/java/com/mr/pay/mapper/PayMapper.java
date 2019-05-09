package com.mr.pay.mapper;

import com.mr.pojo.AddrUser;
import com.mr.pojo.CarComId;
import com.mr.pojo.ComUser;
import com.mr.pojo.PayOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 1115393087 on 2019/4/30.
 */
@Mapper
public interface PayMapper {

    //当前用户的所有的地址
    List payAddrList(Integer userId);

    //查询购物车中选中的商品
    List payComList(@Param("userId") Integer userId, @Param("carId") Integer carId);

    //查询默认选中的地址
    AddrUser addrId1(Integer userId);

    //查询购买商品时的地址
    AddrUser selectByAddrId(Integer addrId);

    //修改购物车中购买商品的数量
    void updateCount(CarComId carId);

    //生成支付详情
    void payOrderContent(PayOrder payOrder);

    //返回当前用户的所有订单
    List selectOrder(Integer userId);

    //删除订单
    void orderDele(Integer orId);

    //查询未支付的订单
    List selectUnpaid(Integer userId);

    //查询已支付的订单
    List selectSuccess(Integer userId);

    //根据订单的uuid去修改状态为已过期
    void updateStateKey(String key);

    //自动完成收货
    void updateAcceptKey(String key);

    //查询当前用户的订单
    List seleByYh(ComUser com);
}

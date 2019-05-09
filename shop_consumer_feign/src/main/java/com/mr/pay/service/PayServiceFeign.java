package com.mr.pay.service;

import com.mr.pojo.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 1115393087 on 2019/4/30.
 */
@FeignClient("PROVIDER-SHOP")
public interface PayServiceFeign {


        //List qweqwecomList(@RequestBody Integer userId,@RequestBody Integer carId);
    //购物车选中的东西
    @RequestMapping(value = "comList")
    List qweqwecomList(@RequestBody CarComId carComId);


    //用户上绑定的所有地址
    @RequestMapping(value = "payAddrList")
    List payAddrList(@RequestBody Integer userId);

    //地址查询
    @RequestMapping("addrId")
    AddrUser addrId(@RequestBody Integer userId);

    //查询订单传过来的地址
    @RequestMapping("selectByAddrId")
    AddrUser selectByAddrId(@RequestBody Integer addrId);

    //生成订单
    @RequestMapping("insertOrder")
    void insertOrder(@RequestBody Order order);

    //修改为支付成功状态
    @RequestMapping("updateState")
    void updateState(@RequestBody String out_trade_no);

    //修改购物车中的数量
    @RequestMapping("updateCount")
    void updateCount(@RequestBody CarComId carId);

    //回显支付金额
    @RequestMapping("selectByPrice")
    Order selectByPrice(@RequestBody String uuid);

    //添加支付详情信息
    @RequestMapping("payOrderContent")
    void payOrderContent(@RequestBody PayOrder po);

    //查询所有订单的信息
    @RequestMapping("selectOrder")
    List selectOrder(@RequestBody Integer userId);

    //删除订单
    @RequestMapping("orderDele1")
    void orderDele(@RequestBody Integer orId);

    //查询未支付的订单
    @RequestMapping("selectUnpaid")
    List selectUnpaid(@RequestBody Integer userId);

    //查询支付成功的订单
    @RequestMapping("selectSuccess")
    List selectSuccess(@RequestBody Integer userId);

    //根据uuid修改订单为 订单已过期
    @RequestMapping("updateStateKey")
    void updateStateKey(@RequestBody String key);

    //修改为已收货状态
    @RequestMapping("updateAcceptKey")
    void updateAcceptKey(@RequestBody String key);

    //获取当前用户有的优惠卷
    @RequestMapping("seleByYh")
    List seleByYh(@RequestBody ComUser com);

    //删除购物车
    @RequestMapping("deleCarShopId")
    void deleCarShopId(@RequestBody Integer carId);


    //List payComList(Integer userId, Integer carId);
}

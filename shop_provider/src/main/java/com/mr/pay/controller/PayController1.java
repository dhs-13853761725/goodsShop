package com.mr.pay.controller;


import com.mr.pay.service.PayService;
import com.mr.pojo.AddrUser;
import com.mr.pojo.CarComId;
import com.mr.pojo.ComUser;
import com.mr.pojo.PayOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by 1115393087 on 2019/4/30.
 */
@RestController
public class PayController1 {



    @Autowired
    private PayService payService;

    @RequestMapping("payAddrList")
    public List<AddrUser> payAddrList(@RequestBody Integer userId){
        return payService.payAddrList(userId);
    }


    @RequestMapping("comList")
    public List qwecomList1(@RequestBody CarComId carComId){
        return payService.payComList2(carComId.getUserId(),carComId.getCarId());
    }


    @RequestMapping("addrId")
    public AddrUser addrId1(@RequestBody Integer userId){
        return payService.addrId1(userId);
    }



    @RequestMapping("selectByAddrId")
    public AddrUser selectByAddrId(@RequestBody Integer addrId){
        return payService.selectByAddrId(addrId);
    }


    @RequestMapping("updateCount")
    public void updateCount(@RequestBody CarComId carId){
        payService.updateCount(carId);
    }


    @RequestMapping("payOrderContent")
    public void payOrderContent(@RequestBody PayOrder payOrder){
        payService.payOrderContent(payOrder);
    }

    @RequestMapping("selectOrder")
    public List selectOrder(@RequestBody Integer userId){
        return payService.selectOrder(userId);
    }

    @RequestMapping("orderDele1")
    public void orderDele1(@RequestBody Integer orId){
        payService.orderDele(orId);
    }

    @RequestMapping("selectUnpaid")
    public List selectUnpaid(@RequestBody Integer userId){
        return payService.selectUnpaid(userId);
    }

    @RequestMapping("selectSuccess")
    public List selectSuccess(@RequestBody Integer userId){
        return payService.selectSuccess(userId);
    }


    @RequestMapping("updateStateKey")
    public void updateStateKey(@RequestBody String key){
        payService.updateStateKey(key);
    }

    @RequestMapping("updateAcceptKey")
    public void updateAcceptKey(@RequestBody String key){
        payService.updateAcceptKey(key);
    }

    @RequestMapping("seleByYh")
    public List seleByYh(@RequestBody ComUser com){
        return payService.seleByYh(com);
    }

}

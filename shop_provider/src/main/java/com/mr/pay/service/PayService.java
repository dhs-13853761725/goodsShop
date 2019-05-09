package com.mr.pay.service;

import com.mr.pojo.AddrUser;
import com.mr.pojo.CarComId;
import com.mr.pojo.ComUser;
import com.mr.pojo.PayOrder;

import java.util.List;

/**
 * Created by 1115393087 on 2019/4/30.
 */
public interface PayService {


    List payAddrList(Integer userId);

    List payComList2(Integer userId, Integer carId);

    AddrUser addrId1(Integer userId);

    AddrUser selectByAddrId(Integer addrId);

    void updateCount(CarComId carId);

    void payOrderContent(PayOrder payOrder);

    List selectOrder(Integer userId);

    void orderDele(Integer orId);

    List selectUnpaid(Integer userId);

    List selectSuccess(Integer userId);

    void updateStateKey(String key);

    void updateAcceptKey(String key);

    List seleByYh(ComUser com);
}

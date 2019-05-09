package com.mr.pay.service.impl;

import com.mr.pay.mapper.PayMapper;
import com.mr.pay.service.PayService;
import com.mr.pojo.AddrUser;
import com.mr.pojo.CarComId;
import com.mr.pojo.ComUser;
import com.mr.pojo.PayOrder;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 1115393087 on 2019/4/30.
 */
@Service
public class PayServiceImpl implements PayService{


    @Autowired
    private PayMapper payMapper;

    @Override
    public List payAddrList(Integer userId) {
        return payMapper.payAddrList(userId);
    }

    @Override
    public List payComList2(Integer userId, Integer carId) {
        return payMapper.payComList(userId,carId);
    }

    @Override
    public AddrUser addrId1(Integer userId) {
        return payMapper.addrId1(userId);
    }

    @Override
    public AddrUser selectByAddrId(Integer addrId) {
        return payMapper.selectByAddrId(addrId);
    }

    @Override
    public void updateCount(CarComId carId) {
        payMapper.updateCount(carId);
    }

    @Override
    public void payOrderContent(PayOrder payOrder) {
        payMapper.payOrderContent(payOrder);
    }

    @Override
    public List selectOrder(Integer userId) {
        return payMapper.selectOrder(userId);
    }

    @Override
    public void orderDele(Integer orId) {
        payMapper.orderDele(orId);
    }

    @Override
    public List selectUnpaid(Integer userId) {
        return payMapper.selectUnpaid(userId);
    }

    @Override
    public List selectSuccess(Integer userId) {
        return payMapper.selectSuccess(userId);
    }

    @Override
    public void updateStateKey(String key) {
        payMapper.updateStateKey(key);
    }

    @Override
    public void updateAcceptKey(String key) {
        payMapper.updateAcceptKey(key);
    }

    @Override
    public List seleByYh(ComUser com) {
        return payMapper.seleByYh(com);
    }
}

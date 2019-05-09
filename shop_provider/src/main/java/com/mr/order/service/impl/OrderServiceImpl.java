package com.mr.order.service.impl;

import com.mr.order.mapper.OrderMapper;
import com.mr.order.service.OrderService;
import com.mr.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 1115393087 on 2019/5/5.
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void insertOrder(Order order) {
        orderMapper.insertOrder(order);
    }

    @Override
    public void updateState(String state) {
        orderMapper.updateState(state);
    }

    @Override
    public Order selectByPrice(String uuid) {
        return orderMapper.selectByPrice(uuid);
    }
}

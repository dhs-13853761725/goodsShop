package com.mr.order.service;

import com.mr.pojo.Order;

/**
 * Created by 1115393087 on 2019/5/5.
 */
public interface OrderService {

    void insertOrder(Order order);

    void updateState(String state);

    Order selectByPrice(String uuid);
}

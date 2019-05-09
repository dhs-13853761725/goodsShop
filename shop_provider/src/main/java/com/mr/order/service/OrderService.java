package com.mr.order.service;

import com.github.pagehelper.PageInfo;
import com.mr.pojo.Order;
import com.mr.utils.Page;

/**
 * Created by 1115393087 on 2019/5/5.
 */
public interface OrderService {

    void insertOrder(Order order);

    void updateState(String state);

    Order selectByPrice(String uuid);

    PageInfo<Order> queryOrderList(Page page);
}

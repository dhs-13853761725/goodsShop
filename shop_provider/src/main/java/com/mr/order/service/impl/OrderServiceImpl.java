package com.mr.order.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mr.order.mapper.OrderMapper;
import com.mr.order.service.OrderService;
import com.mr.pojo.Order;
import com.mr.utils.Page;
import com.mr.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public PageInfo<Order> queryOrderList(Page page) {
        if(null ==page){
            page =new Page();
        }
        PageHelper.startPage(page.getPage(),page.getLimit());
        page.setSort(StringUtil.underscoreName(page.getSort()));
        List<Order> orders= orderMapper.queryOrderList();
        PageInfo<Order> pageInfo=new PageInfo<>(orders);
        return pageInfo;
    }
}

package com.mr.order.controller;

import com.github.pagehelper.PageInfo;
import com.mr.order.service.OrderService;
import com.mr.pojo.Order;
import com.mr.utils.DataGridVo;
import com.mr.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 1115393087 on 2019/5/5.
 */
@RestController
public class OrderContro {


    @Autowired
    private OrderService orderService;

    @RequestMapping("insertOrder")
    public void insertOrder(@RequestBody Order order){
        if(order.getOrContent() == null && order.getOrContent().equals("")){
            order.setOrContent(" ");
        }
        orderService.insertOrder(order);
    }

    @RequestMapping("updateState")
    public void updateState(@RequestBody String out_trade_no){
        orderService.updateState(out_trade_no);
    }


    @RequestMapping("selectByPrice")
    public Order selectByPrice(@RequestBody String uuid){
        return orderService.selectByPrice(uuid);
    }


    @RequestMapping("queryOrderList")
    @ResponseBody
    public DataGridVo<Order> queryOrderList(Page page){
        PageInfo<Order> pageInfo = orderService.queryOrderList(page);
        DataGridVo<Order> userDataGridVo = new DataGridVo<Order>(0,"",pageInfo.getTotal(),pageInfo.getList());
        return userDataGridVo;
    }

}

package com.mr.order.mapper;

import com.mr.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 1115393087 on 2019/5/5.
 */
@Mapper
public interface OrderMapper {


    void insertOrder(Order order);

    void updateState(String state);

    Order selectByPrice(String uuid);

    List<Order> queryOrderList();

    Integer seleCarId(String state);

    void deleCarShop(Integer id);

    void updaCarShop(Integer id);
}

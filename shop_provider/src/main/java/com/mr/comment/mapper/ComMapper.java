package com.mr.comment.mapper;

import com.mr.pojo.CommHtml;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 1115393087 on 2019/5/7.
 */
@Mapper
public interface ComMapper {

    //获取指定的订单
    List selectComment(Integer orId);

    //添加一条评论
    void comInsert(CommHtml commHtml);

    //修改订单的评论状态   改为已评论
    void updateOrderState(Integer orId);
}

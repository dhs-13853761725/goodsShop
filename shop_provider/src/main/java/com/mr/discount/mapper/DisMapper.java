package com.mr.discount.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 1115393087 on 2019/5/9.
 */
@Mapper
public interface DisMapper {

    //查询所有优惠卷
    List selectDis(Integer userId);

    //删除优惠卷
    void deleDiscont(Integer yhId);
}

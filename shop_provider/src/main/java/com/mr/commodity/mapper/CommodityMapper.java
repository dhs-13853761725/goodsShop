package com.mr.commodity.mapper;

import com.mr.pojo.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by shun on 2019/5/6.
 */
@Mapper
public interface CommodityMapper {
    List<Commodity> queryCommodityList();

    Commodity queryComId(Integer comId);

    void deleteCommodityId(Integer comId);

    void updateCommodityId(Commodity commodity);

    void addCommodity(Commodity commodity);

    List<Commodity> queryCommodityList1(Commodity commodity);

    Commodity selectByCommodityId(String comId);

    List<Commodity> selectByCommodityName(@Param("comName") String comName);
}

package com.mr.commodity.service;

import com.github.pagehelper.PageInfo;
import com.mr.pojo.Commodity;
import com.mr.utils.Page;

import java.util.List;

/**
 * Created by shun on 2019/5/6.
 */
public interface CommodityService {
    PageInfo<Commodity> queryCommodityList(Page page);

    Commodity queryComId(Integer comId);

    void deleteCommodityId(Integer comId);

    void updateCommodityId(Commodity commodity);

    void addCommodity(Commodity commodity);

    Commodity selectByCommodityId(String comId);

    List<Commodity> queryCommodityList1(Commodity commodity);

    List<Commodity> solr(String comName);
}

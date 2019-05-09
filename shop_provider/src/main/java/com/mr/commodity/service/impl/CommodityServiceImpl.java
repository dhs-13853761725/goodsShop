package com.mr.commodity.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mr.commodity.mapper.CommodityMapper;
import com.mr.commodity.service.CommodityService;
import com.mr.pojo.Commodity;
import com.mr.utils.Page;
import com.mr.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shun on 2019/5/7.
 */
@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public PageInfo<Commodity> queryCommodityList(Page page) {
        if(null == page){
            page = new Page();
        }
        PageHelper.startPage(page.getPage(),page.getLimit());
        page.setSort(StringUtil.underscoreName(page.getSort()));
        List<Commodity> list = commodityMapper.queryCommodityList();
        PageInfo<Commodity> pageInfo = new PageInfo<Commodity>(list);
        return pageInfo;
    }

    @Override
    public Commodity queryComId(Integer comId) {
        return commodityMapper.queryComId(comId);
    }

    @Override
    public void deleteCommodityId(Integer comId) {
        commodityMapper.deleteCommodityId(comId);
    }

    @Override
    public void updateCommodityId(Commodity commodity) {
        commodityMapper.updateCommodityId(commodity);
    }

    @Override
    public void addCommodity(Commodity commodity) {
        commodityMapper.addCommodity(commodity);
    }

    @Override
    public Commodity selectByCommodityId(String comId) {
        return commodityMapper.selectByCommodityId(comId);
    }

    @Override
    public List<Commodity> queryCommodityList1(Commodity commodity) {
        List<Commodity> map = commodityMapper.queryCommodityList1(commodity);
        return map;
    }

    @Override
    public List<Commodity> solr(String comName) {
        List<Commodity> commodities = commodityMapper.selectByCommodityName(comName);
        return commodities;

    }
}

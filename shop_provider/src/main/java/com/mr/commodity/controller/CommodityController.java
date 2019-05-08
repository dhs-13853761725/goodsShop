package com.mr.commodity.controller;

import com.github.pagehelper.PageInfo;
import com.mr.commodity.service.CommodityService;
import com.mr.pojo.Commodity;
import com.mr.pojo.User;
import com.mr.utils.DataGridVo;
import com.mr.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by shun on 2019/5/6.
 */
@Controller
@RequestMapping("commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    /**
     * 商品列表信息
     * @param page
     * @return
     */
    @RequestMapping("queryCommodityList")
    @ResponseBody
    public DataGridVo<Commodity> queryCommodityList(Page page){
        PageInfo<Commodity> pageInfo = commodityService.queryCommodityList(page);
        DataGridVo<Commodity> commodityDataGridVo = new DataGridVo<Commodity>(0,"",pageInfo.getTotal(),pageInfo.getList());
        return commodityDataGridVo;
    }

    /**
     * 查询详情
     * @param comId
     * @return
     */
    @RequestMapping(value = "queryComId/{comId}")
    @ResponseBody
    public ModelAndView queryComId(@PathVariable("comId") Integer comId){
        ModelAndView mv = new ModelAndView();
        Commodity commodity = commodityService.queryComId(comId);
        mv.addObject("commodity",commodity);
        mv.setViewName("commodity/details");
        return mv;
    }

    /**
     * 修改回显
     * @param comId
     * @return
     */
    @RequestMapping(value = "queryComId1/{comId}")
    @ResponseBody
    public ModelAndView queryComId1(@PathVariable("comId") Integer comId){
        ModelAndView mv = new ModelAndView();
        Commodity commodity = commodityService.queryComId(comId);
        mv.addObject("commodity",commodity);
        mv.setViewName("commodity/update");
        return mv;
    }

    /**
     * 删除商品
     * @param comId
     * @return
     */
    @RequestMapping("deleteCommodityId/{comId}")
    @ResponseBody
    public String deleteCommodityId(@PathVariable("comId") Integer comId ){
        try {
            commodityService.deleteCommodityId(comId);
            return "success";
        }catch (Exception e){
            return "error";
        }
    }

    /**
     * 修改数据
     * @param commodity
     * @return
     */
    @RequestMapping("updateCommodityId")
    @ResponseBody
    public String updateCommodityId(Commodity commodity){
        try {
           commodityService.updateCommodityId(commodity);
           return "ok";
        }catch (Exception e){
            return "no";
        }
    }

    @RequestMapping("addCommodity")
    @ResponseBody
    public void addCommodity(Commodity commodity){
        commodity.setComFreight(0);
        commodityService.addCommodity(commodity);

    }

}

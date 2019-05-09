package com.mr.commodity.controller;

import com.mr.commodity.service.CommodityService;
import com.mr.pojo.Commodity;
import com.mr.user.service.UserService;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by 王美千 on 2019/4/29.
 */
@Controller
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    @ResponseBody
    @RequestMapping(value = "queryCommodityList",method = RequestMethod.GET)
    public ModelAndView queryCommodityList( Commodity commodity){
        List<Commodity> list = commodityService.queryCommodityList(commodity);
        ModelAndView mav = new ModelAndView();
        mav.addObject("list",list);
        mav.setViewName("/commodity/search");
        return mav;
    }

    @ResponseBody
    @RequestMapping(value = "selectByCommodityId")
    public ModelAndView selectByCommodityId(@RequestParam("comId") String comId) {
        Commodity commodity = commodityService.selectByCommodityId(comId);
        ModelAndView mav = new ModelAndView();
        mav.addObject("commodity",commodity);
        mav.setViewName("/commodity/introduction");
        return mav;
    }

    @ResponseBody
    @RequestMapping(value = "selectByCommodityName",produces = "application/json")
    public ModelAndView selectByCommodityName(String comName){
        ModelAndView mav = new ModelAndView();
        List list = commodityService.selectByCommodityName(comName);
        mav.addObject("list",list);
        mav.setViewName("/commodity/search");
        return mav;
    }

   /* @RequestMapping(value = "toSearch")
    public ModelAndView toSearch(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/commodity/search");
        return mav;
    }
    */



}

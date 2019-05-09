package com.mr.commodity.controller;

import com.github.pagehelper.PageInfo;
import com.mr.commodity.service.CommodityService;
import com.mr.pojo.Commodity;
import com.mr.utils.DataGridVo;
import com.mr.utils.Page;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by shun on 2019/5/6.
 */
@Controller
@RequestMapping("commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private SolrClient solrClient;

    @RequestMapping(value = "queryCommodityList1",produces = "application/json")
    @ResponseBody
    public List<Commodity> queryCommodityList1(@RequestBody Commodity commodity){
        List<Commodity> list = commodityService.queryCommodityList1(commodity);
        return list;
    }

    @RequestMapping("selectByCommodityId1")
    @ResponseBody
    public Commodity selectByCommodityId(@RequestParam("comId") String comId){
        Commodity commodity = commodityService.selectByCommodityId(comId);
        return commodity;
    }


    @RequestMapping(value = "selectByCommodityName")
    @ResponseBody
    public List<Commodity> solr(@RequestParam("comName") String comName) throws IOException, SolrServerException {

        SolrQuery query = new SolrQuery();
        query.setQuery("com_name:"+comName)
                .setHighlight(true)
                .setHighlightSimplePre("<font color='red'>")
                .setHighlightSimplePost("</font>")
                .addHighlightField("com_name");

        QueryResponse response = solrClient.query(query);
        List<Commodity> list = response.getBeans(Commodity.class);
        //System.out.println(list);

        Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();
        //System.out.println(highlighting);

        if(list!=null){
            for(int i = 0;i < list.size();i++){
                String comId = list.get(i).getComId();
                String com_name = highlighting.get(comId).get("com_name").get(0);
                list.get(i).setComName(com_name);
            }
        }
        System.out.println(list);
        return list;
    }

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

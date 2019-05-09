package com.mr.commodity.service;

import com.mr.pojo.Commodity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by 王美千 on 2019/5/9.
 */
@FeignClient("PROVIDER-SHOP")
public interface CommodityService {

    @RequestMapping(value = "/commodity/queryCommodityList1",method = RequestMethod.GET)
    List<Commodity> queryCommodityList(@RequestBody Commodity commodity);

    @RequestMapping(value = "/commodity/selectByCommodityId1",method = RequestMethod.GET)
    Commodity selectByCommodityId(@RequestParam("comId") String comId);

    @RequestMapping(value = "/commodity/selectByCommodityName",method = RequestMethod.GET)
    List selectByCommodityName(@RequestParam("comName")String comName);

}

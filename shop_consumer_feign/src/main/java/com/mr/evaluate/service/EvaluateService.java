package com.mr.evaluate.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by wugua on 2019/5/8.
 */
@FeignClient("PROVIDER-SHOP")
public interface EvaluateService {

    /**
     * 查
     * @return
     */
    @RequestMapping(value="/evaluate/selectEva",method = RequestMethod.GET)
    List select();


    @RequestMapping(value="selectddd",method = RequestMethod.GET)
    List selectdd();

}

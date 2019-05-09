package com.mr.discount.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 1115393087 on 2019/5/9.
 */
@FeignClient("PROVIDER-SHOP")
public interface DisService {

    //查询所有优惠卷
    @RequestMapping("selectDis")
    List selectDis(@RequestBody Integer userId);


    //删除优惠卷
    @RequestMapping("deleDiscont1")
    void deleDiscont(@RequestBody Integer yhId);
}

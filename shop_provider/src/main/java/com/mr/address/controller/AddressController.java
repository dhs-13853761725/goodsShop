package com.mr.address.controller;

import com.mr.address.service.AddressService;
import com.mr.pojo.Address;
import org.apache.commons.math3.analysis.function.Add;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by wugua on 2019/4/30.
 */
@RestController
public class AddressController {


    @Autowired
    private AddressService addressService;

    /**
     * 查询
     * @return
     */
    @ResponseBody
    @RequestMapping("queryListAddress")
    public List queryList(){
        List list =addressService.queryList();
        System.err.println(list);
        return list;
    }

    /**
     * 增
     * @param address
     */
    @RequestMapping("add")
    public void add(@RequestBody Address address){
        addressService.add(address);
    }


    /**
     * 回显
     * @param addressId
     * @return
     */
    @RequestMapping(value="selectIdd")
    @ResponseBody
    public Address selectIdd(Integer addressId){
        Address add =addressService.selectIdd(addressId);
        return add;
    }

    /**
     * 删除
     * @param address
     */
    @RequestMapping("deletel")
    public void deletel(@RequestParam("address") Address address){
        addressService.deletel(address.getAddressId());
    }
}

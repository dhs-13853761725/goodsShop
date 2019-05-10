package com.mr.address.service;

import com.mr.pojo.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by wugua on 2019/5/8.
 */
@FeignClient("PROVIDER-SHOP")
public interface AddressService {

    /**
     * 查询
     * @return
     */
    @RequestMapping(value = "/queryListAddress",method = RequestMethod.GET)
    List queryList();

    /**
     * 增
     * @param address
     */
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    void addd(@RequestBody Address address);

    /**
     * 回显
     * @param addressId
     * @return
     */
    @RequestMapping(value="/selectIdd",method = RequestMethod.GET)
    Address selectId(Integer addressId);

    @RequestMapping(value="deletel",method = RequestMethod.GET)
    void delete(@RequestBody Integer addressId);

    @RequestMapping("selectByAddrId1")
    Address selectByAddrId(@RequestBody Integer addressId);
}

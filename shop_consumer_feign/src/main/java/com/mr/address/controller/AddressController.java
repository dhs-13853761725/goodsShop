package com.mr.address.controller;

import com.mr.address.service.AddressService;
import com.mr.pojo.Address;
import com.mr.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by wugua on 2019/4/29.
 */
@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    /**
     * 查
     * @return
     */
    @RequestMapping(value="queryAdressList",produces = "application/json")
    public ModelAndView queryList(){
        ModelAndView mm = new ModelAndView();
        List list =addressService.queryList();
        System.err.println(list);
        mm.addObject("list",list);
        mm.setViewName("address/address");
        return mm;
    }

    /**
     * 增
     * @param address
     */
    @RequestMapping(value = "addd",method = RequestMethod.GET)
    @ResponseBody
    public int addd(Address address){
        addressService.addd(address);
        return 0;
    }

    /**
     * 跳转页面
     * @return
     */
    @RequestMapping(value="pay",produces = "application/json")
    public ModelAndView pay(){
        ModelAndView mm = new ModelAndView();
        mm.setViewName("address/pay");
        return mm;
    }


    /**
     * 回显
     * @param addressId
     * @return
     */
    @ResponseBody
    @RequestMapping(value="selectId")
    public ModelAndView selectId(Integer addressId){
        ModelAndView mm= new ModelAndView();
        Address address =  addressService.selectId(addressId);
        mm.addObject("address",address);
        mm.setViewName("address/tan");
        return mm;
    }

    /**
     * 删除
     * @param address
     */
    @RequestMapping("delete")
    public void delete(Address address){
        addressService.delete(address.getAddressId());
    }

    @RequestMapping("ss")
    public ModelAndView ss(){
        ModelAndView mmo= new ModelAndView();
        mmo.setViewName("address/tan");
        return mmo;
    }
    /**
     * 跳转页面
     * @return
     */
    @RequestMapping(value="tan",produces = "application/json")
    public ModelAndView tan(){
        ModelAndView mm = new ModelAndView();
        mm.setViewName("address/tan");
        return mm;
    }

}

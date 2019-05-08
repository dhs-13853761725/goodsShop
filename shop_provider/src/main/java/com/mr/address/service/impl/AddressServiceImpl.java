package com.mr.address.service.impl;

import com.mr.address.mapper.AddressMapper;
import com.mr.address.service.AddressService;
import com.mr.pojo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wugua on 2019/4/30.
 */
@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    private AddressMapper addressMapper;

    /**
     * 查询
     * @return
     */
    @Override
    public List queryList() {
        return addressMapper.queryList();
    }

    /**
     * 增
     * @param address
     */
    @Override
    public void add(Address address) {
        addressMapper.add(address);
    }

    /**
     * 回显
     * @param addressId
     * @return
     */
    @Override
    public Address selectIdd(Integer addressId) {
        return addressMapper.selectIdd(addressId);
    }

    /**
     * 删除
     * @param addressId
     */
    @Override
    public void deletel(Integer addressId) {
        addressMapper.deletel(addressId);
    }


}

package com.mr.address.service;

import com.mr.pojo.Address;

import java.util.List;

/**
 * Created by wugua on 2019/4/30.
 */
public interface AddressService {
    List queryList();

    void add(Address address);

    Address selectIdd(Integer addressId);

    void deletel(Integer addressId);

    Address selectByAddrId(Integer addressId);
}

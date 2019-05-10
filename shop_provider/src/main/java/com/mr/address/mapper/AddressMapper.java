package com.mr.address.mapper;

import com.mr.pojo.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by wugua on 2019/4/29.
 */
@Mapper
public interface AddressMapper {
    List queryList();

    void add(Address address);

    Address selectIdd(Integer addressId);

    void deletel(Integer addressId);

    Address selectByAddrId(Integer addressId);
}
